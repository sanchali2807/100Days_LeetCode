class Solution {
    public int maxArea(int[] height) {
       int n = height.length;
       int i = 0;
       int j = n-1;
       int width = 0;
       int h = 0;
       int area = 0;
       int max = 0;
       
       while(i<j){
         width = j-i;
         h = Math.min(height[i],height[j]);
         area = width * h;
         if(area>max){
            max = area;
         }
         if(height[i]<height[j]){
            i++;
         }else{
            j--;
         }

       }
    return max;
    }
}
