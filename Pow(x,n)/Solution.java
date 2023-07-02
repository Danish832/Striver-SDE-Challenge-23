class Solution {

    public static void main(String args[]){
        Solution s =  new Solution() ;
        // double ans = s.myPowOptimal(2,-2147483648);
        double ans = s.myPowOptimal(2,-2);
        // double ans = s.myPowOptimal(3,7);
        System.out.println("Pow(x,n): "+ans);
    }
    public double myPowOptimal(double x, int n1) {
        // Optimal : Using Binary Exponentiation - 
        // 1. Square the base
        // 2. Divide the exponent by 2
        // The above method works easily if power is even( Example: 3^6 can be written as 9^3, base squared and exponent halved)
        // But if exponent is odd , there is one extra odd power needed to be saved somewhere 

        double res = 1.0 ;
        long n = n1 ;
        if(n<0) n = n*(-1) ;

        while(n>0){
            if(n%2==1)
                res = res*x ;

            x = x*x ;
            n = n/2 ;
        }
        if(n1<0)return (double)(1.0)/(double)(res) ;

        return res ;
        
    }
    // public double myPowBrute(double x, int n1) {
    //     // TLE !!!
    //     long i=1 ;
    //     long n = n1 ;
    //     double ans = 1.0 ;
    //     if(n<0){
    //         n = -1*n ;
    //         while(i<=n){
    //             ans = ans * x ;
    //             i++;
    //         }
    //         //System.out.println(ans);
    //         ans = (double)(1.0)/(double)(ans) ;
    //         return ans ;
    //     }


    //     while(i<=n){
    //         ans = ans * x ;
    //         i++;
    //     }
    //     return ans ;
    // }
}