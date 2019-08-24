package com.auto.fileIO.textFiles;

import java.io.File;
import java.io.IOException;

public class BasicFileActions {
	public static void main(String[] args) throws IOException {
	
//			creating a directory
		File d = new File("C:\\Personal\\Learning\\NewFolder\\mys");
		d.mkdir();
		System.out.println("Absolute path = "+d.getAbsolutePath());
		System.out.println("File path = "+d);
		System.out.println("Checking file/folder exists = "+d.exists());
		System.out.println("Checking file/folder parent = "+d.getParent());
		System.out.println("Checking file/folder parent = "+d.getTotalSpace());
		System.out.println("Checking file/folder parent = "+d.getCanonicalPath());
//			d.delete();
		File n = new File("C:\\Personal\\Learning\\NewFolder\\bang");
		d.renameTo(n);
		File f = new File("C:\\Personal\\Learning\\NewFolder\\ReadWrite.t");
		f.createNewFile();
	}
}
//File Imp Methods
//1. File - used to put the file in to file  object
//2. mkdir - used to create the directory
//3. delete - used to delete to the file
//4. createNewFile - used to create new file 