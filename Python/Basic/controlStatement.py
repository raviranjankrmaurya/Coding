# if = Do some code only IF some condition is True ,Else do something else

# Single Program: Demonstrating ALL Control Statements

# Input
num = int(input("Enter a number: "))

# -----------------------------------
# 1. IF, IF-ELSE, IF-ELIF-ELSE
# -----------------------------------
print("\n--- Conditional Statements ---")

if num > 0:
    print("Positive Number")

if num % 2 == 0:
    print("Even Number")
else:
    print("Odd Number")

# if-elif-else ladder
if num > 0:
    print("Greater than 0")
elif num == 0:
    print("Number is Zero")
else:
    print("Negative Number")

# Nested if
if num > 0:
    if num < 100:
        print("Number is between 1 and 99")

# -----------------------------------
# 2. MATCH-CASE (Python 3.10+)
# -----------------------------------
print("\n--- Match Case ---")

match num:
    case 1:
        print("One")
    case 2:
        print("Two")
    case _:
        print("Other Number")

# -----------------------------------
# 3. FOR LOOP
# -----------------------------------
print("\n--- For Loop ---")

for i in range(1, 6):
    print("i =", i)

# -----------------------------------
# 4. WHILE LOOP
# -----------------------------------
print("\n--- While Loop ---")

i = 1
while i <= 3:
    print("While i =", i)
    i += 1

# -----------------------------------
# 5. BREAK, CONTINUE, PASS
# -----------------------------------
print("\n--- Jump Statements ---")

for i in range(1, 6):
    if i == 3:
        continue   # skip 3
    if i == 5:
        break      # stop loop
    print("Value:", i)

# pass example
for i in range(2):
    pass   # does nothing (placeholder)

# -----------------------------------
# 6. LOOP ELSE (Advanced)
# -----------------------------------
print("\n--- Loop Else ---")

for i in range(3):
    print(i)
else:
    print("Loop completed without break")

# -----------------------------------
# 7. NESTED LOOP
# -----------------------------------
print("\n--- Nested Loop ---")

for i in range(1, 4):
    for j in range(1, 3):
        print(f"i={i}, j={j}")

# -----------------------------------
# 8. TERNARY (SHORT IF-ELSE)
# -----------------------------------
print("\n--- Ternary Operator ---")

result = "Even" if num % 2 == 0 else "Odd"
print("Result:", result)

# -----------------------------------
# 9. SHORT-CIRCUIT (Advanced Logic)
# -----------------------------------
print("\n--- Short Circuit ---")

print(num > 0 and "Positive")
print(num < 0 or "Not Negative")

# -----------------------------------
# End
# -----------------------------------
print("\nProgram Completed Successfully!")