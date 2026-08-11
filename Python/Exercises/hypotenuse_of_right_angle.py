import math
# c = √(a²+b²)

a = float(input("Enter the side A: "))
b = float(input("Enter the side B: "))

c = math.sqrt(math.pow(a,2) + math.pow(b,2))
print(f"Side C: {round(c,2)}")