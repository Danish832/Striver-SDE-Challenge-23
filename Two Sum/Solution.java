class Solution {
    public int[] twoSum(int[] arr, int target) {
        int nums[] = new int[2] ;
        int n = arr.length-1 ;
        int sum = 0 ;
        HashMap<Integer,Integer> map = new HashMap<>() ;
        for(int i=0 ; i<=n ; i++){
        	if(map.containsKey((target-arr[i]))){
        		nums[0]=map.get((target-arr[i]));
        		nums[1]=i;
        		
        	}
        	
        	
        	else{
        		map.put(arr[i],i);
        	}
        }
        
        return nums ;
    }
}