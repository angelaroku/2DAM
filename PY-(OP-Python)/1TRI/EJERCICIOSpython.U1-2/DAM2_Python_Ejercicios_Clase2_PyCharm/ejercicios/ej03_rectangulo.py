
# Enunciado Ejercicio 3: Área y perímetro de un rectángulo - 
# Pide base y altura (float). - 
# Calcula área y perímetro. Muestra ambos valores.

print("Vamos el Área y Perímetro de un Rectángulo.")

base = float(input("Dame la base: "))
altura= float(input("Dame la altura: "))

area = base * altura
perimetro  = base + altura + base + altura

print(f"El area sería: {area} y el perímetro: {perimetro}")