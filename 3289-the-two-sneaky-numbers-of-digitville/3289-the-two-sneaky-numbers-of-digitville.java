class Solution {
    public int[] getSneakyNumbers(int[] nums) {
        int n=nums.length;
        List<Integer> ans=new ArrayList<>();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            if(arr[nums[i]]==1){
                ans.add(nums[i]);
            }
            else{
                arr[nums[i]]=1;
            }
        }
        int[] res=new int[ans.size()];
        for(int i=0;i<res.length;i++){
            res[i]=ans.get(i);
        }
        return res;
    }
}