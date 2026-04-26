class Solution {

    boolean isVowel(char c) {
    return c=='a'||c=='e'||c=='i'||c=='o'||c=='u';
}
    public String sortVowels(String s) {

        HashMap<Character,Integer>mp1=new HashMap<>();
        HashMap<Character,Integer>mp2=new HashMap<>();
        int count=0;

        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u'){
             if(mp2.containsKey(ch)){
                mp2.put(ch,mp2.get(ch)+1);
             }
             else{
                mp2.put(ch,1);
                mp1.put(ch,count++);
             }
            }
        }

        int [][]arr=new int[mp1.size()][2];
        int k=0;

        for(char ch:mp1.keySet()){
             arr[k][0]=(int)ch;
             arr[k][1]=mp1.get(ch);
             k++;
        }

        Arrays.sort(arr, (a, b) -> {
             char chA = (char) a[0];
             char chB = (char) b[0];

          if (!mp2.get(chA).equals(mp2.get(chB))) {
              return mp2.get(chB) - mp2.get(chA);
           } else {
              return mp1.get(chA) - mp1.get(chB);
           }
         });

        
       k = 0;
StringBuilder sb = new StringBuilder(s);

for (int i = 0; i < arr.length; i++) {
    char ch = (char) arr[i][0];
    int freq = mp2.get(ch);

    while (freq > 0) {
        // move k to next vowel
        while (k < s.length() && !isVowel(s.charAt(k))) {
            k++;
        }

        if (k < s.length()) {
            sb.setCharAt(k, ch);
            k++;
            freq--;
        }
    }
}

            return sb.toString();
    }
}