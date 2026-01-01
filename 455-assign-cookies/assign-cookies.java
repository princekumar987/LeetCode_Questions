class Solution {
    public int findContentChildren(int[] g, int[] s) {
        
        Arrays.sort(g);
        Arrays.sort(s);
        int ans=0;
        int j=0;
        for(int i=0;i<g.length;i++){
               if(j<s.length && s[j]>=g[i]){
                   ans++;
                   j++;
               }
               else if(j<s.length && s[j]<g[i]){
                    j++;
                    i--;
               }
               else{
                  break;
               }
        }


        return ans;
       
    }
}