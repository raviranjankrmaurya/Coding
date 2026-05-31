import numpy as np

#---0-DimentionalArray---
array = np.array('A')
print(array)
print(array.ndim) # 0
print(array.shape)

#---1-DimentionalArray---
array1 = np.array(['A','B','C'])
print(array1)
print(array1.ndim) # 1
print(array1.shape)

#-------2D Array--------
array2 = np.array([['A','B','C'],
                   ['D','E','F'],
                   ['I','J','K']])
print(array2)
print(array2.ndim) # 2
print(array2.shape) #(3, 3)

#-------3D Array--------
array3 = np.array([[['A','B','C'],['D','E','F'],['I','J','K']],
                   [['M','N','O'],['O','P','Q'],['R','S','T']]])
print(array3)
print(array3.ndim) # 3
print(array3.shape) #(2, 3, 3)

print(array3[1][0][0]) # M
#--------OR----------
print(array3[1,0,1])