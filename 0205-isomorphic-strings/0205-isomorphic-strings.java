class Solution {
    public boolean isIsomorphic(String s, String t) {
        HashMap<Character,Character> h1=new HashMap<>();
        HashMap<Character,Character> h2=new HashMap<>();
        for(int i=0;i<s.length();i++){
            char cs=s.charAt(i);
            char ct=t.charAt(i);
            if(h1.containsKey(cs)){
                if(h1.get(cs)!=ct)return false;
            }
            else{
                h1.put(cs,ct);
            }
            if(h2.containsKey(ct)){
                if(h2.get(ct)!=cs)return false;
            }
            else{
                h2.put(ct,cs);
            }
        }
        return true;
    }
}