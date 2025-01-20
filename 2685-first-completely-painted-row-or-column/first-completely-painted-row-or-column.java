class Solution {

    public int firstCompleteIndex(int[] arr, int[][] mat) {

       
        HashMap<Integer,int[]>mp=new HashMap<>();

        int []row=new int[mat.length];
        int []col=new int[mat[0].length];

        for(int i=0;i<mat.length;i++){
            for(int j=0;j<mat[0].length;j++){
                int []ar={i,j};
                mp.put(mat[i][j],ar);
            }
        }
        
        for(int i=0;i<arr.length;i++){
           int []a=mp.get(arr[i]);
           row[a[0]]++;
           col[a[1]]++;

           if(row[a[0]]==mat[0].length || col[a[1]]==mat.length)return i;
        }

        return 0;
        
    }
}