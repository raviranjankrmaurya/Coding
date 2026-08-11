# Single Program: Demonstrating ALL Python Operators

# Input values
a = int(input("Enter first number: "))
b = int(input("Enter second number: "))

# -------------------------------
# 1. Arithmetic Operators
# -------------------------------
print("\n--- Arithmetic Operators ---")
print("Addition:", a + b)
print("Subtraction:", a - b)
print("Multiplication:", a * b)

# Avoid division by zero
if b != 0:
    print("Division:", a / b)
    print("Floor Division:", a // b)
    print("Modulus:", a % b)
else:
    print("Division/Floor/Modulus not possible (b = 0)")

print("Power:", a ** 2)

# -------------------------------
# 2. Comparison Operators
# -------------------------------
print("\n--- Comparison Operators ---")
print("a == b:", a == b)
print("a != b:", a != b)
print("a > b:", a > b)
print("a < b:", a < b)
print("a >= b:", a >= b)
print("a <= b:", a <= b)

# -------------------------------
# 3. Assignment Operators
# -------------------------------
print("\n--- Assignment Operators ---")
x = a
x += b   # x = x + b
print("x += b:", x)

x -= b
print("x -= b:", x)

x *= b
print("x *= b:", x)

if b != 0:
    x /= b
    print("x /= b:", x)

# -------------------------------
# 4. Logical Operators
# -------------------------------
print("\n--- Logical Operators ---")
print("(a > 0 and b > 0):", a > 0 and b > 0)
print("(a > 0 or b > 0):", a > 0 or b > 0)
print("not(a > b):", not(a > b))

# -------------------------------
# 5. Bitwise Operators
# -------------------------------
print("\n--- Bitwise Operators ---")
print("a & b:", a & b)
print("a | b:", a | b)
print("a ^ b:", a ^ b)
print("~a:", ~a)
print("a << 1:", a << 1)
print("a >> 1:", a >> 1)

# -------------------------------
# 6. Membership Operators
# -------------------------------
print("\n--- Membership Operators ---")
lst = [a, b, 10, 20]
print("a in list:", a in lst)
print("5 not in list:", 5 not in lst)

# -------------------------------
# 7. Identity Operators
# -------------------------------
print("\n--- Identity Operators ---")
c = a
print("a is c:", a is c)
print("a is not b:", a is not b)

# -------------------------------
# 8. Ternary Operator
# -------------------------------
print("\n--- Ternary Operator ---")
result = "a is greater" if a > b else "b is greater or equal"
print(result)

# -------------------------------
# 9. Walrus Operator (Advanced)
# -------------------------------
print("\n--- Walrus Operator ---")
if (n := a + b) > 10:
    print("Sum is greater than 10:", n)
else:
    print("Sum is:", n)

# -------------------------------
# 10. Special Operators (* unpacking)
# -------------------------------
print("\n--- Unpacking Operator ---")
values = [1, 2, 3]
print("Unpacked values:", *values)

# -------------------------------
# End of Program
# -------------------------------
print("\nProgram Completed Successfully!")
