import pandas as pd
import matplotlib.pyplot as plt

# 1. Leer el archivo CSV
try:
    df = pd.read_csv('C:\\Users\\vespertino\\Desktop\\visualRoku\\PYTHON_VISUAL\\1TRI\\MARISA_EJERCICIOS\\9.GraficaMontaña\\documento_grafica.csv') 
    print("Datos cargados:\n", df)
except FileNotFoundError:
    print("Error: El archivo 'datos.csv' no se encontró.")
    exit()

# 2. Crear la figura y los ejes para el gráfico
fig, ax = plt.subplots(figsize=(10, 6)) # Tamaño del gráfico


# 3. Graficar los datos (ej. un gráfico de líneas)
# Usamos la columna 'Año' para el eje X y 'Ventas' para el eje Y
ax.plot(df['Año'], df['Ventas'], marker='o', linestyle='-.', color='b') # marker para puntos, linestyle para línea
ax.plot(df['Año'], df['Compras'], marker='o', linestyle='-.', color='r') # marker para puntos, linestyle para línea
#ax.bar(df['Año'], df['Ventas'], alpha=1.0, color='b', label='Ventas') # Barras transparentes para Ventas
#ax.bar(df['Año'], df['Compras'], alpha=1.0, color='r', label='Compras') # Barras transparentes para Compras

# 4. Añadir títulos y etiquetas
ax.set_title('Ventasy Compras Anuales')
ax.set_xlabel('Año')
ax.set_ylabel('Número de Ventas y compras')
ax.grid(True) # Añade una cuadrícula
ax.legend()

# 5. Mostrar el gráfico
plt.show()

# Opcional: Guardar el gráfico en un archivo
# plt.savefig('grafico_ventas.png')