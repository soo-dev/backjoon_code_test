package Stage_2;

import java.util.Scanner;

public class Main_2525 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int currentHour = scan.nextInt();
        int currentMinute = scan.nextInt();
        int inputMinute = scan.nextInt();

        currentMinute += inputMinute;

        // 60분 이상일때
        if(currentMinute >= 60) {
            currentHour = currentHour + currentMinute / 60;
            currentMinute = currentMinute % 60;
        }

        // 24시 이상일때
        if(currentHour / 24 > 0) {
            currentHour = currentHour % 24;
        }

        System.out.println(currentHour + " " + currentMinute);


    }
}
