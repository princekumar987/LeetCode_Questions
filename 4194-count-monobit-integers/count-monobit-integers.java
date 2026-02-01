class Solution {
    public int countMonobit(int n) {
           
           int ans=0;
           for(int i=0;i<=n ;i++){
                StringBuilder sb=new StringBuilder("");
                int x=i;
                while(x>0){
                    sb.append(x%2);
                    x/=2;
                }
                
                int one=0;
                for(int j=0;j<sb.length();j++){
                     if(sb.charAt(j)=='1')one++;
                }
                if(one==sb.length() || one==0)ans++;
           }

           return ans;
    }
}