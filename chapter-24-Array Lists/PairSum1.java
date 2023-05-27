import java.util.*;
//Sorted ArrayList
public class PairSum1 {
    public static void findPair(ArrayList<Integer> list, int target){
        //BruteForce -> O(n^2)
        // for(int i = 0; i < list.size(); i++){
        //     for(int j = i+1; j < list.size(); j++){
        //         int sum = list.get(i) + list.get(j);
        //         if(sum == target){
        //             System.out.println(list.get(i)+" , "+list.get(j));
        //             return; // only if we want one pair
        //         }
        //     }
        // }

//---------------------------------------------------------------------------------------------------------
        // 2-pointer Approach O(n)
        int lp = 0;
        int rp = list.size()-1;

        while(lp != rp){
            if(list.get(lp) + list.get(rp) == target){
                System.out.print(list.get(lp)+" , "+list.get(rp));
                return;
            }  if(list.get(lp) + list.get(rp) < target){
              lp++;
           }else{
            rp--;
           }
        }
        System.out.println("Sum not exists");  
    }
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);

        int target = 5;
        findPair(list,target);
        
    }
}
