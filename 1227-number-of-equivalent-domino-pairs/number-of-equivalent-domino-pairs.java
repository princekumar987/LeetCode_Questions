class Solution {
    public int numEquivDominoPairs(int[][] arr) {
         
         HashMap<Integer,Integer>mp=new HashMap<>();
         int ans=0;

         for(int i=0;i<arr.length;i++){

             int a=arr[i][0];
             int b=arr[i][1];

             int []ab={a,b};
             Arrays.sort(ab);
             int c=10*ab[0]+ab[1];
             if(mp.containsKey(c)){
                 mp.put(c,mp.get(c)+1);
             }
             else{
                mp.put(c,1);
             }
         }

         for(Integer e:mp.keySet()){
            int x=mp.get(e);
            int p=(x*(x-1))/2;
            ans=ans+p;
         }

         return ans;
    }
}