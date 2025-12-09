class Solution {

    public static boolean check(int [][]matrix,int target){

        int n=matrix.length;
        int m=matrix[0].length;
        int i=0;
        int j=(n*m)-1;

        while(i<=j){

             int mid=(i+j)/2;
             int row=mid/m;
             int col=mid%m;
             if(matrix[row][col]==target) return true;
             else if(matrix[row][col]>target)j=mid-1;
             else i=mid+1; 
             
        }

        return false;

    }
    public boolean searchMatrix(int[][] matrix, int target) {
       
       return check(matrix,target);
       
    }
}