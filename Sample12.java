// Example of Exception Propagation , checked Exception.

package com.org;

import java.io.IOException;

public class Sample12 {
	void m() throws IOException{
		int a=30/0;
	}
	void n() throws IOException {
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
		Sample12 sp=new Sample12();
		sp.p();
		System.out.println("Task Done...");

	}

}
