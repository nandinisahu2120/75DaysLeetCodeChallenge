class Solution {
    public int maxArea(int[] height) {
        int i=0,l=height.length-1,n=height.length-1,max=-1;
        while(i<l){
            max=Math.max(max,(Math.min(height[i],height[l])*n));
            if(height[i]<height[l])i++;
            else l--;
            n--;
        }
        return max;
    }
}