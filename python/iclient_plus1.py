#coding:utf-8
from socket import *

c = socket(AF_INET,SOCK_STREAM)
c.connect(('127.0.0.1',6666))
while True:
	cmd = raw_input('Please input a command: ')
	c.send(cmd)
	if cmd == 'exit':
		c.close()
		break
	result = c.recv(1024)
	print result