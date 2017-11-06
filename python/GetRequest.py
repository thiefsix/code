#coding:utf-8

from socket import *
import re

s = socket(AF_INET,SOCK_STREAM)
s.bind(('',8080))
s.listen(1)
sock,addr = s.accept()
data = sock.recv(1024)
print data
host = re.search(r'Host:\s(.*?)\s',data)
print host.group(1)
sock.close()
s.close()