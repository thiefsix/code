#coding=utf-8

import threading
from subprocess import Popen,PIPE
import Queue
import sys

class DoRun(threading.Thread):
	def __init__(self,queue):
		threading.Thread.__init__(self)
		self._queue = queue

	def run(self):
		while not self._queue.empty():
			ip = self._queue.get()
			#print ip
			check_ping = Popen('ping '+ip,stdin=PIPE,stdout=PIPE)
			data = check_ping.stdout.read()
			if 'TTL' in data:
				sys.stdout.write('%s is up\n'%ip)

def main():
	threads = []
	threads_count = 100
	queue = Queue.Queue()

	for i in range(1,255):
		queue.put('219.153.73.'+str(i))

	for i in range(threads_count):
		threads.append(DoRun(queue))

	for i in threads:
		i.start()

	for i in threads:
		i.join()


if __name__ == '__main__':
	main()