class Solution {

    static HashSet<List<Integer>>st=new HashSet<>();

    public static void function(int idx,int[]arr,int target,int s,List<List<Integer>>ans,List<Integer>list,int sum){


        if(idx==9){
             if(target==sum && list.size()==s && !st.contains(list)){
                ans.add(new ArrayList<>(list));
                st.add(list);
             }
             return ;
        }


        if(sum<=target){

            list.add(arr[idx]);
            function(idx+1,arr,target,s,ans,list,sum+arr[idx]);
            list.remove(list.size()-1);

        }

        function(idx+1,arr,target,s,ans,list,sum);

        

    }

    public List<List<Integer>> combinationSum3(int k, int n) {
        
        List<List<Integer>>ans=new ArrayList<>();
        List<Integer>list=new ArrayList<>();

        int []arr={1,2,3,4,5,6,7,8,9};

        function(0,arr,n,k,ans,list,0);

        return ans;
    }
}