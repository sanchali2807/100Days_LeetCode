class Solution {
    public int numRabbits(int[] answers) {
        Map<Integer,Integer> mp = new HashMap<>();
        for(int i : answers){
            if(mp.containsKey(i)){
                int freq = mp.get(i);
                mp.put(i,freq+1);
            }else{
                mp.put(i,1);
            }
        }
        int res = 0;
    for(Map.Entry<Integer, Integer> entry : mp.entrySet()) {
        int group = entry.getKey()+1;
        int freq = entry.getValue();
        int groupNo = (int) Math.ceil((double) freq / group);
        res += groupNo * group;
    }
    return res;
    }
}
