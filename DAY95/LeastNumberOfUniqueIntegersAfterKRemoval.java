class Solution {
    public int findLeastNumOfUniqueInts(int[] arr, int k) {
        int n = arr.length;
        Map<Integer,Integer> mp = new HashMap<>();
        for(int nums : arr){
            mp.put(nums,mp.getOrDefault(nums,0)+1);
        }
        List<Integer> freqList = new ArrayList<>(mp.values());
        Collections.sort(freqList); 
        int remaining = 0;
        for (int freq : freqList) {
            if (k >= freq) {
                k -= freq; 
            } else {
                remaining++; 
            }
        }
        return remaining;
    }
}
