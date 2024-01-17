package Java练习;

public class J001 {
    public static void main(String[] args) {
        int i, j, k, temp;
        for(i=0; i<10; i++) {
            for(j=0; j<10; j++) {
                if(i != j) {
                    k = 1000 * i + 100 * i + 10*j + j;
                    for(temp=30; temp<100; temp++) {
                        if(k == temp*temp) {
                            System.out.println("车牌号是：" + k);
                        }
                    }
                }
            }
        }
    }
}
