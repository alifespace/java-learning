public class test {
    public static void main(String[] args) {
        int count = 0;
        for (int i = 1; i < 99; i++) {
            for (int j = i; j < 99; j++) {
                for (int k=i; k < 99; k++) {
                    if ((i+j+k) == 100 && i != j && j!=k && i!=k) {
                        count++;
                        System.out.println("count= " + count + ";   " + i + "\t" + j + "\t" + k);
                    }
                }
            }
        }
    }
}

class Test {
    public static void main(String[] args) {
        System.out.println("");
    }

    }
}
