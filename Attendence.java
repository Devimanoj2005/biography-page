package Module1;

import java.util.Scanner;

public class Attendence {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of days came to college: ");
        int attendance = sc.nextInt();

        if (attendance <= 0) {
            System.out.println("Your child didn't get into the class.");
        } else if (attendance >= 90) {
            System.out.println("Congrats, your attendance mark is 10.");
        } else {
            float attendanceMark = attendance / 10;
            System.out.printf("Your mark for attendance is: %n"+attendanceMark);
        }

        
    }
}
