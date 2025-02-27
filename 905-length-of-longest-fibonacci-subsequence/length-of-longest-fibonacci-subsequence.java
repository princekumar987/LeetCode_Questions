class Solution {
    public int lenLongestFibSubseq(int[] arr) {
        

        int ans=0;

        HashSet<Integer>st=new HashSet<>();

        for(int i=0;i<arr.length;i++){
            st.add(arr[i]);
        }

        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                int a=arr[i];
                int b=arr[j];
                int count=2;
                while(true){
                   int x=a+b;
                   if(st.contains(x)){
                    count++;
                    a=b;
                    b=x;
                   }
                   else{
                    ans=Math.max(ans,count);
                    break;
                   }
                }
            }
        }
        
        if(ans>2)return ans;
        return 0;
    }
}