/*
 * 变量的使用：
 *  1. java 定义变量的格式：数据类型 变量名 = 变量值;
 *  2. 变量需要先声明，然后才可以使用
 *  3. 变量使用前，必须显示初始化（变量没有默认初始值）
 *  4. 变量都定义在作用域内，在作用域外无效
 *  5. 同一作用域内不能声明两个同名变量
 * 
 * 变量的数据类型
 * 一、变量按照数据类型来区分
 *  1. 基本数据类型
 *      1. 数值型：byte(1)、short(2)、int(4)、long(8)、float(4)、double(8)
 *          赋值 long 型变量，必须用 “l/L" 结尾
 *          整型一般常用 int
 *          float 的精度是7位，double 的精度是14位
 *          为 float 赋值时，必须用 "f/F" 结尾
 *          浮点型一般常用 double，因为 double 的精度更高
 *      2. 字符型：char(2)
 *          通常使用''来声明字符
 *          转义字符：'\n'，'\t'
 *          unicode：'\u0123' 
 *      3. 布尔型：boolean
 *          只有true、false两个值
 *  2. 引用数据类型
 *      1. class
 *      2. interface
 *      3. 数组[]
 * 
 * 二、变量在类中声明的位置
 *  1. 成员变量
 *      实例变量（不用static修饰）
 *      类变量（用static修饰）
 *  2. 局部变量
 *      形参（方法、构造器中定义的变量）
 *      方法局部变量（在方法内定义）
 *      代码块局部变量（在代码块内定义的变量）
 *      局部变量除了形参外，其他都需要显示初始化
 */

public class J046_变量的定义 {
    public static void main(String[] args) {
        // 变量的定义
        int myAge = 12;
        // 变量的使用
        System.out.println(myAge);

        int myNumber;  // 变量的声明
        myNumber = 1001;    // 变量的赋值
        System.out.println(myNumber);
        
        // 不能在这里使用 myClass
        byte b1 = 12, b2 = -128;
        System.out.println(b1);
        System.out.println(b2);

        long l1 = 1L;
        System.out.println(l1);

        float f1 = 3.0f;
        double d1 = 4;
        System.out.println(f1);
        System.out.println(d1 + 1);

        char c1 = 'b', c2 = '\u2836';
        System.out.println(c1);
        System.out.println(c2);

        boolean bb1 = true;
        System.out.println(bb1);
    } 

    public void Method() {
        int myClass = 1;
        System.out.println(myClass);
    }
}
