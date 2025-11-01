package com.org;

class Question2 {
    public static void main(String[] args) {
        try {
            String[] no = {"34", "24", "Rohan", ""};
            
            
            String value = no[2]; 
            
           
            int num = Integer.parseInt(value); 
            
            System.out.println("Converted number: " + num);
        } 
        catch (ArrayIndexOutOfBoundsException e) {
            System.out.println(e);
        } 
        catch (NumberFormatException e) {
            System.out.println(e);
        } 
        finally {
            System.out.println("Execution Done.....");
        }
    }
}

