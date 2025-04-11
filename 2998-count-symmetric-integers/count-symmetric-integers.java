class Solution {
    public int countSymmetricIntegers(int low, int high) {
        
        int count=0;
        for(int i=low ;i<=high;i++){
            String str=String.valueOf(i);
            if(str.length()%2!=0)continue;
           
            int n=str.length()/2;
            int sum=0;
            int sum1=0;
            String s=str.substring(0,n);
            String p=str.substring(n);
            int a=Integer.valueOf(s);
            int b=Integer.valueOf(p);
            while(a>0 || b>0){
                int rem=a%10;
                sum=sum+rem;
                a=a/10;
                int rem1=b%10;
                sum1=sum1+rem1;
                b=b/10;
            }
            if(sum==sum1)count++;
            
        }
        return count;
        
    }
}