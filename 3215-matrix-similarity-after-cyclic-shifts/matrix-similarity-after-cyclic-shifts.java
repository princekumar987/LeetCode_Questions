class Solution {
    public boolean areSimilar(int[][] mat, int k) {
           
           k=k%mat[0].length;

           for(int i=0;i<mat.length;i++){
              for(int j=0;j<mat[0].length;j++){
                  if(i%2==0){
                      int a=j-k;
                      if(a<0){
                          a=mat[0].length+a;
                      }
                      if(mat[i][j]!=mat[i][a])return false;
                  }
                  else{
                      int a=j+k;
                      if(a>=mat[0].length){
                          a=a%k;
                      }
                      if(mat[i][j]!=mat[i][a])return false;
                  }
              }
           }

           return true;
    }
}