import math

# constants
print(math.pi)
print(math.e)
print(math.tau)
print(math.inf)
print(math.nan)

# Square Root & Powers

print(math.sqrt(25))    # generally returns float -> 5.0
print(math.sqrt(34))    # 5.830951894845301
print(math.pow(2,4))    # generally returns float -> 16.0
print(math.isqrt(25))   # 5
print(math.isqrt(34))   # 5

# Floor, Ceiling & Truncation

# round downward
print(math.floor(3.9))  # 3
print(math.floor(-3.2)) # -4.0

# round roward
print(math.ceil(3.2))  # 4
print(math.ceil(-3.2)) # -3

# trunc() remove decimal part
print(math.trunc(3.9))  # 3
print(math.trunc(-3.9)) # -3


# Factorial, Permutation & Combinatorics
print(math.factorial(5))  # 120
print(math.comb(5, 2))    # 10  (⁵c₂)
print(math.perm(5, 2))    # 10  (⁵p₂)



# Built-in Functions


print(abs(-10))             # 10
print(pow(2, 3))            # 8
print(round(3.14159, 2))    # 3.14
print(min(10, 20, 5))       # 5
print(max(10, 20, 5))       # 20
print(sum([1, 2, 3, 4]))    # 10


x = 3.14159

result = round(x)
print(result)     # 3

print(sum((2,3,4,5))) 
print(sum({2,4,5,7,8,9}))

# Python Mathematics
# │
# ├── 1. Arithmetic Operators
# │
# ├── 2. Built-in Math Functions
# │   ├── abs()
# │   ├── pow()
# │   ├── round()
# │   ├── min()
# │   ├── max()
# │   └── sum()
# │
# ├── 3. math Module
# │   ├── Constants
# │   ├── sqrt()
# │   ├── pow()
# │   ├── floor()
# │   ├── ceil()
# │   ├── trunc()
# │   ├── factorial()
# │   ├── gcd()
# │   ├── lcm()
# │   ├── comb()
# │   └── perm()
# │
# ├── 4. Log & Exponential
# │   ├── exp()
# │   ├── log()
# │   ├── log10()
# │   ├── log2()
# │   ├── expm1()
# │   └── log1p()
# │
# ├── 5. Trigonometry
# │   ├── sin()
# │   ├── cos()
# │   ├── tan()
# │   ├── asin()
# │   ├── acos()
# │   ├── atan()
# │   └── atan2()
# │
# ├── 6. Geometry
# │   ├── hypot()
# │   └── dist()
# │
# ├── 7. Floating Point
# │   ├── isclose()
# │   ├── isfinite()
# │   ├── isinf()
# │   ├── isnan()
# │   ├── fmod()
# │   └── remainder()
# │
# ├── 8. Advanced math
# │   ├── gamma()
# │   ├── lgamma()
# │   ├── erf()
# │   └── erfc()
# │
# ├── 9. fractions
# │
# ├── 10. decimal
# │
# ├── 11. statistics
# │
# ├── 12. cmath
# │
# ├── 13. NumPy
# │   ├── Arrays
# │   ├── Matrix
# │   ├── Linear Algebra
# │   └── Numerical Computing
# │
# └── 14. SymPy
#     ├── Algebra
#     ├── Calculus
#     ├── Equations
#     └── Symbolic Mathematics