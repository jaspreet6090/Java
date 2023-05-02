import java.util.*;
public class factorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number;
        int fact = 1 ;

        System.out.println("Enter a Number you want Factorial of it: ");
        number = sc.nextInt();
    
        if(number==0 || number == 1){
            System.out.println("Factorial : "+fact);
        } else {
            for(int i=2;i<=number;i++){
                fact= fact*i;
            }
            System.out.println("Factorial : "+fact);
        }

    }
    
}
