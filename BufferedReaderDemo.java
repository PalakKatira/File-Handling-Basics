package com.palak.filehandling_example;

import java.io.BufferedReader;
import java.io.FileReader;

/**
 * BufferedReader provides reading data line by line and not char by char
 * Most enhanced reader is BufferedReader
 * Same constructors as that of BufferedWriter
 * 
 * Methods:
 * 	1.int read();
 *  2.int read(char[] ch)
 *  void close();
 *  4.###### String readLine() until reached null;
 * @author Surbhi
 *
 */

public class BufferedReaderDemo {
	public static void main(String[] args)throws Exception {
		BufferedReader br=new BufferedReader(new FileReader("Shubham.txt"));
		String line=br.readLine();
		while(line!=null) {
			System.out.println(line);
			line=br.readLine();
		}
		}
}
