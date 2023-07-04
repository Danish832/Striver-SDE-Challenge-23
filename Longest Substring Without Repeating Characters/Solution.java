import java.util.* ;

class Solution {
    public static void main(String args[]){
        // String s = "aabacbebebe" ;
        String s = "pwwkew" ;
        // String s = "meayl" ;

        int k = 2 ;

        int ans = longestSubstringwithUniqueChar(s,k);
        System.out.println("longest substring length: "+ans);
    }
    public static int longestSubstringwithUniqueChar(String s,int k){
        Map<Character,Integer> map  = new HashMap<>() ; // Store frequency of each element
        int maxlength = -1 ;
        int n = s.length() ;
        int i=0 ,j =0 ;
        while(j<n){
            char ch= s.charAt(j) ;
            int freq = map.getOrDefault(ch,0);
            freq+=1 ;
            map.put(ch,freq);

            if(map.size()==(j-i+1)){ // Possible answer candidate , store its length if its greater than previous candidate
                if(j-i+1>maxlength){
                    maxlength = j-i+1;
                }
            }
            
            if(map.size()<(j-i+1)){ // Reduce freq of i'th element , and remove it from map if frequency becomes 0

                while(map.size()<(j-i+1)){
                char ich = s.charAt(i);
                int freqi = map.get(ich);
                map.put(ich,freqi-1);
                if(map.get(ich)==0) map.remove(ich) ;
                i++ ;
                }

            }

            j++ ;
        }
       // System.out.println(map);
        return maxlength ;
    }
}