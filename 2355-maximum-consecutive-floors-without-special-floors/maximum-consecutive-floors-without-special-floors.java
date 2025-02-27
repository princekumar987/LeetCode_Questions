class Solution {
    public int maxConsecutive(int bottom, int top, int[] special) {
        
        Arrays.sort(special);

        int ans=0;
     
        if(bottom<special[0]){
           ans=special[0]-bottom; 
        }
        
        int p=0;
        for(int i=1;i<special.length;i++){
            if(special[i]<=top){
                ans=Math.max(ans,special[i]-special[i-1]-1);
                p=i;
            }
            else{
                break;
            }
        }

        ans=Math.max(ans,top-special[p]);

        return ans;
    }
}