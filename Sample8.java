package com.org;

import java.util.Scanner;

class InvalidAgeException extends Exception{
	InvalidAgeException(String msg){
		super(msg);
	}
}

public class Sample8 {

	public static void main(String[] args) {
		int age;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your Age");
		try {
			age=sc.nextInt();
			if(age<=18)
				throw new InvalidAgeException("Too small to vote");
			else
				System.out.println("Eligible for Voting");
		}
		catch(InvalidAgeException e) {
			System.out.println(e);
		}

	}

}
