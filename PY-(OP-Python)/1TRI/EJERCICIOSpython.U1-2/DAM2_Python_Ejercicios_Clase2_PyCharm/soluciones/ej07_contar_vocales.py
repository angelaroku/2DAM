texto = input("Texto: ").lower()
vocales = set('aeiou')
conteo = sum(1 for ch in texto if ch in vocales)
print(f"Vocales: {conteo}")
