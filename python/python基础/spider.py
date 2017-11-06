#coding=utf-8

import re
import requests
from bs4 import BeautifulSoup
from requests.packages.urllib3.exceptions import InsecureRequestWarning

requests.packages.urllib3.disable_warnings(InsecureRequestWarning)		#禁用安全警告

url = 'https://bbs.ichunqiu.com/portal.php'
headers = {
	'user-agent':'Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/61.0.3163.100 Safari/537.36'
}

r = requests.get(url,headers=headers,verify=False)

soup = BeautifulSoup(r.content,'lxml')
news = soup.find_all(name='a',attrs={'href':re.compile('https://bbs.ichunqiu.com/thread-\d*?-1-1.html')})

for new in news:
	print new.string



#https://bbs.ichunqiu.com/thread-28396-1-1.html