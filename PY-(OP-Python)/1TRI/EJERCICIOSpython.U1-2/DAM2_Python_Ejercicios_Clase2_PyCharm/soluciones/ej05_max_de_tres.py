a = float(input("A: "))
b = float(input("B: "))
c = float(input("C: "))
mayor = a
if b > mayor:
    mayor = b
if c > mayor:
    mayor = c
print(f"Mayor: {mayor}")
