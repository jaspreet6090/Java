public class NumberToString {
        
    static String digit[] = { "zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};

    public static void printNumtoStr(int num){
        //base case 
        if(num == 0){
                    return;
                }
                //recursive case
                printNumtoStr(num/10);
                System.out.print(digit[num%10]+" ");
    }

    public static void main(String[] args) {
        printNumtoStr(2019);
    }
}
