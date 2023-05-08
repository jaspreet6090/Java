public class RecursionBasics {
    public static void printDec(int n){
        if(n==0){
            return;
        }
        System.out.print(n+" ");
        printDec(n-1);
    }

    public static void printInc(int n){
        if(n==0){
            return;
        }
        printInc(n-1);
        System.out.print(n+" ");
    }
    public static void main(String[] args) {
         printDec(5); 
         System.out.println();
         printInc(5);
    }
}
