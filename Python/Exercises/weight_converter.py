# Python weight converter

unit = input("Enter Unit Which You Want convert your Weight {K for Kilograms, L for Pounds(K/L)}: ")
match unit:
    case 'K':
        weight = float(input("Enter your weight in pounds: "))
        print(f"Your weight in Kilogram: {round((weight / 2.205),2)}kgs")
    case 'L':
        weight = float(input("Enter your weight in kilogram: "))
        print(f"Your weight in Pounds: {round((weight * 2.205),2)}lbs")
    case _:
        print("involid input, plz chose(K/L)")
            
