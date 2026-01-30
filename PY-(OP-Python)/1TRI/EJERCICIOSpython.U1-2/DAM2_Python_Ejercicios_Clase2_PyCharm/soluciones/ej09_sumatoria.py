n = int(input("n (>0): "))
if n <= 0:
    print("n debe ser positivo")
else:
    s = 0
    for i in range(1, n+1):
        s += i
    print(f"Suma 1..{n} = {s}")
