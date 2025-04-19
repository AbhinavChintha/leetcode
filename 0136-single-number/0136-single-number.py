class Solution:
    def singleNumber(self, nums: List[int]) -> int:
        hash={}
        key1=-1
        for i in nums:
            if i in hash:
                hash[i]+=1
            else:
                hash[i]=1
        for key,value in hash.items():
            if value==1:
                key1=key
        return key1