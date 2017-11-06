#coding=utf-8

import hackhttp
import re
from bs4 import BeautifulSoup as BS
import threading
from Queue import Queue
from subprocess import Popen,PIPE

raw_start = '''
POST /flaw/list.htm?flag=true HTTP/1.1
Host: www.cnvd.org.cn
User-Agent: Mozilla/5.0 (Windows NT 10.0; Win64; x64; rv:56.0) Gecko/20100101 Firefox/56.0
Accept: text/html,application/xhtml+xml,application/xml;q=0.9,*/*;q=0.8
Accept-Language: zh-CN,zh;q=0.8,en-US;q=0.5,en;q=0.3
Accept-Encoding: gzip, deflate
Content-Type: application/x-www-form-urlencoded
Content-Length: 161
Referer: http://www.cnvd.org.cn/flaw/list.htm?flag=true
Cookie: __jsluid=0d5bf3403119b8ff4320a679d9de8c26; bdshare_firstime=1508905830052; Hm_lvt_d7682ab43891c68a00de46e9ce5b76aa=1509084123; __jsl_clearance=1509519969.502|0|0ryfpnRB%2BqNG09Owmm2NNNSEbwU%3D; JSESSIONID=EB6E1905A88F5C35BB5D1CFD56D6D684
Connection: close
Upgrade-Insecure-Requests: 1

number=%E8%AF%B7%E8%BE%93%E5%85%A5%E7%B2%BE%E7%A1%AE%E7%BC%96%E5%8F%B7&startDate=&endDate=&field=&flag=%5BLjava.lang.String%3B%407ec87509&max=20&order=&offset='''
# def apache(raw):
# 	hh = hackhttp.hackhttp()
# 	code, head, html, redirect, log = hh.http('http://www.cnvd.org.cn/flaw/list.htm?flag=true', raw=raw)

# 	# print html
# 	soup = BS(html,'lxml')
# 	apache_html = soup.tbody
# 	# print apache_html
# 	apache_cnvds = BS(str(apache_html),'lxml')
# 	cnvds = apache_cnvds.find_all('a',attrs={'href':re.compile('CNVD')})
# 	# print cnvds
# 	for cnvd in cnvds:
# 		print cnvd['title']

# for page_count in range(0,920,20):
# 	raw = raw_start+str(page_count)
# 	apache(raw)

class Apache(threading.Thread):
	def __init__(self,queue):
		threading.Thread.__init__(self)
		self._queue = queue

	def run(self):
		while not self._queue.empty():
			raw = self._queue.get_nowait()
			self.apache(raw)
			# print raw

	def apache(self,raw):
		hh = hackhttp.hackhttp()
		code, head, html, redirect, log = hh.http('http://www.cnvd.org.cn/flaw/list.htm?flag=true', raw=raw)

		# print html
		soup = BS(html,'lxml')
		apache_html = soup.tbody
		# print apache_html
		apache_cnvds = BS(str(apache_html),'lxml')
		cnvds = apache_cnvds.find_all('a',attrs={'href':re.compile('CNVD')})
		# print cnvds
		for cnvd in cnvds:
			print cnvd['title']

def main():
	threads = []
	threads_count = 100
	queue = Queue()

	for page_count in range(0,920,20):
		queue.put(raw_start+str(page_count))

	for i in range(threads_count):
		threads.append(Apache(queue))

	for i in threads:
		i.start()

	for i in threads:
		i.join()

if __name__ == '__main__':
	main()
