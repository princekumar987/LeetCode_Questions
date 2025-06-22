class Solution {
    public List<List<Integer>> largeGroupPositions(String s) {
        
        List<List<Integer>>ans=new ArrayList<>();
        int count=1;
        int a=0;
        int b=0;

        for(int i=1;i<s.length();i++){
             if(s.charAt(i)==s.charAt(i-1)){
                count++;
             }
             else{
                if(count>=3){
                  List<Integer>list=new ArrayList<>();
                  list.add(a);
                  list.add(i-1);
                  ans.add(list);
                }
                count=1;
                a=i;
                b=i;   
             }
        }

        if(count>=3){
            List<Integer>list=new ArrayList<>();
            list.add(a);
            list.add(s.length()-1);
            ans.add(list);
        }

        return ans;
    }
}