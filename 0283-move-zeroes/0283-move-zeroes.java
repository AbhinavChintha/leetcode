class Solution {
    public void moveZeroes(int[] nums) {
        int l=0,r=0;
        int n=nums.length;
        for(int i=r;i<n;i++){
            if(nums[i]!=0){
                int temp=nums[l];
                nums[l]=nums[i];
                nums[i]=temp;
                l++;
            }
        }
    }
}