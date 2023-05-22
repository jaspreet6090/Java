public class mergesort {
    
    public static void mergeSort ( int arr[] , int si , int ei){
        //base case
        if(si >= ei){
            return ;
        }

        int mid = si + (ei - si)/2;
        mergeSort(arr, si, mid);
        mergeSort(arr, mid+1, ei);

        //merging
        merge( arr, si, mid, ei);

    }

    public static void merge ( int arr[] , int si , int mid , int ei ){
        //legt (0,3) right (4,6)
        int temp[] = new int [ei-si+1];

        int i = si ; // iterator for left part
        int j = mid+1 ; // iterator for right part
        int k = 0 ; // iterator for temp array

        while ( i <= mid && j <= ei ){
            if(arr[i] < arr[j]){
                temp[k] = arr[i];
                i++;
            } else {
                temp [k] = arr[j];
                j++;
            }
            k++;
        }

        //if left is remaining 
        while ( i <= mid ) {
            temp[k++] = arr [i++];
        }

        //for right part
        while ( j <= ei ){
            temp[k++] = arr [j++];

        }

        //copy temp to orginal arr
        for (k = 0 , i = si ; k < temp.length ; k++ ,i++){
            arr[i] = temp[k];
        }
    }

    public static void printArray (int[] arr){
        for (int i = 0 ; i < arr.length ; i++){
          System.out.print(arr[i] + " ");
        }
    }

    public static void main(String[] args) {
        int arr[] = {6,3,9,5,2,8};
        mergeSort(arr, 0, arr.length-1);
        printArray(arr);

    }
}
