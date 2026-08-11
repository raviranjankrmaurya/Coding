#typecasting = it's process to converting one data type to another {str(), int(), float(), bool()}

name = "ravi"
age = 20
is_Student = True
gpa = 7.8

print(type(name))
print(type(age))
print(type(is_Student))
print(type(gpa))
print(f"add 2 in your age {age + 2}")

#float to int
gpa = int(gpa)
print(type(gpa),gpa)

#int to string
age = str(age)
print(type(age),age)
#print(f"after age converting string add 4 {age + 4}") error because not add any integer no in string
print(f"after age converting string add '4' {age + '4'}")

#strint to boolean
str1 = "maurya"
str2 = ""

print(bool(str1))
print(bool(str2))