/*
 * 强制类型转换：自动类型提升运算的逆运算。
 *      1. 需要使用强转符；
 *      2. 强制类型转换可能会导致精度损失；
 * 
 * 1. 编码情况
 *      1. long l1 = 123123;  (自动类型提升)
 *      2. float 一定要加f/F
 *      3. 整型常量是 int / 浮点常量是 double
 */
public class J056_强制类型转换 {
    public static void main(String[] args) {
        double d1 = 12.7;

        int i1 = (int) d1;
        System.out.println(i1);

        // 没有精度损失
        long l1 = 129;
        short s1 = (short) l1;
        System.out.println(s1);

        // 精度损失
        int i2 = 128;
        byte b1 = (byte) i2;
        System.out.println(b1);

        float f1 = 123.3f;
        System.out.println(f1);

        char c1 = 97;
        System.out.println(c1);

        i2 = c1;
        System.out.println(i2);
    } 
}
