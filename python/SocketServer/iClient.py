#coding:utf-8

from socket import *

c = socket(AF_INET,SOCK_STREAM)
c.connect(('127.0.0.1',6666))
while True:
	msg = raw_input('Message> ')
	c.send(msg)
	data = c.recv(1024)
	print data