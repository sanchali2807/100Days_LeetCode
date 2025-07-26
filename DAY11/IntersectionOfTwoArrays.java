class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        Set<Integer> hs = new HashSet<>();
        for(int i = 0; i < nums1.length ;i++){
            hs.add(nums1[i]);
        }
    Set<Integer> hs1 = new HashSet<>();
        for(int i = 0 ;i < nums2.length ;i++){
            if(hs.contains(nums2[i])){
                hs1.add(nums2[i]);
            }
        }
        int j = 0;
        int [] res = new int [hs1.size()];
        for(int i : hs1){
            res[j++] = i;
        }
        return res;
    }
}
