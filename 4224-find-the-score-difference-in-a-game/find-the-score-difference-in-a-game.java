class Solution {
    public int scoreDifference(int[] nums) {
        int n = nums.length;
        boolean flag1 = true;
        int sum1 = 0;
        int sum2 = 0;
        for(int i = 0; i < n; i++)
            {
                if((nums[i] % 2 != 0))
                {
                    flag1 = !flag1;
                }
                if((i - 5) % 6 == 0)
                {
                    flag1 = !flag1;
                }
                if(flag1)
                    sum1 += nums[i];
                else
                    sum2 += nums[i];
                
            }
        return sum1 - sum2;
        
    }
}