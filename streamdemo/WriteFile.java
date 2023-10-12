package com.streamdemo;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
public class WriteFile {

	public static void main(String[] args) throws IOException {
		File f=new File("input.txt");
		String str="Hello";
		FileWriter fw=new FileWriter(f);
		fw.write(str);
		fw.close();
	}

}
