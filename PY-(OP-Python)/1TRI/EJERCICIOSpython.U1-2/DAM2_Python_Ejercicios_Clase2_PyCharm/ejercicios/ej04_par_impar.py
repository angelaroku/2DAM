#  Enunciado Ejercicio 4: Par o impar - 
# Pide un entero. - Muestra si es par o impar.

numero = int(input("Dame un numero y te digo si es par o impar: "))

if numero % 2 == 0:
    print("Tu numero es par")
else:
    print("Tu numero es impar")

# También se puede hacer en una sola linea:
# print("Tu numero es par" if n % 2 == 0 else "Tu numero es impar")