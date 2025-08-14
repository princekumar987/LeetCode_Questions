class Solution {
    public String largestGoodInteger(String nums) {
       
       List<String>list=new ArrayList<>();
       for(int i=0;i<nums.length()-2;i++){
          
          if(nums.charAt(i)==nums.charAt(i+1) && nums.charAt(i)==nums.charAt(i+2)){
               list.add(""+nums.charAt(i)+nums.charAt(i+1)+nums.charAt(i+2));
          }
       }

       Collections.sort(list);

       if(list.size()!=0){
          return list.get(list.size()-1);
       }
       else{
          return "";
       }
    }
}