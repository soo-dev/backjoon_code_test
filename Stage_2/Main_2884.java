package Stage_2;

import java.util.Scanner;

public class Main_2884 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int hour = scan.nextInt();
        int minute = scan.nextInt();
        int earlyMinute = minute + 60 - 45;

        // logic hour >= 0 && hour <=23 && minute >= 0 && minute <= 59
        if(hour >= 0 && hour <=23 && minute >= 0 && minute <= 59) {
            // 1) hour == 0
            if(hour == 0) {
                //  1-1) minute < 45 -> earlyMinute
                if(minute < 45) {
                    System.out.println(hour + 24 -1);
                    System.out.println(earlyMinute);

                    //  1-2) minute >= 45 -> minute - 45
                } else {
                    System.out.println(hour);
                    System.out.println(minute - 45);
                }

                // 2) hour > 0 && hour <= 23
            } else{
                //  2-1) minute < 45 -> earlyMinute
                if (minute < 45) {
                    System.out.println(hour - 1);
                    System.out.println(earlyMinute);

                //  2-2) minute >= 45 -> minute - 45
                } else {
                    System.out.println(hour);
                    System.out.println(minute - 45);
                }
            }
        }
    }
}
