class Solution {
    public int minMoves(int[] nums) {
        int max=Integer.MIN_VALUE;
        int k=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]>max){
                max=nums[i];
            }
        }
        for(int i=0;i<nums.length;i++){
            int x=0;
            if(nums[i]<max){
                x=max-nums[i];
            }
            k+=x;
        }
        
        return k;
    }
}