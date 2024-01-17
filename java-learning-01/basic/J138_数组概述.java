/*
 * 数组的空间是连续的，数组长度一旦确定不能更改
 * 
 * 数组的分类
 *  1. 一维数组、二维数组
 *  2. 基本数据类型的数组，引用数据类型的数组
 * 
 * 一维数组的使用
 *  1. 声明和初始化
 *  2. 调用指定位置的元素
 *  3. 如何获取数组的长度
 *  4. 如何遍历数组元素
 *  5. 数组元素默认初始化值
 *  6. 内存中如何分配数组结构
 * 
 */

import java.lang.reflect.Array;

public class J138_数组概述 {
    public static void main (String[] args) {
        int id = 1001;

        int[] nums1;
        // 1.1 静态初始化: 数组的初始化和数组元素赋值同时进行
        nums1 = new int[] {1001, 1002, 1003, 1004};

        // 1.2 动态初始化：数组的初始化和数组元素赋值分开进行
        String[] names = new String[5];

        // 2. 如何调用指定位置的元素
        //  数组的角标从 0 开始
        names[0] = "James";
        names[1] = "Lisa";
        names[2] = "Ben";

        // 3. 如何获取数组的长度
        System.out.println(names.length);
        System.out.println(nums1.length);

        // 4. 如何遍历数组元素
        for(int i=0; i<nums1.length; i++) {
            System.out.print(nums1[i] + " ");
        }
        System.out.println();

        // 5. 数组元素默认初始化值
        //  数组元素是整型：0
        //  数组元素是浮点型：0.0
        //  数组元素是char型：ASCII = 0 
        //  boolean: false
        //  属性的默认初始化值：和数组一样
        //  引用数据类型：String null 
        int[] nums2 = new int[4];
        for(int i = 0; i < nums2.length; i++) {
            System.out.print(nums2[i] + " ");
        }
        System.out.println();
        
    }
}