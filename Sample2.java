package com.org;

public class Sample2 {

	public static void main(String[] args) {
		try {
			int a=10/0;
			int [] arr= {1,2,3,4,5} ;
			arr[12]=40;
//			String str=null;
//			System.out.println(str.concat("Hello"));
		}
		catch(ArithmeticException | ArrayIndexOutOfBoundsException e) {
			System.out.println(e);
		}
		catch(Exception e) {
			System.out.println(e);
		}
		System.out.println("Completed Task");
		
	}

}
