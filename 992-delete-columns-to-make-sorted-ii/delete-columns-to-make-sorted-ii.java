class Solution {
    public int minDeletionSize(String[] strs) {
        
        int ans=0;
        boolean []b=new boolean[strs.length]; 
        for(int i=0;i<strs[0].length();i++){

            boolean p=true;
            boolean []h=new boolean[strs.length];

            for(int j=1;j<strs.length;j++){

                    if(strs[j].charAt(i)>strs[j-1].charAt(i)){
                         h[j]=true;
                    }  
                    else if(strs[j].charAt(i)==strs[j-1].charAt(i)){
                        continue;
                    }
                    else{
                        if(b[j]==true)continue;
                        else{
                            p=false;
                            break;
                        }
                    }

            }
            
            if(!p)ans++;
            else{
                for(int j=0;j<h.length;j++){
                    if(h[j])b[j]=h[j];
                }
            }
        }

        for(int i=0;i<b.length;i++){
            System.out.print(b[i]+" ");
        }

        return ans;
    }
}