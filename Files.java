package com.amit;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Files {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		Scanner amit=new Scanner(System.in);
	File f1=new File("c:Amit.txt");	
	System.out.println("Enter the data into the file");
	String data=amit.nextLine();
	FileWriter fw=new FileWriter(f1);
	fw.write(data);
	System.out.println("Entry done");
	
	}

}
