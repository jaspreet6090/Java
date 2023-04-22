public class sumofdigit {
    public static void SumofDigit (int num){

        int sum = 0;
        while(num>0){
            int lastdigit = num %10;
            sum = sum  + lastdigit;
            num =num/10;
        }
        System.out.println("Sum of is "+sum);
    }
    public static void main(String[] args) {
        int num = 123;
        SumofDigit(num);
    }
}
