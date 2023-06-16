class Solution{
    public static void main(String args[]){
        // int arr[] = {6,4,3,5,5,1} ;
        // int arr[] = {3,1,3,4,2,3} ;
        int arr[] = {5,4,2,4,1};
        int n = arr.length ;
        // int ans[] = missingAndRepeating(arr,n) ;
        int ans[] = missingAndRepeating1(arr,n) ;
        System.out.println("Missing: "+ans[0]);
        System.out.println("Repeating: "+ans[1]);

    }
    public static int[] missingAndRepeating(int arr[], int n) {
    // Approach 1 : Brute force 
    // T.C -> O(N^2)  S.C: O(1) 
        int ans1[]= new int [2] ;
        int missing  = -1 ;
        int repeating = -1 ;
        int count =0 ;

        for(int i=1 ; i<=n ; i++){
            count = 0 ;
            for(int j=0 ; j<n ; j++){
                if(arr[j]==i){
                    count++ ;
                }
            }
            if(count==0) {
                missing = i ;
            }
            else if(count>1){
                repeating = i ;
            }
            if(missing!=-1 && repeating!=-1)
            break ;
            
        }
        ans1[0] = missing ;
        ans1[1] = repeating ;

        return ans1 ;

    }

    // Approach 2 : Better : Hashing with array 
    //  Take array of size n+1 (index : 0 to 6). Store count of each element in 
    //  in that array . If count ==2 repeting , if count =0 , missing


    //Approach 3 : Mathematical : Using two equations

    public static int[] missingAndRepeating1(int a[], int n) {
        long n = a.length; // size of the array
        // Find Sn and S2n:
        long SN = (n * (n + 1)) / 2;
        long S2N = (n * (n + 1) * (2 * n + 1)) / 6;

        // Calculate S and S2:
        long S = 0, S2 = 0;
        for (int i = 0; i < n; i++) {
            S += a[i];
            S2 += (long)a[i] * (long)a[i];
        }

        //S-Sn = X-Y:
        long val1 = S - SN;

        // S2-S2n = X^2-Y^2:
        long val2 = S2 - S2N;

        //Find X+Y = (X^2-Y^2)/(X-Y):
        val2 = val2 / val1;

        //Find X and Y: X = ((X+Y)+(X-Y))/2 and Y = X-(X-Y),
        // Here, X-Y = val1 and X+Y = val2:
        long x = (val1 + val2) / 2;
        long y = x - val1;

        int[] ans = {(int)x, (int)y};
        return ans;
    }
}