class Solution {
    public String replaceWords(List<String> dictionary, String sentence) {
        Set<String> st = new HashSet<>();
        for(String s : dictionary){
            st.add(s);
        }
        String [] words = sentence.split("\\s+");
        for(int i=0;i<words.length;i++){
            String word = words[i];
            for(int j=1;j<=word.length();j++){
                String prefix = word.substring(0,j);
                if(st.contains(prefix)){
                    words[i] = prefix;
                    break;
                }
            }
        }
        return String.join(" ",words);
    }
}
