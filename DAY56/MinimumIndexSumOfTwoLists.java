class Solution {
    public String[] findRestaurant(String[] list1,String[] list2) {
        HashMap<String,Integer> mp = new HashMap<>();
        for(int i=0;i<list1.length;i++){
            mp.put(list1[i],i);
        }

        List<String> result = new ArrayList<>();
        int minSum = Integer.MAX_VALUE;

        for(int i=0;i<list2.length;i++){
            if(mp.containsKey(list2[i])){
                int sum = mp.get(list2[i]) + i;
                 if (sum < minSum) {
                    result.clear();          
                    result.add(list2[i]);
                    minSum = sum;            
                } else if (sum == minSum) {
                    result.add(list2[i]);    
                }
            }
            

        }
        return result.toArray(new String[0]);
    }
}
