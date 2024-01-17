/*
 * 基本数据类型之间的运算：
 * 前提：不包含 boolean 类型
 * 
 * 1. 自动类型提升：
 *      当容量小（表示数的范围大小，不是内存）的数据类型变量与容量大的数据类型变量做运算时，结果自动提升
 *      为容量大的数据类型
 *      byte, short, int, long, float, double
 *      byte, short, char 运算结果（同种类型或者混合运算）都是 int 结果
 *      
 * 2. 强制类型转换：自动类型提升运算的逆运算
 *      
 *       
 */

 public class J054_自动类型转换 {
    public static void main(String[] args) {
        byte b1 = 1;
        int i1 = 12;

        int i2 = b1 + i1;
        System.out.println(i2);

        float f1 = b1 + i1;
        System.out.println(f1);

        char c1 = 'a';
        short s1 = 2;
        i1 = s1 + b1;
        System.out.println(s1);
    }
 }