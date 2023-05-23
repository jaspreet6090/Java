// Java program to sort
// arrays of strings using merge sort

public class arrayofstrings {

    // Function to mergeSort 2 arrays
    static String[] mergeSort(String[] Arr, int lo, int hi) {
        if (lo == hi) {
            String[] A = { Arr[lo] };

            return A;
        }
        int mid = lo + (hi - lo) / 2;
        String[] arr1 = mergeSort(Arr, lo, mid);
        String[] arr2 = mergeSort(Arr, mid + 1, hi);

        String[] arr3 = merge(arr1, arr2);
        return arr3;
    }

    static String[] merge(
            String[] Arr1, String[] Arr2) {
        int m = Arr1.length;
        int n = Arr2.length;
        String[] Arr3 = new String[m + n];

        int idx = 0;

        int i = 0;
        int j = 0;

        while (i < m && j < n) {
            if (isAlphabeticallySmaller(Arr1[i], Arr2[j])) {

                Arr3[idx] = Arr1[i];
                i++;
                idx++;
            } else {
                Arr3[idx] = Arr2[j];
                j++;
                idx++;
            }
        }
        while (i < m) {
            Arr3[idx] = Arr1[i];
            i++;
            idx++;
        }
        while (j < n) {
            Arr3[idx] = Arr2[j];
            j++;
            idx++;
        }
        return Arr3;
    }

    // Return true if str1 appears before
    // str2 in alphabetical order
    static boolean isAlphabeticallySmaller(String str1, String str2) {
        str1 = str1.toUpperCase();
        str2 = str2.toUpperCase();
        if (str1.compareTo(str2) < 0) {
            return true;
        }
        return false;
    }

    // Driver code
    public static void main(String[] args) {
        String[] Arr = { "sun", "earth", "mars", "mercury" };
        String[] a = mergeSort(Arr, 0, Arr.length - 1);
        for (int i = 0; i < a.length; i++) {
            System.out.print(" "+a[i]+" ");
        }
    }

}
