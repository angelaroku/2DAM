n = int(input("n: "))
for i in range(1, n+1):
    out = ''
    if i % 3 == 0:
        out += 'Fizz'
    if i % 5 == 0:
        out += 'Buzz'
    print(out or i)
