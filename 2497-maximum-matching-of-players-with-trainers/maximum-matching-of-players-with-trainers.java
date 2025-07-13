class Solution {
    public int matchPlayersAndTrainers(int[] players, int[] trainers) {

        ArrayList<Integer>list=new ArrayList<>();
        for(int i=0;i<trainers.length;i++){
             list.add(trainers[i]);
        }

        Arrays.sort(players);
        Collections.sort(list);
         
         int count=0;
        for(int i=0;i<players.length;i++){

           int x=players[i];
           for(int j=0;j<list.size();j++){
               if(list.get(j)>=x){
                   count++;
                   list.remove(j);
                   break;
               }
               else{
                   list.remove(j);
                   j--;
               }
           }
           if(list.size()==0)break;
        }

        return count;
    }
}