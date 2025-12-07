class Solution {
    public boolean check(int[] arr) {
    
     int a=0; 
     for(int i=0;i<arr.length-1;i++){
         if(arr[i]>arr[i+1]){
            a=i+1;
            break;
         }
     }

     for(int i=a;i<arr.length-1;i++){
          if(arr[i]>arr[i+1])return false;
     }

     if(a!=0 && arr[arr.length-1]>arr[0])return false;

     for(int i=0;i<a-1;i++){
           if(arr[i]>arr[i+1])return false;
     }

     return true;

    }
}