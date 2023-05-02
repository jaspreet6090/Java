
public class InsertionSort {
    //Insertion Sort for Descending Sort
    public static void insertionsort(int arr[]){
        for(int i=1;i<arr.length;i++){
            int curr = arr[i];
            int prev = i-1;

            //finding out the Correct pos to insert
            while(prev>=0 && arr[prev]<curr){
                arr[prev+1]=arr[prev];
                prev--;
            }  
            //insertion
            arr[prev+1] = curr;

        }
    }
    public static void PrintArray (int arr[]){
        for(int i=0; i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int arr[] = { 3, 6, 2, 1,8, 7, 4, 5, 3,1 };
        insertionsort(arr);
        PrintArray(arr);
    }

}
