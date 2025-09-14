import java.util.*;

class Solution {
    private String normalize(String s){
        s = s.toLowerCase();
        StringBuilder sb = new StringBuilder();
        for (char c : s.toCharArray()) {
            if (c=='a' || c=='e' || c=='i' || c=='o' || c=='u')
                sb.append('*');
            else
                sb.append(c);
        }
        return sb.toString();
    }

    public String[] spellchecker(String[] wordList, String[] queries) {
        Set<String> exact = new HashSet<>(Arrays.asList(wordList)); 
        Map<String,String> caseInsensitive = new HashMap<>();      
        Map<String,String> vowelInsensitive = new HashMap<>();      


        for (String w : wordList) {
            String lw = w.toLowerCase();
            caseInsensitive.putIfAbsent(lw, w);
            String norm = normalize(w);
            vowelInsensitive.putIfAbsent(norm, w);
        }

        String[] ans = new String[queries.length];
        for (int i = 0; i < queries.length; i++) {
            String q = queries[i];

            if (exact.contains(q)) {
                ans[i] = q;                              
                continue;
            }

            String lq = q.toLowerCase();
            if (caseInsensitive.containsKey(lq)) {      
                ans[i] = caseInsensitive.get(lq);
                continue;
            }

            String nq = normalize(q);
            if (vowelInsensitive.containsKey(nq)) {    
                ans[i] = vowelInsensitive.get(nq);
            } else {
                ans[i] = "";                        
            }
        }
        return ans;
    }
}
