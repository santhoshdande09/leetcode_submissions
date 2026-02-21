class Solution {
    public List<Integer> toggleLightBulbs(List<Integer> bulbs) {
        TreeSet<Integer> s = new TreeSet<>();
        int n = bulbs.size();
        for(int i=0 ; i < n; i++){
            if(s.contains(bulbs.get(i))) s.remove(bulbs.get(i));
            else     s.add(bulbs.get(i));              
        }
        List<Integer> result = new ArrayList<>();
        for(int k : s){
            result.add(k);
        }
        return result;
    }
}