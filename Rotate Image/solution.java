import java.util.*;

class solution {

    public static void main (String args[]){
        // int arr[][] = {{1,2,3},{4,5,6},{7,8,9}};
        int arr[][] = {{5,1,9,11},{2,4,8,10},{13,3,6,7},{15,14,12,16}};
        // int ans[][] = {{15,13,2,5},{14,3,4,1},{12,6,8,9},{16,7,10,11}};
        
        printMatrix(arr);

    //    int ans[][] = rotateImage(arr);
        rotateImage1(arr);



        printMatrix(arr);

        //  printMatrix(ans);
    }

    public static void printMatrix(int arr[][]){
        for(int i=0 ; i<arr.length ; i++){
            for(int j=0 ; j<arr[0].length ; j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println();
    }

    public static void swap(int arr[][],int x1,int y1,int x2,int y2){
        int temp = arr[x1][y1];
        arr[x1][y1] = arr[x2][y2];
        arr[x2][y2] = temp ;
    }

    public static int[][] rotateImage(int arr[][]){
        int ans[][] = new int[arr.length][arr[0].length];
        int n = arr.length ; 

        for(int i=0 ; i<arr.length ; i++){
            for(int j=0 ; j<arr[0].length ; j++){
                ans[j][n-1-i] = arr[i][j] ;
                
            }
            
        }

        return ans ;
    }

    public static void rotateImage1(int arr[][]){
        int m = arr.length ;
        int n = arr[0].length ;
        
        for(int i=0 ; i<m-1 ; i++){
            for(int j=i+1 ; j<n ; j++){
                // swap(arr[i][j],arr[i][j]);
                swap(arr,i,j,j,i) ;
            }
        }

        for(int i=0 ; i<m ; i++){

            int j=0 ;

            while(j<n/2){
            // swap(arr[i][j],arr[i][n-1-j]);
            swap(arr,i,j,i,n-1-j);
            j++;
            }
        }
    }
}