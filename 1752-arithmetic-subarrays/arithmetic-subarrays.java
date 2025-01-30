class Solution {
    public List<Boolean> checkArithmeticSubarrays(int[] nums, int[] l, int[] r) {
        

        int n=nums.length;
        int m=l.length;
        List<Boolean>ans=new ArrayList<>();
        HashSet<Integer>st=new HashSet<>();

        for(int i=0;i<m;i++){

           int a=l[i];
           int b=r[i];

           ArrayList<Integer>list=new ArrayList<>();

           for(int j=a;j<=b;j++){
              list.add(nums[j]);
           }

           Collections.sort(list);
           boolean p=true;

           if(list.size()<=1)p=false;
           
           for(int j=0;j<list.size()-1;j++){
              st.add(list.get(j+1)-list.get(j));
           }

           if(st.size()==1 && p){
              ans.add(true);
           }
           else{
              ans.add(false);
           }

           st.clear();

        }


        return ans;
    }
}