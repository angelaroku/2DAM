#doble barra para que reconozca el path
fichero=open("C:\\Users\\vespertino\\Desktop\\visualRoku\\PYTHON_VISUAL\\1TRI\\MARISA_EJERCICIOS\\8.PRIMER_ejercicio_con_marisa\\datosMarisa.txt", "r")
lineas=fichero.readlines()
contador=0
for linea in lineas:
    print("linea", contador, ":", linea)
    contador+=1
    fichero.close()
    arrayLineas = linea.split(";")
    print(arrayLineas)
fichero.close()

#asi salen los datos:
    # 0 nombre | 1 apellidos | 2 apellidos2 
    #  3 direccion ! 4 cod_postal | 5 ciudad
for posicion in range (0, len(arrayLineas)):
    print("Posicion", posicion, ":", arrayLineas[posicion])

#queremos tranformar la salida asi:
    #0 nombre | 1 2 y 3 nombre apellidos completos
    # 4direccion | 5 cod_postal | 6 ciudad 
columnas = 6
columna = 0
columnasNuevas = 4
lineasNuevas = []
for posicion in range (columnas, len(arrayLineas)):
    lineasNuevas[0, columna:int] = arrayLineas[0, columna:int]+ " "+arrayLineas[1, columna:int]+" " + [2, columna:int]
    lineasNuevas[1, columna:int] = arrayLineas[5, columna:int]
    lineasNuevas[2, columna:int] = arrayLineas[3, columna:int]
    lineasNuevas[3, columna:int] = arrayLineas[4, columna:int]
    print("linea nueva: ", lineasNuevas)
    columna +=1

