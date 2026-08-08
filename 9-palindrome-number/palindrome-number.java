class Solution
{
    public boolean isPalindrome(int x)
    {
        if (x < 0)
        {
            return false;
        }
        if (x == 0)
        {
            return true;
        }
        int count = 1;
        while (x / count >= 10)
        {
            count *= 10;
        }
        while (x != 0)
        {
            int left = x / count;
            int right = x % 10;
            
            if (left != right)
            {
                return false;
            }   
            x = (x % count) / 10;
            count /= 100;
        }
        return true;
    }
}