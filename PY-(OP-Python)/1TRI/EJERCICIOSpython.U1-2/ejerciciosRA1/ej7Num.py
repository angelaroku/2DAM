""" Tipo de datos numéricos

Python3 trabaja con tres tipos numéricos:

* Enteros (int): Representan todos los números enteros (positivos, negativos y 0), sin parte decimal. En python3 este tipo no tiene limitación de espacio.
* Reales (float): Sirve para representar los números reales, tienen una parte decimal y otra  decimal. Normalmente se utiliza para su implementación un tipo `double` de C.
* Complejos (complex): Nos sirven para representar números complejos, con una parte real y otra imaginaria.

Como hemos visto en la unidad anterior son tipos de datos inmutables.

*Ejemplos*
"""
entero = 7
print(type(entero))
#debería mostrar 	<class 'int'>
real = 7.2
print(type (real)) #debería mostrar 		<class 'float'
complejo = 1+2j
print(type(complejo)) #debería mostrar 		<class 'complex'>

## Operadores aritméticos
"""
* `+`: Suma dos números
* `-`: Resta dos números
* `*`: Multiplica dos números
* `/`: Divide dos números, el resultado es `float`.
* `//`: División entera
* `%`: Módulo o resto de la división
* `**`: Potencia
* `+`, `-`: Operadores unarios positivo y negativo

## Funciones predefinidas que trabajan con números:

* `abs(x)`: Devuelve al valor absoluto de un número.
* `divmod(x,y)`: Toma como parámetro dos números, y devuelve una tubla con dos valores, la división entera, y el módulo o resto de la división.
* `hex(x)`: Devuelve una cadena con la representación hexadecimal del número que recibe como parámetro.
* `oct(x)`: Devuelve una cadena con la representación octal del número que recibe como parámetro.
* `bin(x)`: Devuelve una cadena con la representación binaria del número que recibe como parámetro.
* `pow(x,y): Devuelve la potencia de la base x elevedao al exponete y. Es similar al operador `**`.
* `round(x,[y])`: Devuelve un número real (float) que es el redondeo del número recibido como parámetro, podemos indicar un parámetro opcional que indica el número de decimales en el redondeo.

*Ejemplos*
"""
print(abs(-7))
print(divmod(7,2)) #debería mostrar	(3, 1)
print(hex(255)) #debería mostrar	'0xff'
print(oct(255)) #debería mostrar	'0o377'
print(pow(2,3)) #debería mostrar	8
print(round(7.567,1)) #debería mostrar	7.6
## Operadores a nivel de bit
"""
* `x | y`: x OR y
* `x ^ y`: x XOR y
* `x & y`: a AND y
* `x << n`: Desplazamiento a la izquierda **n** bits.
* `x >> n`: Desplazamiento a la derecha **n** bits.
* `~x`: Devuelve los bits invertidos.

## Conversión de tipos

* `int(x)`: Convierte el valor a entero.
* `float(x)`: Convierte el valor a float.
* `complex(x)`: Convierte el valor a un complejo sin parte imaginaria.
* `complex(x,y)`: Convierta el valor a un complejo, cuya parte real es x y la parte imaginaria y.

Los valores que se reciben también pueden ser cadenas de caracteres (str).

*Ejemplos*
"""
a=int(7.2)
print(a) #muestra 	7
print(type(a)) #muestra	<class 'int'>
a=int("345") #muestra
print(a) #muestra	345
print(type(a)) #muestra 	<class 'int'>
b=float(1)
print(b) #muestra	1.0
print(type(b)) #muestra <class 'float'>
b=float("1.234")
print(b) #muestra	1.234
print(type(b)) #muestra 	<class 'float'>

#Por último si queremos convertir una cadena a entero, la cadena debe estar formada por caracteres numéricos, sino es así, obtenemos un error:
#muestra 	Traceback (most recent call last): 	  File "<stdin>", line 1, in <module> 	ValueError: invalid literal for int() with base 10: '123.3'
