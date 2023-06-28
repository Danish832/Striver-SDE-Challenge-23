import java.util.* ;
class Solution {
    public static void main(String args[]){
        int arr[] = {3,1,4,3,2,3,3} ;
        int n = arr.length ;
        Solution s = new Solution();
        int ans = s.majorityElement1(arr) ;
        System.out.println(ans);
    }

    public static int majorityElement1(int[] nums) {
        int n = nums.length ;
        if(n==1)return nums[0] ;

        Map<Integer,Integer> map = new HashMap();
        for(int i=0 ; i<nums.length  ; i++){
            int freq = map.getOrDefault(nums[i],0) ;
            
            freq = freq+1 ;
            
            map.put(nums[i],freq) ;

            if(freq>(n/2)){
                return nums[i];
            }
            
        }
        return 0 ;
    }

    

    public static int majorityElement(int[] nums) {
        int i = 0 ;
        int cnt = 0 ;
        int elem = 0 ;
        while(i<nums.length){
            if(cnt==0){
                elem = nums[i] ;
            }

            if(elem==nums[i]){
                cnt++ ;
                i++;
            }

            else{
                cnt-- ;
                i++ ;
            }


        }
        
        return elem ;
    }
}