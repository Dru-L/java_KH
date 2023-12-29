package com.kh.test.io;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;

public class IOService {

	public void output1() {
//		FileOutputStream fos = null;
		FileWriter fw = null;
		try {
//			fw = new FileOutputStream("test.txt");
			fw = new FileWriter("test.txt");
			
			String str = "안녕하세요";
			for (int i = 0; i < str.length(); i++) {
				fw.write(str.charAt(i));
			}
			
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				fw.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
	}

}
