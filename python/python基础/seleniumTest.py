#coding=utf-8

import unittest
from selenium import webdriver
from selenium.webdriver.common.keys import Keys
import threading
from Queue import Queue

# driver = webdriver.Chrome()
# driver.get('http://www.python.org')
# assert "Python" in driver.title
# elem = driver.find_element_by_name('q')
# elem.send_keys('pycon')
# elem.send_keys(Keys.RETURN)
# print driver.page_source


class PythonOrgSearch(unittest.TestCase):
	def setUp(self):
		self.driver = webdriver.Chrome()

	def test_search_in_python_org(self):
		driver = self.driver
		driver.get('https://www.seebug.org/vuldb/vulnerabilities?page=1')
		# self.assertIn('Python',driver.title)
		# elem = driver.find_element_by_name('q')
		# elem.send_keys('pycon')
		# elem.send_keys(Keys.RETURN)
		# assert 'No Result Found' not in driver.page_source
		print driver.page_source

	def tearDown(self):
		self.driver.close()

if __name__ == '__main__':
	unittest.main()


# class SeebugSearch(threading.Thread):
# 	def __init__(self,queue):
# 		threading.Thread.__init__(self)
# 		self._queue = queue

# 	def setUp(self):
# 		self.driver = webdriver.Chrome()

# 	def run(self):
# 		while not self._queue.empty():
# 			url = self._queue.get_nowait()
# 			test_search_in_seebug(url)

# 	def test_search_in_seebug(self,url):
# 		driver = self.driver
# 		driver.get(url)
# 		self.assertIn('seebug',driver.title)
# 		print driver.page_source

# 	def teardown(self):
# 		driver.close()

# def main():
# 	queue = Queue()
# 	threads = []
# 	thread_count = 3

# 	for i in range(1,11):
# 		queue.put('https://www.seebug.org/vuldb/vulnerabilities?page=1'+str(i))

# 	for i in range(thread_count):
# 		threads.append(SeebugSearch(queue))
# 	for i in threads:
# 		i.start()
# 	for i in threads:
# 		i.join()

# if __name__ == '__main__':
# 	main()