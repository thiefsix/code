#coding:utf-8

from requests import get
import sys
from time import time

def Usage():
	print '[Usage]./GETDownload.py [URL]'
	
def getHTML(URL):
	html = get(URL).text
	return html
	
def saveFile(Fname,Fdata):
	f = open(Fname,'w')
	f.write(Fdata)
	f.close()
	
def getName():
	name = str(time())
	return name
	
def resetEncoding():
	reload(sys)
	sys.setdefaultencoding('utf-8')
	
if __name__=='__main__':
	#try:
		URL = sys.argv[1]
		resetEncoding()
		html = getHTML(URL)
		name = getName()
		saveFile(name+'.txt',html)
		print '[INFO]Save success!'
	#except:
		Usage()