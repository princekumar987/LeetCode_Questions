class Solution {
    public String largestGoodInteger(String num) {
        String s="";
        int n=num.length();
        ArrayList<String>list=new ArrayList<>();
        for(int i=0;i<n-2;i++){
            char ch=num.charAt(i);
            s="";
            if(num.charAt(i+1)==ch && num.charAt(i+2)==ch){
                s=s+ch+ch+ch;
                list.add(s);
            }
         
        }
        Collections.sort(list);
        if(list.size()==0)return s;
        return list.get(list.size()-1);
    }
}