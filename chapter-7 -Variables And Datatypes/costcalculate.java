import java.util.*;
public class costcalculate{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the cost of ");

        System.out.println("Pencil");
        float pencil = sc.nextFloat();

        System.out.println("Pen");
        float pen = sc.nextFloat();

        System.out.println("Earser");
        float earser = sc.nextFloat();

        float total = (pencil+pen+earser);
        
        System.out.println("Total cost is "+total);

        float gsttotal = total+((total*18)/100);
        
        System.out.println("Total cost  after 18% GST is "+gsttotal);

    }
}