#Enunciado: Crea un programa en Python que:
# 1.Pida al usuario su nombre y tres notas (números decimales entre 0 y 10).
#2.	Calcule y muestre la media de las tres notas.
#3.	Guarde el resultado en una variable llamada media.
#4.	Después, vuelva a usar la variable media para determinar:
    #	Si la media es mayor o igual que 5 → mostrar "Aprobado".
    #	Si es menor que 5 → mostrar "Suspenso".

print("Introduzca su nombre y sus notas y se le dara la media")

nombre = input("Escribe tu nombre:")
nota1 = input("Dame tu primera nota")
nota2 = input("Dame la segunda")
nota3 = input("Dame la tercera nota")

if media>= 5 :
    print("Aprobado")
else
    print("Suspenso")