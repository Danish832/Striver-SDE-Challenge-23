class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
    // Brute with extra space 
    //     int i = 0 ;
    //     int mid = m-1 ;
    //     int j = 0 ;
    //     int high = n-1 ;
    //     int k = 0 ;
    //     int temp[] = new int[m+n];
    //     while(i<=mid && j<=high){
    //         if(nums1[i]<nums2[j]){
    //             temp[k] = nums1[i];
    //             i++ ;
    //             k++ ;
    //         }
    //         else{
    //             temp[k]=nums2[j];
    //             j++;
    //             k++;
    //         }
    //     }

    //     while(i<=mid){
    //         temp[k] = nums1[i];
    //         i++ ;
    //         k++ ;
    //     }
    //     while(j<=high){
    //         temp[k] = nums2[j];
    //         j++ ;
    //         k++ ;
    //     }

    //     for(int x=0 ; x<temp.length ; x++){
    //         nums1[x] = temp[x];
    //     }
    // }

    // Optimal with two pointers 
    int tail1 = m - 1, tail2 = n - 1, pos = m + n - 1;
    while (tail1 >= 0 && tail2 >= 0) {
        nums1[pos--] = (nums1[tail1] > nums2[tail2]) ? 
                             nums1[tail1--] : nums2[tail2--];
    }

    while (tail2 >= 0) { //only need to combine with remaining nums2, if any
        nums1[pos--] = nums2[tail2--];
    }
}
}



