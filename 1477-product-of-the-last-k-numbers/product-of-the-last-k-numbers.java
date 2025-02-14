class ProductOfNumbers {
    
    ArrayList<Integer>list=new ArrayList<>();
    public ProductOfNumbers() {
        list.clear();
    }
    
    public void add(int num) {
         if(num==0){
            list.clear();
            return ;
         }
         if(list.size()==0){
            list.add(num);
         }
         else{
            num=num*list.get(list.size()-1);
            list.add(num);
         }
        // System.out.println(list);
    }
    
    public int getProduct(int k) {
        if(k>list.size()){
            return 0;
        }
        else if(list.size()==k){
            return list.get(list.size()-1);
        }
        else{
            return list.get(list.size()-1)/list.get(list.size()-k-1);
        }
    }
}

/**
 * Your ProductOfNumbers object will be instantiated and called as such:
 * ProductOfNumbers obj = new ProductOfNumbers();
 * obj.add(num);
 * int param_2 = obj.getProduct(k);
 */