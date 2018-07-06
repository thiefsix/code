#coding=utf-8

import exrex

'''
传入一个host，例如：demo.webdic.com ==> http://demo.webdic.com ==> http://demo.webdic.com/ ==> demo.webdic.com
那么demo，webdic可以作为字典的一部分
'''
web_white = {'com','cn','org','gov','www','edu'}

def host_para(host):
	if '://' in host:
		host = host.split('://')[1].replace('/','')

	if '/' in host:
		host = host.replace('/','')

	return host

def dic_creat(hosts):
	web_dics = hosts.split('.')
	special = list(exrex.generate('[!@#]+'))
	#取出有用的东西放入字典生成的地方，生成字典
	#我们希望将核心的生成规则写入配置文件，方便后期的扩展使用

	f_rule = open('rule.ini','r')
	for i in f_rule:
		if '#' != i[0]:
			rule = i

	for web_dic in web_dics:
		if web_dic not in web_white:
			f_pass = open('pass_0.txt','r')
			for dic_pass in f_pass:
				dics = list(exrex.generate(rule.format(web_dic=web_dic,special=special,dic_pass=dic_pass.strip('\n'))))
				for dic in dics:
					print dic

def main():
	dic_creat(host_para('http://demo.webdic.com'))

if __name__ == '__main__':
	main()