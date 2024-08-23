class Solution {
    public int longestConsecutive(int[] nums) {
        int n=nums.length;
        int max=1;

        if(n==0)return 0;
        HashSet<Integer> h=new HashSet<>();
        for(int i=0;i<n;i++){
            h.add(nums[i]);
        }
        for(int i=0;i<n;i++){
            int x=nums[i];
            if(!h.contains(nums[i]-1)){
                        int cnt=1;
            while(h.contains(x+1)){
                x=x+1;
                cnt=cnt+1;
            }
            max=Math.max(max,cnt);
        }
        }
        return max;
    }
}