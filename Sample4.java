package com.org;

public class Sample4 {
	static void show() {
		int a=10;
		int b=0;
		if(b==0) {
			throw new ArithmeticException();
		}
		int c=a/b;
		System.out.println(c);
	}
	public static void main(String[] args) {
		try{
			show();
		}
		catch(Exception e) {
			System.out.println(e);
		}

	}

}
