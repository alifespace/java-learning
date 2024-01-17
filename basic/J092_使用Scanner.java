/*
 *  步骤：
 *      1. 导包：import java.util.Scanner;
 *      2. 实例化Scanner对象 
 *  注意：
 *      需要根据相应的方法，来输入指定类型的值。如果输入的类型不匹配，会抛异常。
 */

import java.util.Scanner;

class J092_使用Scanner {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // int num = scan.nextInt();
        System.out.print("请输入您的姓名：");
        String strName = scan.nextLine();
        System.out.println(strName);

        System.out.print("请输入您的年纪：");
        int iAge = scan.nextInt();
        System.out.println(iAge);

        scan.close();
    }
}