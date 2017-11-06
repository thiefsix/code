# -*- coding: utf-8 -*-  
import requests
import re
import sys

reload(sys)
sys.setdefaultencoding('utf-8')

url = 'http://www.shiyanbar.com/'
r = requests.get(url)

print r.content