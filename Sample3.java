package com.org;

public class Sample3 {

	public static void main(String[] args) {
		try {
			System.out.println("Outer Try");
			int a=10/10;
			try {
				System.out.println("Inner try");
				int arr[]= {1,2,3,4,5};
				arr[5]=10;
			}
			catch (Exception e) {
				System.out.println("Exception in Inner catch "+e);
			}
		}
		catch(Exception e) {
			System.out.println("Exception in Outer catch "+e);
		}
		System.out.println("Completed Task");

	}

}
