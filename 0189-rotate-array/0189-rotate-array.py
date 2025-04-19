class Solution:
    def revers(self, nums: List[int], s: int, e: int) -> None:
        while s<e:
            temp=nums[s]
            nums[s]=nums[e]
            nums[e]=temp
            s+=1
            e-=1
    def rotate(self, nums: List[int], k: int) -> None:
        k=k%len(nums)
        self.revers(nums,0,len(nums)-1)
        self.revers(nums,0,k-1)
        self.revers(nums,k,len(nums)-1)


    