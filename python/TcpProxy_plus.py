#coding:utf-8

from socket import *
from sys import *

def Usage():
	print 'Usage:\n TcpProxy_plus.py [LPORT] [THOST] [TPORT]'

try:
	THOST = argv[2]
	TPORT = int(argv[3])
except:
	print 'Please input param.'

ServerSocket = socket(AF_INET,SOCK_STREAM)	
ClientSocket = socket(AF_INET,SOCK_STREAM)

def SetProxy(port):
	ServerSocket.bind(('',port))
	ServerSocket.listen(1)

def ProxyServer():
	ServerSock,ServerAddr = ServerSocket.accept()
	print 'Connected by ',ServerAddr
	while True:
		data = ServerSock.recv(1024)
		Rdata = ProxyClient(data)
		ServerSock.send(Rdata)

def ProxyClient(data):
	ClientSocket.connect((THOST,TPORT))
	ClientSocket.send(data)
	Rdata = ClientSocket.recv(1024)
	ClientSocket.close()
	return Rdata
	
if __name__=='__main__':
	try:
		LPORT = int(argv[1])
		SetProxy(LPORT)
		ProxyServer()
	except:
		Usage()