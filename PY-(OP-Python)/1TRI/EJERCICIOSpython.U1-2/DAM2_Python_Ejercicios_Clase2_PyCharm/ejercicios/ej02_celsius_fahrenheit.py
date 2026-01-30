#  Enunciado Ejercicio 2: Conversor de temperatura - 
# Pide una temperatura en grados Celsius (float). - 
# Convierte a Fahrenheit con la fórmula: F = C * 9/5 + 32. - 
# Muestra el resultado con 2 decimales.


tempCelsius = float(input("Dame una temperatura en grados Celsius: "))
tempFahrenheit =  tempCelsius * 9/5 + 32

#print("El equivalente a: ", tempCelsius, " en Fahrenheit es: ", tempFahrenheit - 0.00)
print(f"El equivalente a: {tempCelsius:.2f} en Fahrenheit es: {tempFahrenheit:.2f} ")

#SOLUCION PARA 2 DECIMALES: uso de formato de cadenas (f-strings) 