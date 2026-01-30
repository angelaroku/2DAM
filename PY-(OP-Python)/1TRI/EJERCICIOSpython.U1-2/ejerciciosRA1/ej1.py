from operator import truediv

#ejemplo 1 JAG
edad = 23
# Cada bloque de instrucciones dentro de una estructura de control
# debe estar tabulada
if edad >= 18:
    print ("Es mayor de edad")
else:
    print("Es menor de edad")
num = 3
if num >=0:
    while num<10:
        print (num)
        num = num + 1
# El punto y coma ";" ";" se puede usar para separar varias sentencias
# en una misma linea, pero no se aconseja su uso.
edad = 15; print (edad)
# Cuando el bloque a tabular solo ocupa una línea se puede
# escribir después de los dos puntos:
azul = True #variable booleana
if azul: print('Cielo')
# Las expresiones entre paréntesis, llaves o corchetes pueden
# ocupar varias líneas:
dias = ['lunes', 'martes', 'miércoles', 'jueves',
"viernes", "sábado", "domingo" ]
print(dias)