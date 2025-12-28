class Solution {

    public static void print(int[][]matrix,List<Integer>ans){

        int startrow=0;
        int startcol=0;
        int endrow=matrix.length-1;
        int endcol=matrix[0].length-1;

        while(startrow<=endrow && startcol<=endcol){
               
               // start row
               for(int i=startcol;i<=endcol;i++){
                    ans.add(matrix[startrow][i]);
               }
               startrow++;
              
               // end column
               for(int j=startrow;j<=endrow;j++){
                    ans.add(matrix[j][endcol]);
               }
               endcol--;
              
               // end row
               if(startrow<=endrow){
                 for(int i=endcol;i>=startcol;i--){
                    ans.add(matrix[endrow][i]);
                 }
                 endrow--;
               }
               
               // start column
                if(startcol<=endcol){
                 for(int j=endrow;j>=startrow;j--){
                    ans.add(matrix[j][startcol]);
                 }
                 startcol++;
                }
                
        }
    }
   
        
    public List<Integer> spiralOrder(int[][] matrix) {
          List<Integer>ans=new ArrayList<>();
          print(matrix,ans);

          return ans;
    }
}