from ast import List
from itertools import count



def findNumbers(nums):
    count = 0
    for i in nums:
        size = len(str(i))
        # print(size)

        if(size % 2 ==0):
            count+=1
        
    print (count)
        
    
arr =(12,345,2,6,7896)
findNumbers(arr)