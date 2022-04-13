package Stage_2;

import java.util.Scanner;

public class Main_14681 {
    public static void main(String[] args) {
        // 1사분면 x = 1~, y = 1~
        // 2사분면 x = -1~, y = 1~
        // 3사분면 x = -1~, y = -1~
        // 4사분면 x = 1~, y = -1~

        Scanner scan = new Scanner(System.in);
        int x = scan.nextInt();
        int y = scan.nextInt();

        if(x >= -1000 && x <= 1000 && x != 0
            && y >= -1000 && y <= 1000 && y != 0) {
            if(x > 0 && y > 0) {
                System.out.println("1");
            } else if(x < 0 && y > 0) {
                System.out.println("2");
            } else if(x < 0 && y < 0) {
                System.out.println("3");
            } else if(x > 0 && y < 0) {
                System.out.println("4");
            }
        } else {
            System.out.println("-1000 ~ 1000 범위의 수를 입력하시오. (단, 0 제외)");
        }
    }
}
