class Solution {
    public boolean isAnagram(String s, String t) {
        int count[] = new int[26] ;

        for(int i=0 ; i<s.length() ; i++){
            count[s.charAt(i)-'a']++;
        }

        for(int i=0 ; i<t.length() ; i++){
            count[t.charAt(i)-'a']--;
        }


        for(int cnt:count){
            if(cnt!=0)
            return false ;
        }

        return true ;

    }
}