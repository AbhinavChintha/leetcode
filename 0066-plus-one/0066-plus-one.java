class Solution {
    public int[] plusOne(int[] digits) {
        int n=digits.length;
        int carry=1;
        int sum=0;
        for(int i=n-1;i>=0;i--){
            sum=digits[i]+carry;
            digits[i]=sum%10;
            carry=sum/10;
        }
        if(carry>0){
            int[] res=new int[n+1];
            res[0]=carry;
            for(int i=1;i<res.length;i++){
                res[i]=0;
            }
             return res;
        }
        return digits;
    }
}