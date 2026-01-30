#conversiones de tipo explícitas e implícitas
#1-Conversión implícita (automática)
entero = 5
decimal = 2.5

resultado = entero + decimal  # Python convierte 'entero' a float automáticamente
print(resultado)              # 7.5
print(type(resultado))        # <class 'float'>
#2-Conversión explícita (forzada por el programador)
# De string a entero
numero_str = "42"
numero_int = int(numero_str)
print(numero_int + 1)  # 43

# De entero a string
edad = 30
mensaje = "Tienes " + str(edad) + " años"
print(mensaje)  # Tienes 30 años

# De float a entero (pierde decimales)
pi = 3.14159
entero_pi = int(pi)
print(entero_pi)  # 3

#test1 ¿de qué tipo es resultado?
entero = 10
decimal = 3.5
resultado = entero + decimal
print(type(resultado))
#test2 ¿qué ocurre al ejecutar esto?
texto = "123abc"
#numero = int(texto)

#test3 ¿cuánto vale resultado?
otroNumero = 5.8
resultado = int(otroNumero)
print("test3 "+str(resultado))

#test4 ¿qué pinta ?
valor = True
resultado = int(valor)
print("test4 "+str(resultado))