class Solution {
    public int numberOfSubstrings(String s) {
        
       int j=0;
       int a=0;
       int b=0;
       int c=0;
       int ans=0;
       int sd=-1;
      
       for(int i=0;i<s.length();i++){
            
            if(a!=0 && b!=0 && c!=0){
                 ans=ans+(s.length()-(sd));
                 if(s.charAt(i)=='a')a--;
                 else if(s.charAt(i)=='b')b--;
                 else c--;
            }
            else{
                boolean p=false;
                while(j<s.length()){
                  if(s.charAt(j)=='a')a++;
                  else if(s.charAt(j)=='b')b++;
                  else c++;
                  j++;
                  if(a!=0 && b!=0 && c!=0){
                      sd=j-1;
                      p=true;
                      break;
                  }
              }
              if(p==false || sd==-1)break;

              ans=ans+s.length()-sd;
              if(s.charAt(i)=='a')a--;
              else if(s.charAt(i)=='b')b--;
              else c--;
            }
       }

       return ans;

        
    }
}