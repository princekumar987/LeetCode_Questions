class Solution {
    public int candy(int[] ratings) {
       
       int n=ratings.length;
       int []a=new int[n];
       a[0]=1;
       for(int i=1;i<n;i++){
            if(ratings[i]>ratings[i-1]){
                a[i]=a[i-1]+1;
            }
            else{
                a[i]=1;
            }
       }
       int ans=Math.max(a[n-1],1);
       int p=1;
       for(int i=n-2;i>=0;i--){
             if(ratings[i]>ratings[i+1]){
                  p++;
                  ans+=Math.max(a[i],p);
             }
             else{
                 p=1;
                 ans+=Math.max(a[i],1);
             }
       }

       return ans;

    }
}