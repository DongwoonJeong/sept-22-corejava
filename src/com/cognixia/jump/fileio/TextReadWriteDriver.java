package com.cognixia.jump.fileio;

import java.io.File;
import java.io.IOException;

public class TextReadWriteDriver {
//getting started on working with files, and relative paths.
	public static void main(String[] args) {
		// relative path is generally the best thing to use because of file location
		//
		String relativeFilepath = "resources/temp.txt";
		File file = new File(relativeFilepath);

		// check if file exists at rel path location specified
		System.out.println("Does file exist?" + relativeFilepath + " :" + file.exists());
		// if file does not exist, make it
		if(!file.exists()) {
			try {
				file.createNewFile();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				System.out.println("file cannot be created");
			}
			System.out.println("File created: " + file.getName());
		}
	
	}

}
