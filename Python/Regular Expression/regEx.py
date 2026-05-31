import re #1
text = 'ABC 123 XYZ 456 @&! 100'
pattern = re.compile(r'\d\d\d') #2

match = pattern.search(text) #3
print(match)

matches = pattern.finditer(text)
 
for match in matches:
    print(match)
    print(match.group())


print('ravi\nkumar')
print(r'ravi\nkumar') # reString
