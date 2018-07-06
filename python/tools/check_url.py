#coding:utf-8

import sys
import requests
from bs4 import BeautifulSoup as BS

def check_conn():
	urls = []
	header = {'user-agent':'Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/61.0.3163.100 Safari/537.36'}
	# urllist = sys.argv[1]
	f = open('C:\Users\Wu\Desktop\GaoXinQu.txt','r')
	tmp = f.readlines()
	for i in tmp:
		url ='http://' + i.replace('\n','')
		urls.append(url)
	# print urls
	count = 0
	failed_count = 0
	for url in urls:
		try:
			resp = requests.get(url,headers=header,timeout=30)
			resp.raise_for_status()
			soup = BS(resp.content,'lxml',from_encoding=resp.apparent_encoding)
			title = soup.title
			print '[success]' + str(url) + '		' + str(title)
			count = count + 1
		except Exception as e:
			# print '[failure]' + url
			failed_count =  failed_count + 1
			pass
	print '\nsuccess: ' + str(count)
	print 'failure: ' + str(failed_count) 

if __name__ == '__main__':
	check_conn()