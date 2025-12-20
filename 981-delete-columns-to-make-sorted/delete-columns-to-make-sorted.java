class Solution {
    public int minDeletionSize(String[] strs) {
        
      
        int ans=0;

        for(int i=0;i<strs[0].length();i++){
            boolean p=true;
            for(int j=1;j<strs.length;j++){
                  if(strs[j].charAt(i)<strs[j-1].charAt(i)){
                    p=false;
                    break;
                  } 
            }
            if(p==false)ans++;
        }

        return ans;
       
    }
}