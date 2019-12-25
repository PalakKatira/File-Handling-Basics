package com.palak.filehandling_example;

import java.io.FileNotFoundException;
import java.io.PrintWriter;

/**
 * PrintWriter is the most powerful method bw.newLine() waa problem In BW only
 * characters can be entered in BW  and numbers and text cannot be written To write
 * numbers and strings,everytime string had be passed that is bw.write("palaka")
 * we can write any type of data o the printWriter
 * 
 * 3 constructors available
 * 
 * Methods:
 * Same methods as in fw
 * 
 * @author Surbhi
 *
 */

public class PrintWriterDemo {
	public static void main(String[] args) throws FileNotFoundException {
		PrintWriter pw=new PrintWriter("abc.txt");//printWriter can access directly with the file or via FW
		pw.println("Palak and shubham forever");
	
		
	}
}
