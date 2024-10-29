package org.example;

import java.util.Scanner;  
  
public class OddEvenBinary {  
  
    // 方法：根据整数的奇偶特征生成二进制字符串  
    private static String generateBinaryString(int number) {  
        StringBuilder binary = new StringBuilder();  
        int position = 1; // 从个位开始，位置编号为1  
  
        // 将整数转换为字符串以便逐位检查  
        String numberStr = Integer.toString(number);  
  
        // 从最低位（个位）开始检查  
        for (int i = numberStr.length() - 1; i >= 0; i--) {  
            int digit = Character.getNumericValue(numberStr.charAt(i)); // 获取当前位的数字  
  
            // 检查数字和位置的奇偶性是否相同  
            if ((digit % 2 == 0 && position % 2 == 0) || (digit % 2 != 0 && position % 2 != 0)) {  
                binary.append('1'); // 如果相同，则添加1  
            } else {  
                binary.append('0'); // 如果不同，则添加0  
            }  
  
            position++; // 移动到下一个位置  
        }  
  
        // 由于我们是从低位到高位构建的二进制字符串，因此不需要反转  
        return binary.toString();  
    }  
  
    // 方法：将二进制字符串转换为十进制整数  
    private static int binaryToDecimal(String binary) {  
        int decimal = 0;  
        int power = 0;  
  
        // 从最低位（最右边）开始转换  
        for (int i = binary.length() - 1; i >= 0; i--) {  
            char bit = binary.charAt(i);  
            if (bit == '1') {  
                decimal += Math.pow(2, power); // 如果当前位是1，则加上对应的2的幂  
            }  
            power++; // 移动到下一个2的幂  
        }  
  
        return decimal;  
    }  
  
    // 主方法  
    public static void main(String[] args) {  
        Scanner scanner = new Scanner(System.in);  
        System.out.print("请输入一个非负整数: ");  
        int number = scanner.nextInt();  
        scanner.close();  
  
        // 生成二进制字符串  
        String binaryString = generateBinaryString(number);  
        System.out.println("生成的二进制字符串是: " + binaryString);  
  
        // 将二进制字符串转换为十进制整数  
        int decimalValue = binaryToDecimal(binaryString);  
        System.out.println("对应的十进制值是: " + decimalValue);  
    }  
}
