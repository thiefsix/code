#coding=utf-8

import thread
import time
from subprocess import Popen,PIPE

def ping_check(ip):
	check = Popen('ping '+ip,stdin=PIPE,stdout=PIPE)
	data = check.stdout.read()
	if 'TTL' in data:
		print '%s is up'%ip

def main():
	for i in range(1,255):
		ip = '219.153.73.'+str(i)
		thread.start_new_thread(ping_check,(ip,))
		time.sleep(0.1)

if __name__ == '__main__':
	main()