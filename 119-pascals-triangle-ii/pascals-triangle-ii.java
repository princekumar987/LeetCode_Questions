class Solution {
    public List<Integer> getRow(int rowIndex) {
          rowIndex++;
          List<Integer>list=new ArrayList<>();
          long val=1;
          list.add((int)val);

          for(int i=1;i<rowIndex;i++){
              val=val*(rowIndex-i)/i;
              list.add((int)val);
          }

          return list;
    }
}