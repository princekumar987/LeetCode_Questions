class Solution {

    static boolean binary(int []arr,int target){

           int low=0;
           int high=arr.length-1; 
           while(low<=high){
               int mid=low+(high-low)/2;
               if(arr[mid]==target)return true;
               else if(arr[mid]>target)high=mid-1;
               else low=mid+1;
           }

           return false;
    }

    public int findKthPositive(int[] arr, int k) {

         int i=1;
         int count=0;

         while(true){
              if(!binary(arr,i)){
                    count++;
                    if(count==k)return i;
              }
              i++;
         }

       
    }
}