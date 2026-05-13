password="Apassword"
contador=0

while True:
    userpassword=str(input("Introduce la contraseña: "))
    contador += 1
    if userpassword == password:
        print("\nAcceso concedido. \nBienvenido al Sistema.")
        print(f"Has necesitado {contador} intentos")
        break
    else:
        if contador == 1:
            print("Contraseña incorrecta.Intentalo de nuevo")
        elif contador == 2:
            print("Contraseña incorrecta. Ultimo intento")
        else:
            print("Contraseña incorrecta. Acceso bloqueada")
            break
    