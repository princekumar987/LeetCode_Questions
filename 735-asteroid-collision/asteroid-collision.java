class Solution {
    public int[] asteroidCollision(int[] arr) {
        
       Stack<Integer>st=new Stack<>();

       st.add(arr[0]);

       for(int i=1;i<arr.length;i++){
            if(st.size()==0){
                st.push(arr[i]);
                continue;
            }
            if(arr[i]<0){

              while(st.size()>0){

                  if(st.peek()>0 && st.peek()<Math.abs(arr[i])){
                    st.pop();
                    if(st.size()==0){
                        st.push(arr[i]);
                        break;
                    }
                    continue;
                  }
                  if(st.peek()>0 && st.peek()>Math.abs(arr[i])){
                    break;
                  }
                  else if(st.peek()>0 && st.peek()==Math.abs(arr[i])){
                    st.pop();
                    break;
                  }
                  else{
                      st.push(arr[i]);
                      break;
                  }
                  
              }

            }
            else{
                st.push(arr[i]);
            }
       }
       
       int []ans=new int[st.size()];
       
       int j=st.size()-1;
       while(st.size()>0){
           ans[j]=st.pop();
           j--;
       }
      // System.out.println(st);

       return ans;
    }
}