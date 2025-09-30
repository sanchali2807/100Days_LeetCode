import java.util.HashMap;

class Solution {
    public boolean wordPattern(String pattern, String s) {
        String[] words = s.split(" ");
        if (pattern.length() != words.length) return false;

        HashMap<Character, String> mapCharToWord = new HashMap<>();
        HashMap<String, Character> mapWordToChar = new HashMap<>();

        for (int i = 0; i < pattern.length(); i++) {
            char c = pattern.charAt(i);
            String word = words[i];

            if (mapCharToWord.containsKey(c)) {
                if (!mapCharToWord.get(c).equals(word)) return false;
            } else {
                mapCharToWord.put(c, word);
            }

            if (mapWordToChar.containsKey(word)) {
                if (mapWordToChar.get(word) != c) return false;
            } else {
                mapWordToChar.put(word, c);
            }
        }

        return true;
    }
}
