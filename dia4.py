num_mayor=0
num_menor=0

num1= int(input("Introduzca un numero entero: "))
num2= int(input("Introduzca otro numero entero: "))
numeros=[num1,num2]

print("\n-------- Reultados --------")

if num1 == num2:
    print("Los numeros son Iguales")
    num_mayor=num1
    num_menor=num2
else:
    if  num1 > num2:
        num_mayor =num1
        num_menor=num2
    else:
        num_mayor =num2
        num_menor=num1
print(f"Numero mayor: {num_mayor} ")
print(f"Numero menor: {num_menor} ")

print(f"Suma: {num_mayor + num_menor}")
print(f"Diferencia: {num_mayor - num_menor}")

for numero in numeros:
    print (f"Numero {numero}:")
    if numero>0:
        print("- Positivo")
    else:
        print("- Negativo")
    
    if numero%2 == 0:
        print("- Par")
    else:
        print("- Impar")