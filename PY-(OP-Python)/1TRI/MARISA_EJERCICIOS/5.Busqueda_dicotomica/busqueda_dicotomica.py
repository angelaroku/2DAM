print("Escribe 20 numeros, los ordenare de menor a mayor, encontrare el numero que desees y te diré donde está situado")

#primero recojo los numeros y los meto en un array
contador = 1
posicion = 0
array_numeros = []
while(contador <= 5):
    numero = int(input(f"Introduce numero {contador}: "))

    #ASI NO--> array_numeros[posicion] = numero
    array_numeros.append(numero)
    contador+=1
    posicion+1
                                          
print(f"Tu array de nº queda asi: {array_numeros}")
 
#ordenar de menor a mayor se puede ordenar de menor a mayor nuestro array
array_ordenado = []
array_ordenado = sorted(array_numeros) #array_numeros.sort() pero en una variable nueva
print(f"El array de nº ordenado queda asi: {array_ordenado}")

#buscar el numero dicotómicamente
array_num_ordenados = []
numero_a_encontrar = int(input("¿Qué numero quieres buscar?: "))
indice_min = 0
indice_max= len(array_ordenado)
encontrado = False
print(f"Buscando numero {numero_a_encontrar} en el array ordenado")
while (indice_min <= indice_max):
    indice_medio=(indice_min + indice_max) // 2 #division entera con "//"
    