class Solution {
    public int maxNumberOfBalloons(String text) {
        int min = Integer.MAX_VALUE;
        int freq[] = new int[26];
        for(char ch : text.toCharArray()){
            freq[ch - 'a']++;
        }
        int arr[] = new int[5];
        arr[0] = freq['b' - 'a'];
        arr[1] = freq['a' - 'a'];
        arr[2] = (freq['l' - 'a'])/2;
        arr[3] = (freq['o' - 'a'])/2;
        arr[4] = freq['n' - 'a'];
        for(int i = 0; i < 5; i++){
            if(arr[i] < min){
                min = arr[i];
            }
        }
        return min;
    }
}