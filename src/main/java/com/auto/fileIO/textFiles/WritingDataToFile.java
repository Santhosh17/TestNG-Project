package com.auto.fileIO.textFiles;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class WritingDataToFile {
	public static void main(String[] args) throws IOException {
		// write data to file
		FileWriter w = new FileWriter("C:\\Personal\\Learning\\NewFolder\\ReadWrite.txt");
		BufferedWriter bfw = new BufferedWriter(w);
		bfw.write("Hello this is 1st line written from code");
		bfw.newLine();
		bfw.write("Hello this is 2nd line written from code\n");
		bfw.write("null");
		bfw.flush(); // this will flush the stream in to the file
		bfw.close();

	}
}
//File Writer Imp Methods
//1. FileWriter - used to put the file in to file writer object
//2. BufferedWriter - used to write data to the file inside the FileWriter object
//3. write - used to write data to the file
//4. newLine - used to take the cursor to next line
//5. flush - used to flush/save the file with the provided data