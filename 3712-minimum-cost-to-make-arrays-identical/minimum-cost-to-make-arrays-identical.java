class Solution {
    public long minCost(int[] arr, int[] brr, long k) {
        
        long ans1=0;

        for(int i=0;i<arr.length;i++){
            int x=Math.abs(arr[i]-brr[i]);
            ans1=ans1+x;
        }

        long ans2=k;
        Arrays.sort(arr);
        Arrays.sort(brr);

        for(int i=0;i<arr.length;i++){
           int x=Math.abs(arr[i]-brr[i]);
           ans2=ans2+x;
        }


        return Math.min(ans1,ans2);
    }
}