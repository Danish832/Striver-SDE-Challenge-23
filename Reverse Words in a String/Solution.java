import java.util.*;
class Solution {
    public String reverseWords(String s) {
        s = s.trim() ;
        String arr[] = s.split(" +");
         String ans = "";
        for(int i=arr.length-1 ; i>=0 ; i--){
                ans+= arr[i]+ " ";
        }
        ans = ans.trim();
        return ans ;
    }

    public static void main(String args[]){
        String s = " the  sky is  blue " ;

        Solution sol = new Solution() ;
         s = sol.reverseWords(s);

        System.out.println(s);
        // String words[] = s.split(" +");

        // for(int i=0 ; i<words.length ; i++){
        //     System.out.print(words[i]+",");
        // }
    }
}