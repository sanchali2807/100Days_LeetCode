class Solution {
    public int longestPalindrome(String s) {
        Map<Character,Integer> mp = new HashMap<>();
        for(int i=0;i<s.length();i++){
            char ch = s.charAt(i);
            if(mp.containsKey(ch)){
                int freq = mp.get(ch);
                mp.put(ch,freq+1);
            }else{
                mp.put(ch,1);
            }
        }
        int sum = 0;
        boolean OddFound = false;
        for (Integer value : mp.values()) {
            if(value%2==0){
                sum += value;
            }else{
                sum += value-1;
                OddFound = true;
            }
}
            if(OddFound){
                sum+=1;
            }
return sum;
    }
}
