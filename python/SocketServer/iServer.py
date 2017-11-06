#coding:utf-8

import SocketServer

class TestSocket(SocketServer.BaseRequestHandler):
	def handle(self):
		self.data = self.request.recv(1024)
		print self.data
		self.msg = raw_input('Message> ')
		self.request.send(self.msg)

if __name__=='__main__':
	HOST = ''
	PORT = 6666
	AddrInfo = (HOST,PORT)
	server = SocketServer.ThreadingTCPServer(AddrInfo,TestSocket)
	server.serve_forever()