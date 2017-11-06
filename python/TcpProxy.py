#coding:utf-8

from socket import *
from sys import *

def Usage():
	print '[Usage]:TcpProxy.py [LocalPort] [TargetHost] [TargetPort]'

try:
	THOST = argv[2]
	TPORT = int (argv[3])
except:
	print 'Please input param.'

MainSocket = socket(AF_INET,SOCK_STREAM)
RemoteSocket = socket(AF_INET,SOCK_STREAM)

def SetSocket(PORT):
	MainSocket.bind(('',PORT))
	MainSocket.listen(1)

def ForwardData(Data):
	RemoteSocket.connect((THOST,TPORT))
	RemoteSocket.send(Data)
	Rdata = RemoteSocket.recv(1024)
	RemoteSocket.close()
	return Rdata
	
def MainHandle():
	MainSock,MainAddr = MainSocket.accept()
	print 'Connected by ',MainAddr,'\n'
	while True:
		Ldata = MainSock.recv(1024)
		Rdata = ForwardData(Ldata)
		MainSock.send(Rdata)
		
		
	
if __name__=='__main__':
	try:
		LPORT = int (argv[1])
		SetSocket(LPORT)
		MainHandle()
	except:
		Usage()