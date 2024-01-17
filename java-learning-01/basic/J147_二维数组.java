/*
 * 1. 二维数组的初始化
 * 2. 如何调用指定的元素
 * 3. 如何获取数组的长度
 * 4. 如何遍历数组
 * 5. 数组元素的默认初始值
 * 6. 数组的内粗解析
 */

public class J147_二维数组 {
    public static void main(String[] args) {
        // 二维数组的初始化
        int [][] arr1 = new int[][]{{1, 2, 3}, {4, 5}, {6, 7, 8}};

        for(int i=0; i < arr1.length; i++) {
            for(int j=0; j < arr1[i].length; j++) {
                System.out.print(arr1[i][j] + ", ");
            }
            System.out.println();
        }

        // 动态初始化
        int[][] arr2 = new int[3][];

        char [][][] arr3 = new char [3][4][5];
        System.out.println(arr3[1]);
    } 
}
