/*
 * String 类型变量的使用
 *  1. String 不是基本数据类型，是引用数据类型
 *  2. 声明 String 类型变量时，使用 “”
 *  3. String 可以和 8 种基本数据类型做运算，且运算只能是连接运算，运算的结果是 String 类型
 */
public class J058_String数据类型 {
    public static void main(String[] args) {
        String s1 = "Hello Java World";

        System.out.println(s1);

        int n1 = 1001;
        String s2 = s1 + n1;

        boolean b1 = true;

        System.out.println(s2);

        s2 = s1 + b1;
        System.out.println(s2);

        // 练习1
        char c1 = 'a';
        int i1 = 10;
        s1 = "hello";
        System.out.println(c1 + i1);  // char -> int
        System.out.println(c1 + i1 + s1);   // 107hello
        System.out.println(c1 + s1 + i1);
        System.out.println(c1 + (i1 + s1));

        // 练习2
        s2 = "*";
        System.out.println(s2 + '\t' + s2);

    }    
}
