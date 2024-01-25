public class Prime {
    /**
     * This program prints all prime numbers between 2 and 100000.
     */
    public class Prime {
        public static void main(String[] args) {
            int i, j;
            boolean flag;

            flag = true;
            System.out.print(2 + " ");
            for(i=3; i<=100000; i+=2) {
                for(j=2; j<i; j++) {
                    if(i%j == 0)
                        flag = false;
                }
                if(flag) {
                    System.out.print(i + " ");
                }
                flag = true;
            }

            System.out.println();
        }
    }
}
