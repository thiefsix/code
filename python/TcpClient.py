#coding:utf-8

from socket import *
import sys

HOST = '127.0.0.1'
PORT = int(sys.argv[1])

c = socket(AF_INET,SOCK_STREAM)
c.connect(('127.0.0.1',int(PORT)))
print 'Connect success.'
c.send('Yes or no?')
data = c.recv(1024)
print data
c.close()