class Solution {

    public static String binary(int n){

        String s="";

        while(n>0){
            s=s+n%2;
            n=n/2;
        }

        return s;
    }

    public int[] minOperations(int[] nums) {

        int []ans=new int[nums.length];
        HashMap<Integer,Integer>mp=new HashMap<>();

        for(int i=0;i<nums.length;i++){
            int x=nums[i];

            if(mp.containsKey(x)){
                ans[i]=mp.get(x);
                continue;
            }

            int a=x;

            while(true){

                 String s=Integer.toBinaryString(a);
                 int j=0;
                 int k=s.length()-1;
                 boolean p=true;
                 while(j<k){
                    if(s.charAt(j)!=s.charAt(k))p=false;
                    j++;
                    k--;
                 }
                 if(p)break;
                 a--;
            }

            int b=x;

            while(true){

                String s=Integer.toBinaryString(b);
                 int j=0;
                 int k=s.length()-1;
                 boolean p=true;
                 while(j<k){
                    if(s.charAt(j)!=s.charAt(k))p=false;
                    j++;
                    k--;
                 }
                 if(p)break;
                 b++;
            }

            ans[i]=Math.min(x-a,b-x);
            mp.put(x,ans[i]);
            
        }

        return ans;
        
    }
}