import java.util.* ;
class Solution {
    public static void main(String args[]){
        String arr[] = {"flower","flow","flight"} ;
        int n = arr.length ;
        String longest = longestCommonPrefix(arr) ;
        System.out.println("The ansewr is: "+longest);
    }
    public static String longestCommonPrefix(String[] arr) {
        String ans = "" ;
        int n = arr.length ;
        Arrays.sort(arr) ;

        String first = arr[0] ;
        String last = arr[n-1] ;

        int i=0 ;
        while(i<first.length()){
            if(first.charAt(i) == last.charAt(i))
                i++ ;

            else 
                break; 
        }

        return i == 0 ? "" : first.substring(0,i) ;

       // return ans ;
    }
}