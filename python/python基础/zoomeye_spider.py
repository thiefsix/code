#coding=utf-8

import requests
import json

url_login = 'https://api.zoomeye.org/user/login'
data = {
		"username":"1147121947@qq.com",
		"password":"wjlO0OO0OOO0"
		}
data = json.dumps(data)

r = requests.post(url=url_login,data=data)
print r.status_code
print r.content