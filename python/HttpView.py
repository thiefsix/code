#coding:utf-8

import SocketServer
import re
from socket import *

ADDR = ('127.0.0.1',8080)

def getHost(DataPack):
	result = re.search(r'Host:\s(.*?)\s',DataPack)
	host = result.group(1)
	return host

class MyProxy(SocketServer.BaseRequestHandler):
	def handle(self):
		self.HttpReq = self.request.recv(1024)
		print self.HttpReq
		self.RHOST = getHost(self.HttpReq)
		newSock = socket(AF_INET,SOCK_STREAM)
		newSock.connect((str(self.RHOST),80))
		newSock.send(self.HttpReq)
		buffer = []
		while True:
			d = newSock.recv(1024)
			if d:
				buffer.append(d)
			else:
				break
		self.HttpRes = ''.join(buffer)
		self.request.sendall(self.HttpRes)

if __name__=='__main__':
	server = SocketServer.ThreadingTCPServer(ADDR,MyProxy)
	server.serve_forever()