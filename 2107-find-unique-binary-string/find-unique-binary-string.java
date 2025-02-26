class Solution {
    StringBuilder s;

    public static boolean fun(HashSet<String>st,StringBuilder s, int n){
        if(s.length()==n){
           if(!st.contains(s.toString())){
                    return true;
           }

           return false;
        }


        for(char h='0';h<='1';h++){
            s.append(h);
            if(fun(st,s,n)){
                return true;
            }
            s.deleteCharAt(s.length()-1);
        }

        return false;
    }
    public String findDifferentBinaryString(String[] nums) {

        HashSet<String>st=new HashSet<>();

        for(int i=0;i<nums.length;i++){
            st.add(nums[i]);
        }

        s=new StringBuilder("");

        fun(st,s,nums.length);


        return s.toString();
    }
}