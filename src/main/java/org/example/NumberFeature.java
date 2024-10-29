package org.example;

import java.util.Scanner;  
  
public class OddEvenBinaryValue {  
  
    public static int calculateBinaryValue(int number) {  
        int binaryValue = 0;  
        int bitPlace = 1; // Binary place value, starts at 1 (2^0) but we'll multiply it as needed  
  
        // Convert number to string to easily iterate over digits from right to left  
        String numberStr = Integer.toString(number);  
  
        // Iterate over each character in the string representation of the number  
        for (int i = numberStr.length() - 1; i >= 0; i--) {  
            int digit = Character.getNumericValue(numberStr.charAt(i)); // Get the digit value  
            int position = numberStr.length() - i; // Calculate 1-based position from right  
  
            // Check if the digit and its position have the same parity (odd/even)  
            if ((digit % 2 == 0 && position % 2 == 0) || (digit % 2 != 0 && position % 2 != 0)) {  
                binaryValue += bitPlace; // Add the current bit place value to the binary value  
            }  
  
            // Move to the next bit place in binary (equivalent to multiplying by 2)  
            bitPlace *= 2;  
        }  
  
        return binaryValue;  
    }  
  
    public static void main(String[] args) {  
        Scanner scanner = new Scanner(System.in);  
        System.out.print("Enter a non-negative integer: ");  
        int number = scanner.nextInt();  
        scanner.close();  
  
        int result = calculateBinaryValue(number);  
        System.out.println("The decimal value of the binary representation of odd/even parity is: " + result);  
    }  
}
