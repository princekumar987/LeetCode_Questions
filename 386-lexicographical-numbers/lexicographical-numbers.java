class Solution {
    public List<Integer> lexicalOrder(int n) {

        List<String>list=new ArrayList<>();

        for(int i=1;i<=n;i++){
             list.add(""+i);
        }

        Collections.sort(list);

        List<Integer>ans=new ArrayList<>();

        for(int i=0;i<list.size();i++){
             ans.add(Integer.valueOf(list.get(i)));
        }

        return ans;
    }
}