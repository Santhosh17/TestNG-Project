package com.auto.fileIO.textFiles;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URL;

public class ReadDataFromURL {
	public static void main(String[] args) throws IOException {
		// below code is used to read data out of any url

		URL url = new URL("https://www.york.ac.uk/teaching/cws/wws/webpage1.html");
		InputStream stream = url.openStream();
		BufferedReader reader = new BufferedReader(new InputStreamReader(stream));
		String line = reader.readLine();
		while (line != null) {
			System.out.println(line);
			line = reader.readLine();
		}

	}
}
