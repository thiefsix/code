#coding:utf-8

from requests import get
from time import time
import sys

def Usage():
	print '[Usage]:\nGETDownload1.py [URL]'

def getHTML(URL):
	html = get(URL).text
	return html
	
def getName():
	name = str(time())
	return name
	
def saveFile(Fname,Fdata):
	f = open(Fname,'w')
	f.write(Fdata)
	f.close()
	
if __name__=='__main__':
	try:
		reload(sys)
		sys.setdefaultencoding('utf8')
		URL = sys.argv[1]
		html = getHTML(URL)
		name = getName()
		saveFile(name+'.txt',html)
	except:
		Usage()