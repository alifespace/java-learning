package Java练习;

public class ProductTable01 {
    public static void main(String[] args) {
        int i, j;
        for(i = 1; i<10; i++) {
            for(j=1; j <= 9+1-i; j++) {
                System.out.print(i + "x" + j + "= " + i*j + "\t");
            }
            System.out.println("");
        }
    } 
}
