// Example of Exception Propagation , unchecked Exception.

package com.org;

public class Sample11 {
	void m() {
		int a=30/0;
	}
	void n() {
		m();
	}
	void p() {
		try {
			n();
		}
		catch(Exception e) {
		System.out.println(e);
		}
	}
	public static void main(String[] args) {
		Sample11 sp= new Sample11();
		sp.p();
		System.out.println("Task Done...");
		
	}

}
