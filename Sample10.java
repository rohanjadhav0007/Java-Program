package com.org;

import java.io.FileWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;

public class Sample10 {

	public static void main(String[] args) {
		try (FileWriter fr=new FileWriter("test.tex")){	
		fr.write("Jadhav Rohan ");
		
		}
		catch(Exception e) {
			System.out.println(e);
		}
	}

}
