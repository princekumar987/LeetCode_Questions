class Solution {
    public List<Integer> maxPrimes(int n, int s) {
              
              int []prime=new int[n+1];
              List<Integer>ans=new ArrayList<>();
              Arrays.fill(prime,1);
              prime[0]=0;
              prime[1]=1;
              long sum=0;

              for(int i=2;i<=n;i++){
                  if(prime[i]==1){
                      for(int j=i*2;j<=n;j+=i){
                           prime[j]=0;
                      }
                  }
                  if(prime[i]==1 && sum+i<=s){
                      sum+=i;
                      ans.add(i);
                  }
              }

              return ans;
    }
}