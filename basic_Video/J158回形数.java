import java.util.Scanner;

public class J158回形数 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        System.out.print("请输入一个边长（整数)");
        int iLength = scan.nextInt();

        int[][] arr1 = new int[iLength][iLength];
        int currentNum = 1;

        for 
        for (int i = 0; i < iLength; i++) {
            for (int j = 0; j < iLength; j++) {
                System.out.print(arr1[i][j] + "\t");
            }
            System.out.println();
        }
    }    
}
