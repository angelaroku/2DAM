a = float(input("Primer número: "))
b = float(input("Segundo número: "))
op = input("Operador (+, -, *, /): ").strip()
if op == '+':
    print(a + b)
elif op == '-':
    print(a - b)
elif op == '*':
    print(a * b)
elif op == '/':
    if b == 0:
        print("Error: división por cero")
    else:
        print(a / b)
else:
    print("Operador no válido")
