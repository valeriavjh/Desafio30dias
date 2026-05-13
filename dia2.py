articulo= str(input ("introduce el artículo a comprar: " ))
cantidad = int (input(" introduce la cantidad a comprar:  "))
precio = float (input(" introduce el precio del artículo:  "))
subtotal = precio* cantidad 

print(" ------Ticket de Venta----")
print(f"Articulo: {articulo.capitalize()}")
print("Cantidad : ", cantidad)
print("Precio unitario : €", precio)
print("Subtotal: €", subtotal) 
print(f"IVA (21%): € {subtotal*0.21:.2f}") # round(subtotal*0.21,2)
print(f"TOTAL:  € {subtotal +(subtotal * 0.21):.2f}") 
if subtotal < 16.53:
    print("Compra pequeña")
else:
    print("Compra grande ")
print("-------------------")