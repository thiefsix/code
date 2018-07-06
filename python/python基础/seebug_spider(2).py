#coding=utf-8

import requests
import threading
from Queue import Queue
from BeautifulSoup import BeautifulSoup as BS
import hackhttp
import re

# raw_start = '''
# 		GET /vuldb/vulnerabilities?page=%s HTTP/1.1
# 		Host: www.seebug.org
# 		Connection: close
# 		Upgrade-Insecure-Requests: 1
# 		User-Agent: Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/61.0.3163.100 Safari/537.36
# 		Accept: text/html,application/xhtml+xml,application/xml;q=0.9,image/webp,image/apng,*/*;q=0.8
# 		Referer: https://www.seebug.org/vuldb/vulnerabilities
# 		Accept-Encoding: gzip, deflate, br
# 		Accept-Language: zh-CN,zh;q=0.8
# 		Cookie: __jsluid=5f6eb33dc421e1a5bb15ff07bef088d4; sessionid=9h15m0oz6jpurcysoehkvvpbrdee7n8g; __jsl_clearance=1510111961.195|0|KLF26akMCn9soYbUgWZ8xSTF8wU%3D; csrftoken=fIchBMCkBIEQGkMXWrfiTFKtIHqRwhWE; Hm_lvt_6b15558d6e6f640af728f65c4a5bf687=1510023750,1510041370,1510111966; Hm_lpvt_6b15558d6e6f640af728f65c4a5bf687=1510111966
# 	'''

class seebug(threading.Thread):
	def __init__(self,queue):
		threading.Thread.__init__(self)
		self._queue = queue

	def run(self):
		while not self._queue.empty():
			data = self._queue.get_nowait()
			self.spider(data)

	def spider(self,data):
		hh = hackhttp.hackhttp()
		code, head, html, redirect, log = hh(url='https://www.seebug.org',raw=raw)
		print code

def main():
	queue = Queue()
	threads = []
	thread_count = 3

	for i in range(1,10):
		raw = '''
		GET /vuldb/vulnerabilities?page=%s HTTP/1.1
		Host: www.seebug.org
		Connection: close
		Upgrade-Insecure-Requests: 1
		User-Agent: Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/61.0.3163.100 Safari/537.36
		Accept: text/html,application/xhtml+xml,application/xml;q=0.9,image/webp,image/apng,*/*;q=0.8
		Referer: https://www.seebug.org/vuldb/vulnerabilities
		Accept-Encoding: gzip, deflate, br
		Accept-Language: zh-CN,zh;q=0.8
		Cookie: __jsluid=5f6eb33dc421e1a5bb15ff07bef088d4; sessionid=9h15m0oz6jpurcysoehkvvpbrdee7n8g; __jsl_clearance=1510111961.195|0|KLF26akMCn9soYbUgWZ8xSTF8wU%%3D; csrftoken=fIchBMCkBIEQGkMXWrfiTFKtIHqRwhWE; Hm_lvt_6b15558d6e6f640af728f65c4a5bf687=1510023750,1510041370,1510111966; Hm_lpvt_6b15558d6e6f640af728f65c4a5bf687=1510111966
	'''%i
		# print raw
		queue.put(raw)

	for i in range(thread_count):
		threads.append(seebug(queue))
	for i in threads:
		i.start()
	for i in threads:
		i.join()

if __name__ == '__main__':
	main()