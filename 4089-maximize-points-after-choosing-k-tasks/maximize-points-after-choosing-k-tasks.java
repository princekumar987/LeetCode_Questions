class Solution {
    public long maxPoints(int[] technique1, int[] technique2, int k) {
        
       ArrayList<int[]>list=new ArrayList<>();
       int n=technique1.length;
       
       int count=0;

       long answer=0;

       for(int i=0;i<n;i++){
          if(technique1[i]>=technique2[i]){
              answer+=technique1[i];
              count++;
          }
          else{
              int []arr=new int[2];
              arr[0]=Math.abs(technique1[i]-technique2[i]);
              arr[1]=i;
              list.add(arr);
          }
       }

       if(k>=count){
          k=k-count;
       }
       else{
          k=0;
       }

       int [][]ans=new int[list.size()][2];

       for(int i=0;i<list.size();i++){
          ans[i][0]=list.get(i)[0];
          ans[i][1]=list.get(i)[1];
       }

       Arrays.sort(ans,Comparator.comparing(o->o[0]));
       
       int i=0;
       for(i=0;i<k;i++){
           answer+=technique1[ans[i][1]];
       }

       for(int j=i;j<ans.length;j++){
           answer+=Math.max(technique1[ans[j][1]],technique2[ans[j][1]]);
       }

      return answer;
    }
}