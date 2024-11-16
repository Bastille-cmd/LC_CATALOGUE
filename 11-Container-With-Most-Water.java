class Solution {
    public int maxArea(int[] height) {
        int res=0;
        int pointer1=0;
        int pointer2=height.length-1;
        while(pointer1<pointer2){
            int vol=(pointer2-pointer1)*Math.min(height[pointer1],height[pointer2]);
            res=Math.max(res,vol);
            if(height[pointer1]<height[pointer2])
            pointer1++;
            else pointer2--;
        }
        return res;
    }
}