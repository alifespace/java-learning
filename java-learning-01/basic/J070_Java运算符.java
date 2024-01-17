/*
 * 算术运算符
 *  +, -, *, /(整除), %（取模）, ++, --, +(字符串连接) 
 * 自增不会改变变量的数据类型
 * 
 * 赋值运算符
 *  可以连续赋值
 * 
 * 比较（比较）运算符
 *  比较运算符的结果是boolean
 * 
 * 逻辑运算符（操作布尔类型，结果是布尔类型）
 *  & (逻辑与)、｜ (逻辑或)、！(逻辑非)、&&(短路逻辑与)、||(短路逻辑或)、^(逻辑异或)
 * 
 * 位运算符（操作整型数值类型，结果是数值类型）
 * <<: 左移；>>: 右移；>>> (用0去补): 无符号右移；&：与；｜: 或；^: 异或；～：取反；
 * 
 * 三元运算符
 *  表达式1，表达式2可以不同类型，但是需要能统一成一个类型；
 */
public class J070_Java运算符 {
    public static void main(String[] args) {
        float f1, f2, f3;

        f1 = 5.0f;
        f2 = f1/2;

        int num1 = 12, num2 = 5;

        System.out.println(f2);
        System.out.println(num1 / num2);
        System.out.println(num1 / num2 * num2);

        double d1 = num1 /num2;
        System.out.println(d1);
        d1 = (double) num1 /num2;
        System.out.println(d1);

        // % 取余运算
        // 结果的符号与被模数一样

        num1 = 12; num2 = 5;
        System.out.println(12 % 5);
        
        num1 = -12; num2 = 5;
        System.out.println(-12 % 5);
        
        num1 = 12; num2 = -5;
        System.out.println(12 % -5);
        
        num1 = -12; num2 = -5;
        System.out.println(-12 % -5);
        
        num1 = num2 = 12;
        System.out.println(num1 + " " + num2);

        int n = 10;
        n += (n++) + (++n);
        System.out.println(n);


        int i = 10, j = 20;
        System.out.println(i = j);

        i = 10; j = 20;
        i = i + j;
        j = i - j;
        i = i - j;
        System.out.println("i = " + i + " j = " + j);

        i = i ^ j;
        j = i ^ j;
        i = i ^ j;
        System.out.println("i = " + i + " j = " + j);

        String strResult = (i > j)? "i 大" : ((i == j)? "相等" : "j大");
        System.out.println(strResult);

        // 获取三个数的最大值
        int k = 15, max;
        max = (i > j) ? ((i > k)? i : k) : ((j > k)? j : k);
        System.out.println(max);
    }
}