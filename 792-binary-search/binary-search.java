class Solution {
   

    public int binarySearchR(int nums[], int low, int high,int target)
    {
        if(low > high)
        {
            return -1;
        }
        int mid = (low + high)/2;
        if(nums[mid] == target)
        {
            return mid;
        }
        else if(nums[mid] < target)
        {
            return binarySearchR(nums,mid + 1,high,target);
        }
        else
        {
            return binarySearchR(nums,low,mid - 1,target);
        }
    }
    public int search(int[] nums, int target) {
        int low = 0;
        int high = nums.length - 1;
        return binarySearchR(nums,low,high,target);
        
    }
}