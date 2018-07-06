#coding=utf-8

import requests
import re
from bs4 import BeautifulSoup as bs

#http://www.xicidaili.com/nn
#User-Agent:Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/61.0.3163.100 Safari/537.36

def proxy_spider():
	headers = {'User-Agent':'Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/61.0.3163.100 Safari/537.36'}

	url = 'http://www.xicidaili.com/nn'

	r = requests.get(url=url,headers=headers)
	# print r.status_code
	soup = bs(r.content,'lxml')
	datas = soup.find_all(name='tr',attrs={'class':re.compile('|[^odd]')})

	for data in datas:
		soup_proxy_content = bs(str(data),'lxml')
		soup_proxys = soup_proxy_content.find_all(name='td')
		ip = str(soup_proxys[1].string)
		port = str(soup_proxys[2].string)
		types = str(soup_proxys[5].string)
		# for i in [1,2,5]:
		# 	print soup_proxys[i].string
		proxy_check(ip,port,types)

def proxy_check(ip,port,types):
	proxy = {}
	proxy[types.lower()] = '%s:%s'%(ip,port)
	print proxy
	# proxy = {'http':'180.167.46.22:53281'}
	try:
		r = requests.get('http://1212.ip138.com/ic.asp',proxies=proxy, timeout=6)
		print r.text
		ip_content = re.findall(r'\[(.*?)\]',r.text)[0]
		if ip == ip_content:
			print proxy
	except Exception,e:
		print e
		pass

proxy_spider()