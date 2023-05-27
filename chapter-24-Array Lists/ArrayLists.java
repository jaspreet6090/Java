import java.util.ArrayList;

public class ArrayLists {
    public static void main(String[] args) {
        //Creating a new ArrayList
        ArrayList<Integer> list = new ArrayList<>();
        //adding elements
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);

        //get elements
        list.get(0);

        //remove elements
        list.remove(0);

        //set elements at index
        list.set(0, 10);

        //contains elements (exist or not)
        // list.contains(4);
        System.out.println(list.contains(4));

        //add value at index
        list.add(0, 1);

        //print list 
        System.out.println(list);
    }
}
