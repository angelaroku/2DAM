texto = input("Texto: ").lower()
filtrado = ''.join(ch for ch in texto if ch.isalnum())
print("Es palíndromo" if filtrado == filtrado[::-1] else "No es palíndromo")
