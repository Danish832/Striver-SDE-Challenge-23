class Solution {
    public void nextPermutation(int[] arr) {
        int n = arr.length ;
        int ind = -1 ;
        for(int i=n-2 ; i>=0 ; i--){
            if(arr[i]<arr[i+1]){
                ind = i  ;
                break ;
            }
        }
        if(ind==-1){
            reverse(arr,0,n-1) ;
            return ;
        }

        for(int i=n-1 ; i>=ind ; i--){
            if(arr[i]>arr[ind]){
            swap(arr,i,ind);
            break ;
            }

        }
        reverse(arr,ind+1,n-1) ;


    }

    private static void reverse(int arr[],int x,int  y){
        while(x<y){
            swap(arr,x,y);
            x++ ;
            y-- ;
        }
    }
    private static void swap(int arr[],int x,int y){
        int temp = arr[x] ;
        arr[x] = arr[y] ;
        arr[y] = temp ;
    }
}