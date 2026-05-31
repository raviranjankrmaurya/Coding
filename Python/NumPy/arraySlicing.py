import numpy as np

array = np.array([[1,2,3,4],
                  [5,6,7,8],
                  [9,10,11,12],
                  [13,14,15,16]])

# array[start:end:step]

print(array[1:3])
print(array[0:4:2])

print(array[:,0]) # : -> select all rows and print all 0 colomns elements [1,5,9,13]
print(array[:,2]) #[3,7,11,15]
print(array[:,-1]) # [4,8,12,16]

print(array[:, 1:])
print(array[:, 1::2])
print(array[:, ::2])
print(array[:, 0:3:2])
print(array[:, ::-1])
print(array[:, -2::-1])



# for newArray in array:
#     for arr in newArray:
#         print(arr,end=' ')
#     print('\n')
