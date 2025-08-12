class Solution {
    public String frequencySort(String s) {
        Map<Character,Integer> mp = new HashMap<>();
        for(char ch : s.toCharArray()){
            if(mp.containsKey(ch)){
                int freq = mp.get(ch);
                mp.put(ch,freq+1);
            }else{
                mp.put(ch,1);
            }
        }
        List<Map.Entry<Character,Integer>> list = new ArrayList<>(mp.entrySet());
        list.sort((a,b)->b.getValue().compareTo(a.getValue()));
        StringBuilder str = new StringBuilder();
       for (Map.Entry<Character, Integer> entry : list) {
            char ch = entry.getKey();
            int freq = entry.getValue();
            for (int i = 0; i < freq; i++) {
                str.append(ch);
            }
        }
    return str.toString();
        }
}
