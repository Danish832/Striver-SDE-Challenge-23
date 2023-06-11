import java.util.*;

class solution {

    public static void main (String args[]){
        // int arr[] = {7,1,5,3,6,4} ;
        // int arr[] = {3,5,1,7,4,9,3} ;
        int arr[] = {7,6,4,3,1} ;
        int n = arr.length ;

        // int max = maxProfitBrute(arr,n);
        int max = maxProfitOptimal1(arr,n);
        // int max = maxProfitOptimal2(arr,n);
        System.out.println(max);
    }
    public static int maxProfitBrute(int arr[],int n){
        int currP = 0 ;
        int maxP = Integer.MIN_VALUE ;
        for(int i=0 ; i<n-1 ; i++){
            currP = 0 ;
            for(int j=i+1 ; j<=n-1 ; j++){
                currP += arr[j]-arr[i] ;

                if(currP>maxP)
                    maxP  = currP ;

                currP = 0 ;
            }
        }
        if(maxP<0)return 0 ;

        return maxP ;
    }

    public static int maxProfitOptimal1(int arr[],int n){
        //Two pointer
        int l = 0 ;
        int r = 1 ;
        int profit =0 ;

        int maxP = Integer.MIN_VALUE ;
        while(r<n){
            if(arr[l]<arr[r]){
                profit  = arr[r]-arr[l];
                maxP = Math.max(profit,maxP);
            }
            else{
                l = r ;
            }
            r++ ;
        }
        if(maxP<0)return 0 ;

        return maxP ;
    }
    public static int maxProfitOptimal2(int arr[],int n){
        //Kadane's Algo
        int currP = 0 ;
        int maxP = Integer.MIN_VALUE ;

        for(int i=1 ; i<n ; i++){
            currP+= arr[i]-arr[i-1] ;

            if(maxP<currP) maxP = currP ;

            if(currP<0) currP = 0 ;
        }
        if(maxP<0)return 0 ;

        return maxP ;
    }


}