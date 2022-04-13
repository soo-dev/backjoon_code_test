package Stage_2;

import java.util.Scanner;

public class Main_2480 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int num_1 = sc.nextInt();
        int num_2 = sc.nextInt();
        int num_3 = sc.nextInt();


        if(num_1 <= 6 && num_2 <=6 && num_3 <=6) {
            // 같은 눈 3개
            // -> 10000 + 같은 값 * 1000
            if(num_1 == num_2 && num_1 == num_3 && num_2 == num_3) {
                System.out.println(10000 + num_1 * 1000);
            }

            // 같은 눈 2개
            // -> 1000 + 같은 값 * 100
            else if(num_1 == num_2|| num_2 == num_3) {
                System.out.println(1000 + num_2 * 100);
            } else if (num_1 == num_3) {
                System.out.println(1000 + num_1 * 100);
            }

            // 모두 다름
            // -> 최댓값 * 100
            else if(num_1 != num_2 && num_1 != num_3 && num_2 != num_3) {
                System.out.println((Math.max(Math.max(num_1, num_2), num_3)) * 100);
            }
        }
        else {
            System.out.println("주사위 눈 숫자인 1 ~ 6 사이를 입력하시오");
        }

    }
}
