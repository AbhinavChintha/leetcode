class Solution:
    def rotate(self, nums: List[int], k: int) -> None:
        """
        Do not return anything, modify nums in-place instead.
        """
        k=k%len(nums)
        lst=[0]*len(nums)
        j=0
        for i in range(len(nums)-k,len(nums)):
            lst[j]=nums[i]
            j=j+1
        for i in range(len(nums)-k):
            lst[j]=nums[i]
            j+=1
        for i in range(len(nums)):
            nums[i]=lst[i]
