class Solution {
    public String decodeCiphertext(String encodedText, int rows) {
          
           int n=encodedText.length()%rows==0?encodedText.length()/rows:(encodedText.length()/rows)+1;
           int m=rows;

           char [][]arr=new char[m][n];
           int k=0;

           for(int i=0;i<m;i++){
               for(int j=0;j<n;j++){
                   arr[i][j]=encodedText.charAt(k++);
               }
           }

           StringBuilder sb=new StringBuilder("");
           StringBuilder ans=new StringBuilder("");

           for(int i=0;i<n;i++){
                int l=0;
                int p=i;
                while(l<m && p<n){
                     if(arr[l][p]==' '){
                         ans.append(sb);
                         ans.append(" ");
                         sb=new StringBuilder("");
                         l++;
                         p++;
                     }
                     else{
                        sb.append(arr[l++][p++]);
                     }
                }

           }

           if(sb.length()>0) ans.append(sb);
           int l=-1;
           for(int i=ans.length()-1;i>=0;i--){
              if(ans.charAt(i)!=' '){
                  l=i;
                  break;
              }
           }


           return ans.toString().substring(0,l+1);
    }
}