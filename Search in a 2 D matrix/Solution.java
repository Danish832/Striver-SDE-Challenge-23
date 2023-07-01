class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int rows = matrix.length ;
        int cols = matrix[0].length ;

        int topRow = 0 ;
        int bottomRow = rows-1 ;
        while(topRow<=bottomRow){
            int middleRow = topRow+(bottomRow-topRow)/2 ;

            if(target>matrix[middleRow][cols-1])
                topRow = middleRow+1 ;

            else if(target<matrix[middleRow][0])
                bottomRow = middleRow-1 ;

            else
                break ;
        }
        if(!(topRow<=bottomRow)) return false ;
        int middleRow = (topRow + bottomRow)/2;
        int low =0 ;
        int high =cols-1 ;
        while(low<=high){
            int mid = low+(high-low)/2 ;

            if(target==matrix[middleRow][mid])
                return true ;

            else if(target>matrix[middleRow][mid])
                low = mid+1 ;

            else
                high=mid-1 ;
        }
        return false ;
    }
    
}