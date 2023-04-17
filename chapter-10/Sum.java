import java.util.*;

//Writeaprogramthatreadsasetofintegers,andthenprintsthesumoftheeven and odd integers.

public class Sum{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int number;
        int choice;
        int even = 0;
        int odd = 0;

        do{
            System.out.println("Enter a number: ");
            number = sc.nextInt();

            if(number % 2 == 0){
                even += number;
            } else {
                odd += number ;
            }

            System.out.println("Enter 1 if you want continue to enter Number other wise enter 0 ");
            choice = sc.nextInt();
        }while(choice==1);

        System.out.println("Sum of Even number is : "+even);
        System.out.println("Sum of Odd number is : "+odd);

    }
}