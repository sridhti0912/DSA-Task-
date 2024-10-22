class Solution {
    public int maxArea(int[] height) {
        int start = 0;
        int end = height.length-1;

        int water = Integer.MIN_VALUE;

        while(start<end){
            int h = Math.min(height[start], height[end]);
            int b = end-start;
            int area = h*b;
            water = Math.max(water,area);

            if(height[start]<height[end])
            start++;
            else
            end--;
        }
        return water;
    }
}