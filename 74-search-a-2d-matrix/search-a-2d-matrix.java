class Solution {

    public static boolean check(int [][]matrix,int row,int target){

        int i=0;
        int j=matrix[0].length-1;

        while(i<=j){
             int mid=(i+j)/2;
             if(matrix[row][mid]==target) return true;
             else if(matrix[row][mid]>target)j=mid-1;
             else i=mid+1; 
        }

        return false;

    }
    public boolean searchMatrix(int[][] matrix, int target) {
       
       int m=matrix.length;
       int n=matrix[0].length;

       for(int i=0;i<m;i++){
           
           if(matrix[i][0]<=target && matrix[i][n-1]>=target){
                return check(matrix,i,target);
           }
       }

       return false;
       
    }
}