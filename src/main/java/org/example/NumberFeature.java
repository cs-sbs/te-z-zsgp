package org.example;  
  
import java.util.Scanner;  
  
public class NumberFeature {  
    public static void main(String[] args) {  
        Scanner scanner = new Scanner(System.in);  
        int number = scanner.nextInt();  
        scanner.close();  
  
        int result = 0;  
        int binaryValue = 1; // 从最右边的二进制位开始，即1号位  
  
        // 将数字转换为字符串，以便从右向左遍历每位数字  
        String numberStr = Integer.toString(number);  
  
        // 从右向左遍历数字字符串  
        for (int i = numberStr.length() - 1; i >= 0; i--) {  
            int digit = Character.getNumericValue(numberStr.charAt(i)); // 获取当前位的数字  
            int position = numberStr.length() - i; // 当前位的位置（从1开始）  
  
            // 检查数字的奇偶性与位置的奇偶性是否一致  
            if ((digit % 2 == 0 && position % 2 == 0) || (digit % 2 != 0 && position % 2 != 0)) {  
                // 如果一致，则在对应的二进制位上置1  
                result += binaryValue;  
            }  
  
            // 移动到下一个二进制位（左移一位，相当于乘以2）  
            binaryValue *= 2;  
        }  
  
        // 输出结果  
        System.out.println(result);  
    }  
}
