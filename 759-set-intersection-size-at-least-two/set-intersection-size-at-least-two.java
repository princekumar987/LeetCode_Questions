class Solution {
    public int intersectionSizeTwo(int[][] inter) {
        

        Arrays.sort(inter,Comparator.comparing(o->o[1]));
      
        ArrayList<Integer>list=new ArrayList<>();

        int a=inter[0][1];
        list.add(a);
        list.add(--a);
        
        Collections.sort(list);

        for(int i=1;i<inter.length;i++){

               int c=inter[i][0];
               int d=list.get(list.size()-1);

               if(c==d){

                   list.add(inter[i][1]);

               }
               else if(c>d){

                  int e=inter[i][1];
                  list.add(e);
                  list.add(--e);

               }
               else if(c<d && c>list.get(list.size()-2)){

                     int g=inter[i][1];
                     if(d<inter[i][1]){
                        list.add(inter[i][1]);
                     }
                     else
                     list.add(--g);
                     
               }

              Collections.sort(list);
              
        }


        return list.size();


    }
}