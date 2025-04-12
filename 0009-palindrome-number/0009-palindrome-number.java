class Solution {
    public boolean isPalindrome(int x) {
        int r=0;
        int a=x;
        while(a!=0){
            int d=a%10;
            r=r*10+d;
            a=a/10;
        }
        if(r==x && x>=0){
            return true;
        }
        return false;
    }
}