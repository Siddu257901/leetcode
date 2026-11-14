class Solution {
    public int maxIceCream(int[] costs, int coins) {
        int count=0;
        Arrays.sort(costs);
        for(int i=0;i<costs.length;i++){
            if(coins-costs[i]>=0){
                count++;
            }
            else if(coins-costs[i]<0){
                continue;
            }
            coins=coins-costs[i];
        }
        return count;
    }
}