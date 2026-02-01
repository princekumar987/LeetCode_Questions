class Solution {
    public int countMonobit(int n) {
           
           int ans=0;
           for(int i=0;i<=n ;i++){
                String s="";
                int x=i;
                while(x>0){
                    s=s+""+x%2;
                    x/=2;
                }
                
                if(s.replace("0","").length()==0 || s.replace("1","").length()==0)ans++;
           }

           return ans;
    }
}