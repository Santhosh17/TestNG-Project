package com.auto.fileIO.propertiesClass;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ReadProperties {
	public static void main(String[] args) throws IOException {
		Properties p = new Properties();
		FileInputStream fis = new FileInputStream("C:\\Personal\\Learning\\NewFolder\\ReadWrite.properties");
		p.load(fis);
		System.out.println(p.getProperty("url"));
		System.out.println(p.getProperty("username"));
		System.out.println(p.getProperty("password"));
		p.list(System.out);
	}
}