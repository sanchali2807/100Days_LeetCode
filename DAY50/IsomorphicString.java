class Solution {
    public boolean isIsomorphic(String s, String t) {
        if (s.length() != t.length()) return false;

        HashMap<Character, Character> mapST = new HashMap<>(); // mapping s -> t
        HashMap<Character, Character> mapTS = new HashMap<>(); // mapping t -> s

        for (int i = 0; i < s.length(); i++) {
            char sch = s.charAt(i);
            char tch = t.charAt(i);
            if (mapST.containsKey(sch) && mapST.get(sch) != tch) {
                return false;
            }
            if (mapTS.containsKey(tch) && mapTS.get(tch) != sch) {
                return false;
            }
            mapST.put(sch, tch);
            mapTS.put(tch, sch);
        }
        return true;
    }
}
