class Solution {
    public boolean reorderedPowerOf2(int n) {
        
        long i=0;
        long x=1;
        List<List<Integer>>list=new ArrayList<>();

        while(x<=Integer.MAX_VALUE){

            x=(long)Math.pow(2,i);
            List<Integer>helper=new ArrayList<>();  
            long s=x;
            while(s>0){
                 int rem=(int)s%10;
                 s=s/10;
                 helper.add(rem);
            }

            Collections.sort(helper);
            list.add(helper);
            i++;

        }

        List<Integer>check=new ArrayList<>();

        while(n>0){

            int r=n%10;
            n=n/10;
            check.add(r);
            
        }

         Collections.sort(check);

        for(i=0;i<list.size();i++){

            List<Integer>l=list.get((int)i);
            if(l.equals(check)){
                return true;
            }
        }



        
      
      return false;
        
    }

    
}