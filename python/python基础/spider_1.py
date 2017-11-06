#coding=utf-8

import re
import hackhttp
from bs4 import BeautifulSoup as BS

url = 'http://www.freebuf.com/'

hh = hackhttp.hackhttp()
code, head, html, redirect_url, log = hh.http(url)
soup = BS(html,'lxml')

bodys = soup.find_all('div',class_='main-mid main-index')

# for body in bodys:
# 	print body

news = BS(str(bodys),'lxml')
# print type(news)
# print news

news_1 = news.find_all('a',target='_blank')
# print news_1
for new in news_1:
	print new
	# print new.string

#http://www.freebuf.com/articles/system/151317.html