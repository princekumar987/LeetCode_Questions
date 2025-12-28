class Solution {
    public List<List<Integer>> generate(int numRows) {
         
         List<List<Integer>>ans=new ArrayList<>();
         List<Integer>list=new ArrayList<>();
         list.add(1);
         ans.add(list);
         for(int j=2;j<=numRows;j++){
              List<Integer>l=new ArrayList<>();
              l.add(1);
              for(int i=0;i<ans.get(ans.size()-1).size()-1;i++){
                    l.add(ans.get(ans.size()-1).get(i)+ans.get(ans.size()-1).get(i+1));
              }
              l.add(1);
              ans.add(l);
         }

         return ans;
    }
}