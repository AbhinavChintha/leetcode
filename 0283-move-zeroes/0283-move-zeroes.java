class Solution {
    public void moveZeroes(int[] nums) {
        int n=nums.length;
        int j=0;
        int[] arr=new int[n];
        Arrays.fill(arr,0);
        for(int i=0;i<nums.length;i++){
            if(nums[i]!=0){
                arr[j]=nums[i];
                j++;
            }
            
        }
        for(int i=0;i<n;i++){
            nums[i]=arr[i];
        }
    }
}