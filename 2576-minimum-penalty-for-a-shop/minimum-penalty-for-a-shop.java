class Solution {
    public int bestClosingTime(String customers) {
        
        int ncount=0;
        int ycount=0;

        for(int i=0;i<customers.length();i++){
            if(customers.charAt(i)=='Y')ycount++;
            else ncount++;
        }
        
        int max=Integer.MAX_VALUE;;
        int ncount1=0;
        int ycount2=0;
        int ans=0;
        for(int i=0;i<customers.length();i++){
              int sum=(ycount-ycount2)+ncount1;
              if(sum<max){
                  max=sum;
                  ans=i;
              } 
              if(customers.charAt(i)=='Y')ycount2++;
              else ncount1++;
        }
        
         int sum=(ycount-ycount2)+ncount1;
         if(sum<max){
             max=sum;
             ans=customers.length();
          } 

        return ans;
    }
}