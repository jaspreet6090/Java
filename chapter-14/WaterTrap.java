import java.util.*;

public class WaterTrap {

    public static int trap (int height []){
        int n = height.length;

        int res = 0, l = 0 , r = n-l;
        int rMax = height[r] , lMax = height[l];

        while(l<r){
            if (lMax <rMax){
                l++;
                lMax = Math.max(lMax, height[l]);
                res += lMax - height[l];
            } else {
                r--;
                rMax = Math.max(rMax ,height[r]);
                res += rMax - height[r];
            }
        }
        return res;
    }
//execute nhi hua 
    public static void main(String[] args) {
        int height[] = {5,4,6,7,8};
        int printHeight = trap(height);
        System.out.println("Height is: "+printHeight);
    }
}
