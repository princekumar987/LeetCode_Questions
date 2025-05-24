class Solution {


    public static boolean fun(String s){

        Long x=Long.valueOf(s);

        if(x==1)return false;
        if(x==2 || x==3)return true;

        for(int i=2;i<=Math.sqrt(x);i++){
            if(x%i==0)return false;
        }


        return true;


    }
    public long sumOfLargestPrimes(String s) {
        
        long ans=0;

        HashSet<Long>st=new HashSet<>();

        for(int i=0;i<s.length();i++){
            for(int j=i;j<s.length();j++){
                String p=s.substring(i,j+1);
                if(fun(p)){
                   st.add(Long.valueOf(p));
                }
            }
        }

      
        ArrayList<Long>list=new ArrayList<>();

        for(Long e:st){
           list.add((long)e);
        }

        Collections.sort(list);
        int a=list.size();
        
        if(a>=3){
            return list.get(a-1)+list.get(a-2)+list.get(a-3);
        }
        else if(a==2){
            return list.get(a-1)+list.get(a-2);
        }
        else if(a==1){
            return list.get(0);
        }
        else{
            return 0;
        }
       
    }
}