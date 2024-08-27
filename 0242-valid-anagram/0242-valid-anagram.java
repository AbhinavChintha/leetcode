class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length()!=t.length())return false;
        HashMap<Character,Integer> h=new HashMap<>();
        for(char c:s.toCharArray()){
            h.put(c,h.getOrDefault(c,0)+1);
        }
        for(int i=0;i<t.length();i++){
            if(!h.containsKey(t.charAt(i))){
              return false;
            }
            h.replace(t.charAt(i),h.get(t.charAt(i))-1);
        }
        for(int i=0;i<t.length();i++){
            if(h.containsKey(t.charAt(i)) && h.get(t.charAt(i))==0){
                h.remove(t.charAt(i));
            }
        }
        return h.size()==0;
        
}
}