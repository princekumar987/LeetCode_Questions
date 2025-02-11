class Solution {
    public int maxDistance(String S, int k1) {
       
       int n=0;
       int s=0;
       int e=0;
       int w=0;
       int ans=Integer.MIN_VALUE;

       for(int i=0;i<S.length();i++){
        int k=k1;
          char ch=S.charAt(i);
          if(ch=='N'){
            n++;
          }
          else if(ch=='S'){
            s++;
          }
          else if(ch=='E'){
            e++;
          }
          else{
            w++;
          }

       int a=Math.min(n,s);
       int b=Math.max(n,s);
       if(k>=a){
        b=b+a;
        k=k-a;
        a=0;
       }
       else{
         b=b+k;
         a=a-k;
         k=0;
       }
       int c=Math.min(e,w);
       int d=Math.max(e,w);
       if(k>=c){
         d=d+c;
         k=k-c;
         c=0;
       }
       else{
        d=d+k;
        c=c-k;
        k=0;
       }

       int hj=b-a;
       int jh=d-c;

       ans=Math.max(ans,Math.abs(jh)+Math.abs(hj));
     }

    return ans;

    }
}