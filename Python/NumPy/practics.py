# from numpy import*
import numpy as np
array = [[1,2,3,4],
        [5,6,7,8],
        [9,10,11,12],
        [13,14,15,16]]
i=0
while i<4:
    j=0
    while j<4:
        a=array[i][j]
        b = a/ 10
        array[i][j] = a+b
        j = j+1
        
    i=i+1
    
aaa = np.array([array])
    
print(aaa)
        

