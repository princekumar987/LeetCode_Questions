class Solution {
    public void setZeroes(int[][] matrix) {
       
          int m=matrix.length;
          int n=matrix[0].length;
          boolean p=false;
          boolean q=false;

          for(int i=0;i<m;i++){
              for(int j=0;j<n;j++){
                  if(matrix[i][j]==0){
                     if(i==0 &&  j==0){
                        p=true;
                        q=true;
                        continue;
                     }
                     if(i==0){
                        p=true;
                        matrix[0][j]=0;
                        continue;
                     }
                     if(j==0){
                        q=true;
                        matrix[i][0]=0;
                        continue;
                     }
                      matrix[i][0]=0;
                      matrix[0][j]=0;
                  }
              }
          }

          for(int i=1;i<m;i++){
             for(int j=1;j<n;j++){
                 if(matrix[i][0]==0 || matrix[0][j]==0){
                    matrix[i][j]=0;
                 }
             }
          }

          if(matrix[0][0]==0){
               for(int i=0;i<m;i++){
                  matrix[i][0]=0;
               }
               for(int j=0;j<n;j++){
                  matrix[0][j]=0;
               }
          }
          if(p){
               for(int i=1;i<n;i++){
                  matrix[0][i]=0;
               }   
          }

          if(q){
               for(int i=1;i<m;i++){
                  matrix[i][0]=0;
               }   
          }
          if(p || q){
             matrix[0][0]=0;
          }

    }
}