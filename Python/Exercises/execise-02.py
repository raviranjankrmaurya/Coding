# Shopping card program

item = input("what item would you like to buy?: ")
price = float(input("What is the price?: "))
quantity = int(input("how many would you like?: "))
total = price * quantity
print(f"you have bought {quantity} x {item}/s")
print(f"your total is: ₹{total}")