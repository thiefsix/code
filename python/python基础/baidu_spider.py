#coding=utf-8

import sys
import requests
from Queue import Queue
import threading
from bs4 import BeautifulSoup as BS
import re


#User-Agent:Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/61.0.3163.100 Safari/537.36
#https://www.baidu.com/s?wd=ichunqiu&pn=10
#wd 控制关键字；pn控制页码，每页10条数据，从0开始
#程序已经没有问题了，windows下运行有问题，可以在linux下成功运行


headers = {'User-Agent':'Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/61.0.3163.100 Safari/537.36'}

class  BaiduSpider(threading.Thread):
	def __init__(self,queue):
		threading.Thread.__init__(self)
		self._queue = queue
		
	def run(self):
		while not self._queue.empty():
			url = self._queue.get()
			try:
				self.spider(url)
			except Exception,e:
				print e
				pass

	def spider(self,url):
		r = requests.get(url=url,headers=headers)
		# print r.status_code
		soup = BS(r.content,'lxml')
		urls = soup.find_all(name='a',attrs={'data-click':re.compile(('.')),'class':None})

		for url in urls:
			r_get_url = requests.get(url=url['href'],headers=headers,timeout=8)
			if r_get_url.status_code == 200:
				url_para = r_get_url.url
				url_index_tmp = url_para.split('/')
				url_index = url_index_tmp[0]+'//'+url_index_tmp[2]
				print url_index+'\n'+url_para
				f1 = open('out_para.txt','a+')
				f1.write(url_para+'\n')
				f1.close()
				with open('out_index.txt','a+') as f:
					if url_index not in f.read():
						f2 = open('out_index.txt','a+')
						f2.write(url_index+'\n')
						f2.close()



def main(keyword):
	queue = Queue()
	threads = []
	thread_count = 3

	for i in range(0,760,10):
		queue.put('https://www.baidu.com/s?wd=%s&pn=%s'%(keyword,str(i)))
	for i in range(thread_count):
		threads.append(BaiduSpider(queue))
	for i in threads:
		i.start()
	for i in threads:
		i.join()

if __name__ == '__main__':

	f1 = open('out_para.txt','w')
	f1.close()
	f2 = open('out_index.txt','w')
	f2.close()

	if len(sys.argv) != 2:
		print 'Enter:%s keyword'%sys.argv[0]
		sys.exit(-1)
	else:
		main(sys.argv[1])