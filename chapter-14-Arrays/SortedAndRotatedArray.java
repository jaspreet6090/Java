public class SortedAndRotatedArray {
    public static int bSearch (int nums[] , int key){
        int low =0;
        int high = nums.length-1;

        while (low <= high){
            int mid = (low+high)/2;

            if (nums[mid]==key){
                return mid;
            }
            if (nums[low]<nums[mid]){
                if (key>=nums[low] && key < nums[mid]){
                    high = mid-1;
                } else {
                    low = mid + 1;
                }
            } else {
                if (key>nums[mid] && key<nums[high]){
                    low=mid+1;
                }
                else {
                    high=mid-1;
                }
            }
        } return -1;

    }


    public static void main(String[] args) {
        int nums[] = {1,2,4,5,7,10,3};
        int index = bSearch(nums, 4);
        System.out.println("Index is "+index);
    }
}
