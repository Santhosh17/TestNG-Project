package com.auto.fileIO.propertiesClass;

import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class WriteProperties {
	public static void main(String[] args) throws IOException {
		Properties p = new Properties();
		p.setProperty("url", "www.google.com");
		p.setProperty("username", "admin");
		p.setProperty("password", "admin");
		FileOutputStream fos = new FileOutputStream("C:\\Personal\\Learning\\NewFolder\\ReadWrite.properties");
		p.store(fos, "first code checkin to prop file");
//		p.store(fos, null);
	}
}