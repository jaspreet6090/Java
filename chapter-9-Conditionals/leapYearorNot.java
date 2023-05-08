import java.util.*;

public class leapYearorNot {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a Year");
        int year = sc.nextInt();

        if (year % 4 == 0) {
            if (year % 100 != 0) {
                if (year % 400 == 0) {
                    System.out.println(year + "is a Leap Year");
                } else {
                    System.out.println(year + " is a Leap Year");
                }
            }
        } else {
            System.out.println(year + "Not a Leap Year");
        }

    }
}
