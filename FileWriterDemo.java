package com.palak.filehandling_example;

import java.io.FileWriter;

/**
 * FileWriter writes text data to the file Total 4 constructors are available
 * 
 * Two constructors for overriding
 * 
 *  1. FileWriter fw=new FileWriter(String name)
 *  2. FileWriter fw=new FileWriter(File f);
 *   
 * Two constructors for Appending data
 * 
 * 	1. FileWriter fw=new FileWriter(String name,boolean append);//pass true if you want to append
 *  2. FileWriter fw=new FileWriter(File f,boolean append);
 * 
 * If the file is not vailable,these 4 constructors will create that file
 * 
 * Methods of file Writer: 
 *  1.write(int ch)-write single character to the file
 *  2.write(int[] ch) 
 *  3.write(String s)
 *  4.flush()-To give the guarentee that all the data including last ch will be returned to the file
 *  5.close()-to close the file
 *### Disadav->While writing prgram we have to write Line separator manually which is very difficult for the programmer
 * 
 * @author Surbhi
 *
 */

public class FileWriterDemo {
	public static void main(String[] args) throws Exception {

		FileWriter fw=new FileWriter("plk.txt",true);
		fw.write(97);
		fw.write("durga/nSoftware Solutions");
		fw.write('\n');
		char[] ch= {'a','b','c'};
		fw.write(ch);
		fw.flush();//after write important to write flush
		fw.close();//closing the file is also important
		
	}

}
