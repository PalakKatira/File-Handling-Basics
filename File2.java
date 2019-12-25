package com.palak.filehandling_example;

import java.io.File;
/**
 * File methods are applicable only on file objects
 * @author Surbhi
 *
 */

public class File2 {

	public static void main(String[] args)throws Exception
	{
		File f=new File("Abc.txt");
		f.mkdir();
		System.out.println(f.isFile());//is my file representing a physical file
		System.out.println(f.isDirectory());
		
		//To display name sof files an directories in c:\Durga classes
		File f1=new File("C:\\Surbhi");
		String[] s=f.list();
		for(String s1:s) {
			System.out.println(s1);
		}
		
	}
}
