class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        // if (matrix.length == 1) {
        //     // Check if target is present in the single row
        //     for (int num : matrix[0]) {
        //         if (num == target) {
        //             return true;
        //         }
        //     }
        //     return false;
        // }


        boolean elemPresent =false ;
        int rows = matrix.length ;
        int i=0 ;
        int ans = 0 ;
        while(i<rows){
            ans = binarySearch(matrix,target,i) ;
            if(ans>=0){
                elemPresent = true ;
                return elemPresent ;
            }
            i++ ;
        }
        return elemPresent ;
    }
    private static int binarySearch(int arr[][],int elem,int row){
    int temp[] = new int[arr[0].length] ;
    for(int i=0 ; i<arr[0].length ; i++){
        temp[i]= arr[row][i] ;
    }

    int low = 0 ;
    int high = arr[0].length-1 ;
    while(low<=high){
        int mid = (low) + (high-low)/2 ;

        if(elem==temp[mid])
        return mid ;

        else if(elem>temp[mid])
        low = mid+1 ;

        else
        high = mid-1 ;
    }
    
    return -1 ;
    }
}