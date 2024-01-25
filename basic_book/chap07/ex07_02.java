package basic_book.chap07;

import java.util.Scanner;

public class ex07_02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = "";
        // 将回车作为分隔符
        // sc.useDelimiter("\n");
        while(sc.hasNext()) {
            input = sc.next();
            if ("quit".equalsIgnoreCase(input)) {
                break;
            }
            System.out.println("键盘输入的内容是：" + input);
        }
        sc.close();
    }
}
