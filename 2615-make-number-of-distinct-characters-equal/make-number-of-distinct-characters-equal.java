class Solution {
    public boolean isItPossible(String word1, String word2) {
        

      int []arr=new int[26];
      int []brr=new int[26];

      for(int i=0;i<word1.length();i++){
         int a=word1.charAt(i)-'a';
         arr[a]++;
      }  
      for(int i=0;i<word2.length();i++){
         int a=word2.charAt(i)-'a';
         brr[a]++;
      } 



      for(int i=0;i<26;i++){
        for(int j=0;j<26;j++){
            if(arr[i]==0 && brr[j]==0)continue;
            if(arr[i]>=1 && brr[j]>=1){
                if(arr[i]>0){
                    brr[i]++;
                    arr[j]++;
                    arr[i]--;
                    brr[j]--;
                    int a=0;
                    int b=0;
                    for(int k=0;k<26;k++){
                        if(arr[k]!=0)a++;
                    }
                    for(int k=0;k<26;k++){
                        if(brr[k]!=0)b++;
                    }
                    if(a==b)return true;
                    arr[j]--;
                    brr[i]--;
                    arr[i]++;
                    brr[j]++;
                }
                if(brr[j]>0){
                    brr[i]++;
                    arr[j]++;
                    arr[i]--;
                    brr[j]--;
                    int a=0;
                    int b=0;
                    for(int k=0;k<26;k++){
                        if(arr[k]!=0)a++;
                    }
                    for(int k=0;k<26;k++){
                        if(brr[k]!=0)b++;
                    }
                    if(a==b)return true;
                    arr[j]--;
                    brr[i]--;
                    arr[i]++;
                    brr[j]++;
                }
            }
        }
      } 

      return false;
    }
}