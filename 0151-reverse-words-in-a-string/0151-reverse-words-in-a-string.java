class Solution {
    public String reverseWords(String s) {
       StringBuilder str=new StringBuilder();
       String[] sa=s.trim().split("\\s+");
       int n=sa.length;
       for(int i=n-1;i>=0;i--){
        str.append(sa[i]);
        if(i!=0){
            str.append(" ");
        }
       }
       return str.toString();

    }
}