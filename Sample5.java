package com.org;
public class Sample5 {
	static void show(String str ) throws NullPointerException{
		System.out.println(str.length());
	}
	public static void main(String[] args) {
		try {
			show(null);
		}
		catch(NullPointerException e) {
			System.out.println(e);
		}
	}
}