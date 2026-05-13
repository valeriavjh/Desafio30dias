import java.util.Scanner;




public class Main {

    static String nombre;
    static char texto;

    static String ciudad;
    static int anio;
    static int actual=2026;
    static Scanner sc= new Scanner(System.in);
    StringBuilder sb = new StringBuilder();

    static void main(String[] args) {
        leerDatos();
        imprimirFicha();


    }

    static void leerDatos(){
        System.out.println("Introduce tu nombre: ");
        nombre=sc.nextLine();
        System.out.println("Introduce tu localidad: ");
        ciudad=sc.nextLine();
        System.out.println("Introduce el año de tu nacimiento: (yyyy)");
        anio=sc.nextInt();
        sc.nextLine();
    }

    static void imprimirFicha(){
        System.out.println("------ FICHA USUARIO ------");
        System.out.print("-\tNombre:\t");
        System.out.println(nombre.substring(0,1).toUpperCase() + nombre.substring(1));
        System.out.print("-\tLocalidad:\t");
        System.out.println(ciudad.substring(0,1).toUpperCase() + ciudad.substring(1));
        System.out.println("-\tEdad aproximada:\t" + (actual-anio) + " años");
        System.out.println("-\t"+esJoven());
        System.out.println("----------------------------");


    }

    static String esJoven(){
        if (actual-anio <30){
            return "Eres joven";
        }else {
            return "Eres Adulto";
        }
    }

}
