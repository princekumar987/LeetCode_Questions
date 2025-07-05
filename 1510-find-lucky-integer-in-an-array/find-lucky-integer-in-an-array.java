class Solution {
    public int findLucky(int[] arr) {
       
      List<Integer>list= Arrays.stream(arr).boxed().collect(Collectors.groupingBy(Function.identity(),Collectors.counting())).entrySet().stream().filter(x->x.getKey()==x.getValue().intValue()).map(x->x.getKey()).sorted().collect(Collectors.toList());
      

     if(list.size()==0)return -1;
     return list.get(list.size()-1);
    }
}