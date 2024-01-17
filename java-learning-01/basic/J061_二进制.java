/*
 * 计算机中不同进制的使用说明
 *  1. 二进制（binary）：以 0b 或者 0B 开头；
 *  2. 十进制（Decimal）
 *  3. 八进制（Octal）：以 0 开头
 *  4. 十六进制（Hex）：以 0x 或者 0X 开头
 */

public class J061_二进制 {
    public static void main(String[] args) {
        byte num1 = 0b110;
        int num2 = 110;
        int num3 = 0110;
        int num4 = 0x110;

        System.out.println("num1 = " + num1); 
        System.out.println("num2 = " + num2); 
        System.out.println("num3 = " + num3); 
        System.out.println("num4 = " + num4); 

        num1 = (byte) 0b10111011;
        System.out.println(num1);
    }    
}
