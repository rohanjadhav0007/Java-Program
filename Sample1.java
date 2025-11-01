package com.org;

public class Sample1 {
	public static void main(String[] args) {
		try {
		int a=10;
		int b=a/0;
		System.out.println(b);
		}
		catch(Exception e){
		 System.out.println(e);
		}
		System.out.println("Completed Task");
	}
}
