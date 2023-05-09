public class BinaryStringProblem{

    
    public static void printBinaryString(int n , int lastplace , String str){
        //base case
        if(n == 0){
            System.out.println(str);
            return;
        }
        //kaam
        // if(lastplace == 0){
        //     //sit 0 on chair n
        //     printBinaryString(n-1 , 0 , str.append("0"));
        //     printBinaryString(n-1, 1,str.append("1"));
        // } else {
        //     printBinaryString(n-1 , 0 , str.append("0"));
        // }
        
        //more efficient
        printBinaryString(n-1 , 0 , str+"0");
        if(lastplace == 0){
            printBinaryString(n-1, 1,str+"1");
        }
    }

    public static void main(String[] args) {
        printBinaryString(3, 0, "");
    }
}
