class Solution {

    public double findMedianSortedArrays(int[] nums1, int[] nums2) {

         int m=nums1.length;
         int n=nums2.length;
         int x=m+n;

         int a=0;
         int b=0;

         if(x%2==1){
            a=b=x/2;
         }
         else{
            a=x/2;
            b=a-1;
         }

         int i=0;
         int j=0;
         int count=-1;
         double v1=0;
         double v2=0;

         while(i<m && j<n){
              
              if(nums1[i]<=nums2[j]){
                  count++;
                  if(a==count)v1=nums1[i];
                  if(b==count)v2=nums1[i];
                  i++;
              }
              else{
                  count++;
                  if(a==count)v1=nums2[j];
                  if(b==count)v2=nums2[j];
                  j++;
              }
         }

         while(i<m){
              count++;
              if(a==count)v1=nums1[i];
              if(b==count)v2=nums1[i];
              i++;
         }

         while(j<n){
              count++;
              if(a==count)v1=nums2[j];
              if(b==count)v2=nums2[j];
              j++;
         }

         return (v1+v2)/2;

    }
}