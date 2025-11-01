package com.org;

class Question3 {
    public static void main(String[] args) {
        try {
            int[] arr = {10, 20, 30};
            System.out.println("Outer try block started.");

            
            int result = arr[5]; 

            
            try {
                int a = 10, b = 0;
                int division = a / b; 
                System.out.println("Result: " + division);
            } catch (ArithmeticException e) {
                System.out.println(e);
            }

        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println(e);
        } finally {
            System.out.println("Finally block executed.");
        }
    }
}

