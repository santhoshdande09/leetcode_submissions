class Solution {
    public int[] maxKDistinct(int[] nums, int k) {
        int n = nums.length;
        Arrays.sort(nums);
        int []ans = new int[k];
        ans[0] = nums[n-1];
        int val = ans[0];
        int j = 1;
            for(int i = n-2; i >= 0; i--)
            {
                if(j == k)
                {
                    break;
                }
                        if(nums[i] == val)
                        {
                           continue;
                        }
                        else
                        {
                            val = nums[i];
                            ans[j] = val;
                            j++;
                        }
            }
        int final_ans[] = new int[j];
            for(int i = 0; i < j; i++)
            {
                final_ans[i] = ans[i];
            }
        
        return final_ans;
    }
}