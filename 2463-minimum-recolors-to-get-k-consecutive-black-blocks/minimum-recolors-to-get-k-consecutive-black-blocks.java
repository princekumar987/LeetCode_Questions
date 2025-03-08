class Solution {
    public int minimumRecolors(String s, int k) {
     int min=Integer.MAX_VALUE;
     int c=0;
     for(int i=0;i<s.length()-k+1;i++){
         for(int j=i;j<i+k;j++){
             char ch=s.charAt(j);
             if(ch=='W')
             c++;
         }
         min=Math.min(min,c);
         c=0;
     }
      return min;
    }
}