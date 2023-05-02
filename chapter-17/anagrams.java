import java.util.*;

public class anagrams {
    public static void main(String[] args) {
        String str1 = "earth";
        String str2 = "heart";

        //Convert String to Lowwercase. Why so that we don't have to check separately for lower & Upper Case.

        str1 = str1.toLowerCase();
        str2 = str2.toLowerCase();

        //First check - if the length are the same
        if(str1.length() == str2.length()){
            //convert strings into  char array
            char str1charArray[] = str1.toCharArray();
            char str2charArray[] = str2.toCharArray();

            //sort the char Array
            Arrays.sort(str1charArray);
            Arrays.sort(str2charArray);

            //if the sorted char array are same or identical then the strings are anagram

            boolean result = Arrays.equals(str1charArray,str2charArray);
            if(result){
                System.out.println(str1 +" and "+str2+" are anagram of each other");

            } else{
                System.out.println(str1+" and "+str2+" are not anagram of each other");

            }

        } else{
            //when length are not equals
            System.out.println(str1+" and "+str2+" are not anagram of each other");
        }
    }
}
