
import java.util.* ;
import java.io.*; 
public class Solution 
{
    public static void sort012(int[] arr)
    {
        int n = arr.length ;
        int l = 0 ;
        int r = n-1 ;

        for(int i=0 ; i<=r;){
            if(arr[i]==0){
                swap(arr,i++,l++);
            }
            else if(arr[i]==2){
                swap(arr,i,r--);
            }
            else{
                i++ ;
            }
        }

    }
    private static void swap(int[] nums, int i, int j) {
    final int temp = nums[i];
    nums[i] = nums[j];
    nums[j] = temp;
    }
}
