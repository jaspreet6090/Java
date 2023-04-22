public class palindrome {

    public static void isPalindrome (int orignal){
         
        int revnum = 0;
        int temp = orignal;

        while(temp>0){
            int lastdigit = temp%10;
            revnum = revnum * 10 + lastdigit;
            temp = temp/ 10;
        }
        if(orignal==revnum){
            System.out.println("Number is Palindrome");
        } else {
            System.out.println("Number is not Palindrome");
        }
    }

    public static void main(String[] args) {
        int Number = 141414;
        isPalindrome(Number);
    }
}
