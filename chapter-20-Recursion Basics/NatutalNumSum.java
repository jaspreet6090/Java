public class NatutalNumSum {
    public static int calSum(int n){
        if(n==1){
            return 1;
        }
        int Snmo = calSum(n-1);
        int Sum = n +   Snmo;
        return Sum;
    }

    public static void main(String[] args) {
        int n = 5;
        System.out.println(calSum(n));
    }
}
