#pedir números por pantalla y sumar
num1 = input("Dame el número1:")
print(num1, type(num1))
num2 = input("Dame el número2:")
print(num2, type(num2))
print (num1+num2) ##vemos que no los suma, los concatena
print(int(num1)+int(num2))#para sumar hay que convertir a int

num3 = input("Dime el número para convertir a binario: ")
print(bin(int(num3)))