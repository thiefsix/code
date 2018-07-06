#coding:utf-8

import sys
import requests
import threading
import Queue
from bs4 import BeautifulSoup as BS


header = {'user-agent':'Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/61.0.3163.100 Safari/537.36'}

class check_url(threading.Thread):
	def __init__(self,queue):
		threading.Thread.__init__(self)
		self._queue = queue
		# while not self._queue.empty():
		# 	print self._queue.get()

	def run(self):
		while not self._queue.empty():
			url = self._queue.get_nowait()
			# print url
			self.check_conn(url)

	def check_conn(self,url):
		count = 0
		failed_count = 0
		# while not self._queue.empty():
		# 	url = self._queue.get_nowait()
		# 	print url
		try:
			resp = requests.get(url,headers=header,timeout=30)
			resp.raise_for_status()
			soup = BS(resp.content,'lxml',from_encoding=resp.apparent_encoding)
			title = soup.title
			# print '[success]' + str(url) + '		' + str(title)
			count = count + 1
		except Exception as e:
			print '[failure]' + url
			failed_count =  failed_count + 1
			pass
		# print '\nsuccess: ' + str(count)
		# print 'failure: ' + str(failed_count) 



def main():
	threads = []
	thread_count = 100
	queue = Queue.Queue()
	# urllist = sys.argv[1]
	f = open('C:\Users\Wu\Desktop\GaoXinQu.txt','r')
	tmp = f.readlines()
	for i in tmp:
		url ='http://' + i.replace('\n','')
		queue.put(url)
	# while not queue.empty():
	# 	print queue.get()
	for i in range(thread_count):
		threads.append(check_url(queue))
	for i in threads:
		i.start()
	for i in threads:
		i.join()

if __name__ == '__main__':
	main()
