class Solution:
    def missingNumber(self, nums: List[int]) -> int:
        n=len(nums)
        ans=n*(n+1)/2
        sum=0
        for i in range(0,len(nums)):
            sum+=nums[i]
        return int(ans-sum)