class Solution {
    public boolean canJump(int[] arr) {
         
         int max=0;

         for(int i=0;i<arr.length-1;i++){
              max=Math.max(max,arr[i]+i);
              if(arr[i]==0 && max<=i)return false;
         }

         return true;
    }
}