class Solution {
    public int removeDuplicates(int[] nums) {
        LinkedHashSet<Integer> h=new LinkedHashSet<>();
        for(int i=0;i<nums.length;i++){
            h.add(nums[i]);
        }
        int index=0;
        for(int i:h){
            nums[index++]=i;
        }
        return h.size();
    }
}