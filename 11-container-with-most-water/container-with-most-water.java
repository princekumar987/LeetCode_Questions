class Solution {
    public int maxArea(int[] height) {
        
        int i=0;
        int j=height.length-1;
        int ans=0;

        while(i<j){
              
              if(height[i]<=height[j]){
                  int x=height[i]; 
                  ans=Math.max(ans,(j-i)*x);
                  i++;
              }
              else{
                  int x=height[j];
                  ans=Math.max(ans,(j-i)*x);
                  j--;
              }
        }

        return ans;
    }
}