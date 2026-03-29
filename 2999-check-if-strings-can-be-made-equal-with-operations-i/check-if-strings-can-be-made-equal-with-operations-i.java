class Solution {
    public boolean canBeEqual(String s1, String s2) {
        boolean p=false;
        if((s1.charAt(0)==s2.charAt(0) && s1.charAt(2)==s2.charAt(2)) ||
          (s1.charAt(2)==s2.charAt(0) && s1.charAt(0)==s2.charAt(2)) ){
              p=true;
          }
          boolean q=false;
        if((s1.charAt(1)==s2.charAt(1) && s1.charAt(3)==s2.charAt(3)) ||
          (s1.charAt(1)==s2.charAt(3) && s1.charAt(3)==s2.charAt(1)) ){
              q=true;
          }

          if(p==true && q==true) return true;
          else return false;
    }
}