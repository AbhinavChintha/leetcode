class Solution {
    public String reverseWords(String s) {
       String[] str=s.trim().split("\\s+");
       String out="";
       for(int i=str.length-1;i>=0;i--){
        out+=str[i];
        if(i>0){
            out+=" ";
        }
       }
       return out;
    }
}