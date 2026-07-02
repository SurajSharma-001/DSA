class Solution {
    public int maxArea(int[] height) {

        int start = 0;
        int end = height.length-1;

        int maxCap = 0;

        while(start<end){

            int h = Math.min(height[start],height[end]);
           

            int width = end - start;

            int curCap = h * width;

            if(maxCap<curCap){
                maxCap = curCap;
            }

            if (height[start]<height[end]){
                start++;
            }else end--;
        }

        return maxCap;
        
    }
}