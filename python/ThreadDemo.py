#coding:utf-8

from threading import Thread
from time import sleep
from os import system
from time import time

def ThreadHandle(name):
	print 'Hello,',name
	
	
if __name__ == '__main__':
	for i in range(5):
		t = Thread(target=ThreadHandle,args=('i春秋',))
		sleep(0.1)
		t.start()