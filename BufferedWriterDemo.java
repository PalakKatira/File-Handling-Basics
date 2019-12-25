package com.palak.filehandling_example;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

/**
 * BufferedReader:
 * 
 * 	Constructors:Only 2 constructors
 * 	 1.BufferedWriter bw=new BufferedWriter###(writer w)####;//BW can't communicate with the file dirdctly needs a writer object
 * 	 2.BufferedWriter bw=new BufferedWriter(writer w,int buffersize);
 * 
 * Methods of BufferedReader:
 * 	 1.write(int ch)
 *   2.write(char[] ch)
 *   3.flush();
 *   4.close();
 *   5write(String s)
 *   6.###newLine()-new method to insert a line separator
 * @author Surbhi
 *
 */

public class BufferedWriterDemo {

	public static void main(String[] args) throws IOException {
		
		BufferedWriter bw=new BufferedWriter(new FileWriter("shubham.txt"));
		bw.write(100);
		bw.newLine();
		bw.write("Palak and Shubham forever together");
		bw.flush();
		
		//Whenever buffered reader is closed but internally fw is closed implicitly
		
		bw.close();//opened bufferedwriter and filewriter but closed bw only.####fw will be closed internally
		//Nothing is printed to the console so no output is obtained
	}
}
