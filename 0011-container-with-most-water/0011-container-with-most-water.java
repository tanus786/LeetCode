class Solution {
public int maxArea(int[] height) {
    int max=0,l=0,r=height.length-1,ar;
    while(l<r)
    {
        if(height[r]<height[l])
        {
            ar=(r-l)*(height[r]);
            r--;
        }
        else
        {
            ar=(r-l)*(height[l]);
            l++;
        }
        max=Math.max(max,ar);
        
    }
    return max;
    
}
}