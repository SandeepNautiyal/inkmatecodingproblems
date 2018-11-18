class MinimumSizeSubarraySum {
    public int minSubArrayLen(int s, int[] nums) {
        if(nums == null || nums.length == 0)
            return 0;
        
        if(nums[0] > s)
            return 1;
        
        Queue<Integer> queue = new LinkedList<>();
        int startIndex = 0;
        int sum = 0;
        int minLength = Integer.MAX_VALUE;
        for(int i = 0; i < nums.length; i++){
            sum = sum + nums[i];
            while(sum >= s){
                minLength = Math.min(i-startIndex+1, minLength);
                sum = sum - nums[startIndex];
                startIndex = startIndex+1;
            }
           
        }
        
        return minLength == Integer.MAX_VALUE ? 0 : minLength;
    }
}
