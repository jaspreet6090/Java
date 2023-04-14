import java.util.*;

public class sign_check {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Input a number :");
        int num = sc.nextInt();

        if(num>0){
            System.out.println("Number is Positive");
        } else {
            System.out.println("Number is Negative");
        }
    }
}
