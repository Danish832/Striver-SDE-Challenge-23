import java.util.*;

// Finding Inversions using mergeSort on two sorted arrays

class solution {

    public static void main (String args[]){
        // int arr1[] = {2,3,5,6} ;
        int arr1[] = {5,3,2} ;
        // int arr2[] = {2,2,4,4,8} ;
        int arr2[] = {4,1} ;
        int m = arr1.length ;
        int n = arr2.length ;
        int ans = inversions(arr1,arr2,m,n);
        System.out.println("Number of inversion in two sorted arrays is : "+ans);
    }
    public static int inversions(int arr1[],int arr2[],int m,int n){
        int left = 0 ;
        int right = 0 ;
        int cnt =0 ;
        while(left<m && right<n){
            if(arr1[left]>arr2[right]){
                cnt+=(m-left) ;
                //left++ ;
                right++ ;
            }
            else{
                left++ ;
            }
        }
        return cnt ;
    }
}