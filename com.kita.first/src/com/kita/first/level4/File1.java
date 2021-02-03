package com.kita.first.level4;

import java.io.File;
import java.io.IOException;

public class File1 {
	public static void main(String[] args) {
		File file1 = new File("C:/JAVA_YM/file_test/file1.txt");
		boolean isExist = file1.exists();
		
		if(isExist == false) {
			file1.mkdirs();
			try {
				file1.createNewFile(); //throws IOException
			} catch(IOException e) {
				
			} catch(Exception e) {
				
			}
		}
		
		String file1Path = file1.getPath(); //경로
		boolean result2 = file1.isDirectory();
		boolean result3 = file1.isFile();
		
//		MultipartFile mf = new MultipartFile(""); : 스프링에서는 쓸 수 있대
	}
}
