package com.palak.filehandling_example;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/**
 * To read data from the file
 * FleReader is the low level data reading 
 * 
 * Constructors:
 * 	1.FileReader fr=new FileReader(String Filename);
 * 	2.FileReader fr=new FileReader(File f);
 * 
 * Methods of FileReader
 * 	1.int read()-int is unicode value of character by character which is not in readable form.
 * 	2.int read(char[] ch);
 * 	3.void close();
 * 
 * Length has by default retutrn type as long
 * 
 * FileWriter and FileReader are not recommended to use because
 *  1.fw has a problem of \n
 *  2. fr reads data character by character
 * @author Surbhi
 *
 */

public class FileReaderDemo {

	public static void main(String[] args) throws IOException {
		File f=new File("Abvc.txt");
		FileReader fr=new FileReader("suru.txt");
		int i=fr.read();
		while(i!=-1) {
			System.out.println((char)i);
			i=fr.read();
		}
		fr.close();
		
		FileReader fr1=new FileReader("ABC.TEXT");
		char[] c=new char[(int)f.length()];
		fr1.read(c);
		for(char c1:c) {
			System.out.println(c1);
		}
	}
}
