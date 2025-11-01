package com.org;

public class Sample6 {
	static int show() {
		try {
			//throw new NullPointerException();
			
			return 10;
		}
//		catch(Exception e) {
//			return 20;
//		}
		finally {
			return 30;
		}
	}
	public static void main(String[] args) {
		try {
		System.out.println(show());
		}
		catch(Exception e) {
			System.out.println(e);
		}

	}

}
