public class uppercaseTOlowercase
{
    public static void main(String[] args) {
        //Conveert Upper case to lower case
        for(char ch ='A'; ch <= 'Z'; ch++){
            System.out.print((char)(ch | ' '));
        }
        
    }
}