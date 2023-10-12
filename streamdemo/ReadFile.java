package com.streamdemo;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class ReadFile {

	public static void main(String[] args) {
		try {
		File f=new File("input.txt");
		
			FileReader fr=new FileReader(f);
			BufferedReader br=new BufferedReader(fr);
			String str;
			while((str=br.readLine())!=null) {
				System.out.println(str);
			}
			fr.close();
			br.close();
		} 
		catch (IOException e) {
			e.printStackTrace();
		}
	
	}

}
