class Solution {
    public long maxWeight(int[] pizzas) {
        
        long ans=0;

        Arrays.sort(pizzas);
        int n=pizzas.length;
        int total=n/4;
        int rem=total%2;
        int first=total/2 +rem;
        int second=total-first;
        int count=0;
        int ind=0;
        System.out.println(first+" "+second);

        for(int i=n-1;i>=0;i--){
             ans=ans+pizzas[i];
             count++;
             if(count==first){
               ind=i;
               break;
             }
        }
        count=0;
        if(second>=1){
         for(int i=ind-2;i>=0;i=i-2){
            ans=ans+pizzas[i];
            count++;
            if(count==second){
                break;
            }
         }
        }


        return ans;
    }
}