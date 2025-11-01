package com.org;
class MultipleCatchExample {
    public static void main(String[] args) {
        try {
            String[] numbers = {"10", "20", "abc", "40"};
            
            // This will throw ArrayIndexOutOfBoundsException if index > 3
            String value = numbers[2]; 
            
            // This will throw NumberFormatException because "abc" cannot be converted to integer
            int num = Integer.parseInt(value); 
            
            System.out.println("Converted number: " + num);
        } 
        catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Error: Invalid array index accessed.");
        } 
        catch (NumberFormatException e) {
            System.out.println("Error: Cannot convert string to number.");
        } 
        finally {
            System.out.println("Execution completed.");
        }
    }
}
