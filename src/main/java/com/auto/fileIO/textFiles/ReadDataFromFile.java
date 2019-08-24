package com.auto.fileIO.textFiles;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ReadDataFromFile {
	public static void main(String[] args) throws IOException {
		// read the data from the file
		FileReader r = new FileReader("C:\\Personal\\Learning\\NewFolder\\ReadWrite.txt");
		BufferedReader bfr = new BufferedReader(r);
//		String x = "";
			System.out.println(bfr.readLine());
			System.out.println(bfr.readLine());
			System.out.println(bfr.readLine());
			System.out.println(bfr.readLine());
//		while ((x = bfr.readLine()) != null) {
//			System.out.println(x);
//		}
			bfr.close();
	}
}
// File Reader Imp Methods
// 1. Filereader - used to put the file in to file reader object
// 2. BufferReader - used to read the file inside the filereader object
// 3. readLine - used to read the file line by line