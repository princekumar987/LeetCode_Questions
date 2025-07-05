class Solution {
    public int findLucky(int[] arr) {
        HashMap<Integer,Integer>mp=new HashMap<>();
        for(int i=0;i<arr.length;i++){
            int x=arr[i];
            if(mp.containsKey(x)){
                mp.put(x,mp.get(x)+1);
            }
            else{
                mp.put(x,1);
            }
        }
        int max=-1;
        for(Integer e:mp.keySet()){
            if(e==mp.get(e)){
                max=Math.max(max,e);
            }
        }
        return max;
    }
}