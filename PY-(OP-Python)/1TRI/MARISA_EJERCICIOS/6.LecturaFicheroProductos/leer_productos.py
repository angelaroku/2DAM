with open("C:/Users/vespertino/Desktop/visualRoku/PYTHON_VISUAL/1TRI/MARISA_EJERCICIOS/6.LecturaFicheroProductos/Productos.csv", "r") as datos:
    valores = []
    for linea in datos:
        valores.append([str(x) for x in linea.strip().split(",")])
        print(f"| {valores} | ")
