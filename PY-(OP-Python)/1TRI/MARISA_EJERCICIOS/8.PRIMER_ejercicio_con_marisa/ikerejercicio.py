path: str = "C:\\Users\\vespertino\\Desktop\\visualRoku\\PYTHON_VISUAL\\1TRI\\MARISA_EJERCICIOS\\8.PRIMER_ejercicio_con_marisa\\datosMarisa.txt"
with open(path, "r") as fichero:
    next(fichero)
    for linea in fichero:
        #valores = array de strings 
        valores = linea.strip().split(";")
        nombre_completo : str = f"{valores[0]} {valores[1]} {valores[2]}"
        ciudad: str = valores[5]
        direccion: str = valores[3]
        #OPERADOR TERNARIO :    VALIDO if CONDICION else NO_VALIDO 
        cod_postal: int = int (valores[4]) if valores[4].isdigit() else 0 

        print ([nombre_completo, ciudad, direccion, cod_postal])