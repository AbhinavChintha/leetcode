class Solution {
    public boolean isIsomorphic(String s, String t) {
        if(s.length()!=t.length())return false;
        HashMap<Character,Character> h1=new HashMap<>();
        HashMap<Character,Character> h2=new HashMap<>();
        for(int i=0;i<s.length();i++){
            char chars=s.charAt(i);
            char chart=t.charAt(i);
            if(h1.containsKey(chars)&& h1.get(chars)!=chart ){
                return false;
            }
             else if(h2.containsKey(chart) && h2.get(chart)!=chars){
                        return false;
                }
            
            h1.put(chars,chart);
            h2.put(chart,chars);
        }
        return true;
    }
}