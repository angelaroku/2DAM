#Vamos a crear un programa en python donde vamos a declarar un diccionario (while) 
#para guardar los precios de las distintas frutas. 
# El programa pedirá el nombre de la fruta y la cantidad que se ha vendido (recorrer el cic con otro while). 
#Nos mostrará el precio final de la fruta a partir de los datos guardados en el diccionario. 
#Si la fruta no existe nos dará un error. Tras cada consulta el programa nos preguntará 
#si queremos hacer otra consulta.


nombre = input("El nombre de la fruta: ")
cantidad = input("La cantidad de dicha fruta:")

contadorElementos = 0
#while para recoger los datos input 
while (contadorElementos <= cantidad):
    contadorElementos=+contadorElementos

#while para recorrer el diccionario de frutas
