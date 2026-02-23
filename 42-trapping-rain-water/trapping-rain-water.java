class Solution {
    public int trap(int[] height) {
        int n = height.length, ans = 0;
        // while(l < r)
        // {
        //     lmax = Math.max(lmax, height[l]);
        //     rmax = Math.max(rmax, height[r]);
        //     if(lmax < rmax)
        //         ans+= lmax - height[l++];
        //     else
        //     ans+= rmax - height[r--];
        // }
        int lmax[] = new int[n];
        int rmax[] = new int[n];
        lmax[0] = height[0];
        rmax[n - 1] = height[n - 1];
        for(int i = 1; i < n; i++)
        {
            lmax[i] = Math.max(lmax[i - 1], height[i]);
        }
        for(int i = n - 2; i >= 0; i--)
            rmax[i] = Math.max(rmax[i+1], height[i]);
        for(int i = 0; i < n; i++)
        {
            if(lmax[i] < rmax[i])
            ans += lmax[i] - height[i];
            else
            ans += rmax[i] - height[i];
        }

        return ans;
    }
}