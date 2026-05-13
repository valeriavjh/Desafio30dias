import java.util.Scanner;

public class Fabricio {
    static double precio;
    static double dinero;
    static double cambio;
    static Scanner sc= new Scanner(System.in);
    static double [] billetes={500,200,100,50,20,10,5};
    static double [] monedas ={2,1,0.5,0.2,0.1,0.05,0.02,0.01};

    static void calcularCambio(String flag,double[] array){
        for(double valor: array){
            if((cambio / valor) >= 1){
                int resultado = (int)(cambio / valor);
                cambio = Math.round((double)(cambio - (resultado*valor))*100)/100.0;
                System.out.println(resultado + " " + flag + " de " + valor);
            }
        }

    }

    static void leerDatos(){
        System.out.print("Introduce el precio de la compra: ");
        precio= sc.nextDouble();
        System.out.print("Introduce el dinero entregado por el cliente: ");
        dinero= sc.nextDouble();
    }
    static void main(String[] args) {
        leerDatos();

        cambio = Math.round((dinero-precio) * 100) / 100.0;
        System.out.println("CAMBIO: " + cambio);

       // calcularCambio("billetes",billetes);
        //calcularCambio("monedas",monedas);

    }
}
