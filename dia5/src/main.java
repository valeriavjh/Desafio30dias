import java.util.Scanner;

public class main {
    static double precio;
    static double dinero;
    static double cambio;
    static int cambio2;
    static Scanner sc = new Scanner(System.in);
    static int[] billetes = {50000, 20000, 10000, 5000, 2000, 1000, 500};
    static int[] monedas = {200, 100, 50, 20, 10, 5, 2, 1};
    static int numero;

    static void main(String[] args) {
        leerDatos();
        darCambio();


    }

    static void leerDatos() {
        System.out.print("Introduce el precio de la compra: ");
        precio = sc.nextDouble();
        System.out.print("Introduce el dinero entregado por el cliente: ");
        dinero = sc.nextDouble();
        cambio = ((dinero - precio) * 100);
        cambio2 = (int) cambio;
    }

    static void darCambio() {
        System.out.println("\nCambio total: €" + (dinero-precio)+"\n");
        for (int billete : billetes) {
            if (cambio2 / billete > 0) {
                numero = cambio2 / billete;
                cambio2 = cambio2 -( billete*numero);
                System.out.println(numero + " billetes de €" + billete / 100);
            }
        }
        for (int moneda:monedas){
            if (cambio2/moneda > 0 ){
                numero = cambio2/moneda;
                cambio2 = cambio2 - (moneda*numero);
                System.out.println(numero + " monedas de €" + (double)moneda / 100);

            }
        }
    }
}

