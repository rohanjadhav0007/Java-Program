package com.org;

class Question1 {
    public static void main(String[] args) {
        try {
            int a = 10, b = 0;
            int result = a / b; // This will throw ArithmeticException
            System.out.println("Result: " + result);
        } catch (ArithmeticException e) {
            System.out.println(e);
        } finally {
            System.out.println("Division operation completed.");
        }
    }
}
