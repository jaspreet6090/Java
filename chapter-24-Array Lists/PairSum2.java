import java.util.*;

//Sorted and Rotated array list
public class PairSum2 {
    public static void findPair(ArrayList<Integer> list, int target){
        //2 pointer approach O(n)
        int piv = -1;
        //finding Pivot or breaking point
        for(int i=0; i<list.size(); i++){
            if(list.get(i) > list.get(i+1)){
                piv = i;
                break;
            }
        }

        int lp = piv+1;
        int rp = piv;
        int n = list.size();
        //cases
        while (lp != rp) {
            if(list.get(lp) + list.get(rp) == target){
                System.out.print(list.get(lp)+" , "+list.get(rp));
                return;
            }  if(list.get(lp) + list.get(rp) < target){
              lp = (lp+1)%n;
           }else{
            rp = (n+rp-1)%n;
           }
        }
        System.out.println("Sum not exists");  
        }

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        //Sorted and Rotated array list
        list.add(11);
        list.add(15);
        list.add(6);
        list.add(8);
        list.add(9);
        list.add(10);

        int target = 16;
        findPair(list,target);
    }

}
