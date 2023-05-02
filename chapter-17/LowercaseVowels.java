import java.util.*;
public class LowercaseVowels {

    //Function to Count Lowercase Vowels in String
    public static int CountLowercaseVowels(String str){
        int count = 0;
        for(int i = 0; i < str.length(); i++){
            if(str.charAt(i)=='a' || str.charAt(i)=='e'|| str.charAt(i)=='i' 
            || str.charAt(i)=='o'|| str.charAt(i)=='u' ){
                count++;
            }
        }

        return count;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter a String");
        String str = sc.nextLine();

        System.out.println(CountLowercaseVowels(str));
    }
}
