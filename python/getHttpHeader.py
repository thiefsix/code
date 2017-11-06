#coding:utf-8

from requests import get 
import sys

def getLanguage(URL):
	language = get(URL).headers.get('x-forward-by')
	return language
	
def getServer(URL):
	server = get(URL).headers.get('server')
	return server
	
if __name__=='__main__':
	url = sys.argv[1]
	language = getLanguage(url)
	server = getServer(url)
	print '[INFO]:\n '
	print 'target',url
	print 'language:',language
	print 'server',server