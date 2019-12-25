package com.palak.filehandling_example;

import java.io.File;
import java.io.IOException;

public class File1 {

	public static void main(String[] args) throws IOException {
		//Basic program of file
		File f=new File("abc.txt");
		System.out.println(f.exists());//false,true
		
		f.createNewFile();
		/**
		 * Exists() checks whether the physical file or directory is present or not.
		 */
		System.out.println(f.exists());//true,true
		
		//Constructors in file
		
		/**
		 *File f=new File(String name);-to reepresent resorces in current working directory
		 *File f=new File(String SubDirectory,String name);
		 *File f=new File(File subdir,String name)
		 * 
		 */
		
		File f1=new File("Demo.txt");
		f1.createNewFile();//to create a physical file,return type boolean,creates a file and returns true
		
		
		//code to create a directory named with Durga123 in the current working directory
		//and create a fil named with abc.txt in that directory
		File f2=new File("Durga123");
		f2.mkdir();//To make directory and returns false if already present
		File f3=new File("Durga123","abc.text");
		
		File f5=new File(f3,"abc.txt");
		
	}
}
