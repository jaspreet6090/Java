import java.util.*;
public class table {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       
       int number;

       System.out.println("Enter the Number to print table of it");
       number = sc.nextInt();

       for(int i=1; i<=10; i++){
            System.out.println(+number+"*"+i+"="+i*number);
       }
    }
}
