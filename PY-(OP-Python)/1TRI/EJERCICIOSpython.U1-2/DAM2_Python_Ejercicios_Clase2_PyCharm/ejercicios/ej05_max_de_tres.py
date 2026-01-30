#  Enunciado Ejercicio 5: Máximo de tres 
# - Pide tres números (float). - 
# Muestra el mayor de los tres. - 
# No uses max(); hazlo con condicionales.

print("Escribe 3 numeros decimales, y te diré cual es el mayor.. ")

num1 = float(input("Número 1: "))
num2 = float(input("Número 2: "))
num3 = float(input("Número 3: "))

if( (num1 <= num2 and num2 < num3) or 
    (num1 >= num2 and num1 < num3)):
    print("El numero mayor es: ", num3)
elif ((num2 <= num3 and num3 < num1) or
      (num2 >= num3 and num2 < num1)):
      print("El numero mayor es: " , num1)
else:
    print("El numero mayor es: " , num2)