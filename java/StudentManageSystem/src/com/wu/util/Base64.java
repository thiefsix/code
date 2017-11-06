package com.wu.util;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

import sun.misc.BASE64Encoder;

public class Base64 {
	
	//base64º”√‹
		public static String Encode(String message){
			
			String res=null;
			
			try {
				MessageDigest md=MessageDigest.getInstance("md5");
				
				byte[] b=md.digest(message.getBytes());
				
				BASE64Encoder encoder=new BASE64Encoder();
				res=encoder.encode(b);
				
			} catch (NoSuchAlgorithmException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			return res;
			
		}

}
