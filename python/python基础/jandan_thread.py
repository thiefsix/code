#coding=utf-8

import requests
import thread
import threading
import time
from Queue import Queue
import re
import urllib
from bs4 import BeautifulSoup as BS

class jiandan(threading.Thread):
	def __init__(self,queue):
		threading.Thread.__init__(self)
		self._queue = queue

	def run(self):
		while not self._queue.empty():
			url = self._queue.get_nowait()
			self.spider(url)

	mutex = threading.Lock()
	def spider(self,url):
		# url = 'http://jandan.net/ooxx'
		headers = {'User-Agent':'ichunqiu_spider_test ver 1.0'}
		r = requests.get(url=url,headers=headers)
		# print r.status_code, len(r.content), time.ctime()
		# print r.content
		# imgs = re.findall('<img src="(.*?)" /></p>',r.content)
		# for img in imgs:
		# 	print img

		# gifs = re.findall('org_src="(.*?)" onload=',r.content)
		# for gif in gifs:
		# 	print gif
		soup = BS(r.content,'lxml')
		imgs = soup.find_all('img',attrs={})
		for img in imgs:
			if 'onload' in str(img):
				img = img['org_src']
			else:
				img = img['src']
			name = img.split('/')[-1]
			# print img
			urllib.urlretrieve(img,filename='jandan/'+name)

def main():
	threads = []
	thread_count = 10
	queue = Queue()

	for i in range(240,245):
		queue.put('http://jandan.net/ooxx/page-'+str(i)+'#comments')

	for i in range(thread_count):
		threads.append(jiandan(queue))

	for i in threads:
		i.start()
	for i in threads:
		i.join()

if __name__ == '__main__':
	main()