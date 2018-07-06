#coding=utf-8

import requests
import threading
from Queue import Queue
from BeautifulSoup import BeautifulSoup as BS

class seebug(threading.Thread):

	def __init__(self,queue):
		threading.Thread.__init__(self)
		self._queue = queue

	def run(self):
		while not self._queue.empty():
			url = self._queue.get_nowait()
			self.spider(url)

	def spider(self,url):
		headers = {'User-Agent': 'Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/61.0.3163.100 Safari/537.36'}
		r = requests.get(url=url,headers=headers,verify=False)
		print r.content

def main():
	queue = Queue()
	thread_count = 1
	threads = []

	for i in range(1,2):
		url = 'https://www.seebug.org/vuldb/vulnerabilities?page='+str(i)
		queue.put(url)

	for i in range(thread_count):
		threads.append(seebug(queue))
	for i in threads:
		i.start()
	for i in threads:
		i.join()

if __name__ == '__main__':
	main()
