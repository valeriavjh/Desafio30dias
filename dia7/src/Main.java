import java.util.Scanner;

public class Main {
    static boolean activo = true;
    static Scanner sc = new Scanner(System.in);

    static String producto;
    static double precio;
    static int opcion;
    static double totalCarrito;
    static double total;
    static int articulos;


    public static void main(String[] args) {
        while (activo) {
            mostrarMenu();
                if (opcion == 1) {
                    sumarProducto();
                } else if (opcion == 2) {
                    calcularTotal();
                } else if (opcion == 3) {
                    aplicarDescuento();
                } else if (opcion == 4) {
                    calcularTotal();
                    aplicarDescuento();
                    break;
                }else {
                    System.out.println("Opcion no valida, por favor intente de nuevo");
                }
        }
    }

    static void mostrarMenu () {
            System.out.println(
                    "\n\t----- SUPERMERCADO -----\n" +
                            "\t 1. Añadir producto\n" +
                            "\t 2. Ver totalCarrito actual\n" +
                            "\t 3. Aplicar descuento\n" +
                            "\t 4. Finalizar compra\n ");

            System.out.print("Introduce una opcion: ");
            opcion = sc.nextInt();
            sc.nextLine();
        }

    static void sumarProducto(){
        System.out.print("Introduce el producto: ");
        producto = sc.nextLine();
        System.out.print("Introduce el precio: ");
        precio= sc.nextDouble();
        totalCarrito +=precio;
        articulos+=1;
        System.out.println("Producto añadido correctamente\n");
    }

    static void calcularTotal(){
        System.out.println("Total: €" + totalCarrito);
    }

    static void aplicarDescuento() {
        if (totalCarrito >= 100) {
            System.out.println("Se aplicara un descuento del 20%, el total es");
            total = totalCarrito * 0.8;
            System.out.println("Total: " + total + "\n");
        } else if (totalCarrito >= 50) {
            System.out.println("Se aplicara un descuento del 10%, el total es");
            total = totalCarrito * 0.9;
            System.out.println("Total: " + total + "\n");
        }else {
            System.out.println("No existen descuentos aplicables");
        }

    }
}