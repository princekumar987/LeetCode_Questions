class Solution {

    HashSet<List<Integer>>st=new HashSet<>();

    public  void fun(int []arr, List<List<Integer>> ans, List<Integer>list, int target, int idx){
           
           if(idx==arr.length || target<0)return ;

           if(target==0){
              if(!st.contains(list)){
                ans.add(new ArrayList(list));
                st.add(list);
              }
                return ;
           }

           list.add(arr[idx]); 
           fun(arr,ans,list,target-arr[idx],idx+1);
           fun(arr,ans,list,target-arr[idx],idx);
           list.remove(list.size()-1);
           fun(arr,ans,list,target,idx+1);
    }

    
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
          

          List<List<Integer>>ans=new ArrayList<>();
          List<Integer>list=new ArrayList<>();

          fun(candidates,ans,list,target,0);

          return  ans;
        
    }
}