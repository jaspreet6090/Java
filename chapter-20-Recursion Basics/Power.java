public class Power  {
    // in  O(log n) time

    public static int optimizedPower (int a , int n){
        if(n == 0 ){
            return 1;
        }

        int halfPowerSq = optimizedPower(a, n/2) * optimizedPower(a, n/2);

        // n is odd 
        if(n%2 != 0) {
            halfPowerSq =  a * halfPowerSq;
        }

                return halfPowerSq;
    }
    public static void main(String[] args) {
        System.out.println(optimizedPower(2, 5));
    }
}
