#Crea una app que pida un nº y calcule su factorial
#(factorial es un nº = al producto de todos los enteros entre1 y el propio nº
#y se representa por el nº seguido de un signo de exclamación
#ejemplo: 5! = 1x2x3x4x5 = 120
# el factorial de 5 es 120
from Scripts.unicodedata import numeric

print("Se te pedira un numero y luego se te dara su factorial")
numero = input("Ingresa un numero: ")
num_inicial = 1
while num_inicial <= numero:
    resultado = num_inicial * num_inicial
    num_inicial + 1
    #list = [i for i in range(1, 10 + 1)]
print(f"El factorial de {numero}! = ")
  #print(f"El equivalente a: {tempCelsius:.2f} en Fahrenheit es: {tempFahrenheit:.2f} ")



