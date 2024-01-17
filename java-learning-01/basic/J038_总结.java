/*
 * 对第一个 Java 程序进行总结
 *  1. java 程序：编写-编译-运行的过程
 *      编写；我们将编写的 java 代码保存在以 ".java" 结尾的源文件中
 *      编译：使用 javac.exe 命令编译我们的 java 源文件。格式：javac 源文件名.java
 *      运行：使用 java.exe 命令解释运行我们的字节码文件。格式：java 类名
 * 
 * 2. 一个源文件中可以有多个类，但是只能有一个类声明为 public
 *      public 声明的类必须与源文件同名
 * 
 * 3. 程序的入口是 main() 方法，格式是固定的
 * 
 * 4. 输出语句：
 *      System.out.println();  // 先输出数据，再换行
 *      System.out.print();  // 输出数据，不换行
 * 
 * 5. 每一行执行语句都以 ";" 结束。
 * 
 * 6. 编译的过程：
 *      每一个类有一个字节码文件，字节码文件的文件名与 .java 源文件中的类名相同
 * 
 * 7. 运行：
 *      只能运行包括 main() 方法的类；
 */
public class J038_总结 {
    public static void main(String[] args) {
        System.out.print("Hi, ");
        System.out.println("Hello Java World!");
    }
}

class Person {

}