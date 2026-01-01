class Solution {
    public int searchInsert(int[] arr, int target) {
          
          int low=0;
          int high=arr.length-1;
          int mid=0;
          int ans=0;

          while(low<=high){
               
               mid=low+(high-low)/2;
               System.out.println(mid);
               if(arr[mid]==target)return mid;
               else if(arr[mid]>target){
                   high=mid-1;
                   ans=high;
               }
               else{
                   low=mid+1;
                   ans=low;
               } 
          }

          if(ans<0)return 0;
          if(ans==arr.length)return ans;

          if(arr[ans]<target)ans++;
          
          
          return ans;
    }
}