class Solution {
    public int numOfSubarrays(int[] arr) {
        
        int e=1000000007;
        int ans=0;

        int sum=0;
        int odd=0;
        int even=1;

        for(int i=0;i<arr.length;i++){
            sum=sum+arr[i];
            if(sum%2==0){
                ans=(ans+odd)%e;
                even++;
            }
            else{
                ans=(ans+even)%e;
                odd++;  
            }
        }


        return ans;
    }
}