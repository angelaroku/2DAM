linea = input("Números separados por comas: ").strip()
if not linea:
    print("Entrada vacía")
else:
    partes = [p.strip() for p in linea.split(',') if p.strip()]
    numeros = [float(p) for p in partes]
    if numeros:
        promedio = sum(numeros)/len(numeros)
        print(f"Promedio: {promedio:.3f}")
    else:
        print("Sin números válidos")
