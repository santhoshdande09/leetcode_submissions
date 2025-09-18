class Solution {
    public String triangleType(int[] nums) {
       
        String s =""; 
        int x = nums[0];
        int y = nums[1];
        int z = nums[2];
        if(((x+y) <= z) || ((x+z) <= y) || ((y+z) <= x))
        {
            s = "none";
            return s;
        }
        if(x == y &&  z == x)
        {
            s = "equilateral";
        }
        else if((x == y && y != z) || (y == z && z !=x) || (z == x) && z != y)
        {
            s = "isosceles";
        }
        else
        {
            s = "scalene";
        }
        
        return s;
    }
}