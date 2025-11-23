class Solution {
    public int minimumFlips(int n){

    StringBuilder sb=new StringBuilder("");

    while(n>0){
        sb.append((n%2));
        n=n/2;
    }

    StringBuilder s=new StringBuilder(sb);
    s.reverse();
    int ans=0;
    for(int i=0;i<sb.length();i++){
        if(sb.charAt(i)!=s.charAt(i))ans++;
    }

    return ans;

        
    }
}