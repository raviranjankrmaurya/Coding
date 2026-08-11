# python calculator

operator = input("Enter an operator (+ - * / ^ %): ")
num1 = float(input("Enter 1st Number: "))
num2 = float(input("Enter 2nd Number: "))

match operator:
    case '+':
            print(f"Addition of {num1} and {num2} are {num1+num2}")
    case '-':
            print(f"Substraction of {num1} and {num2} are {num1-num2}")
    case '*':
            print(f"Multiplication of {num1} and {num2} are {num1*num2}")
            
    case '/':
            print(f"Division of {num1} and {num2} are {num1/num2}")
    case '^':
            print(f"Square of {num1} and {num2} are {num1**num2}")
    case '%':
            print(f"Moduls of {num1} and {num2} are {num1%num2}")
    case _:
            print("Please Select volid operator")
    
    
    
    
