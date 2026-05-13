import java.util.Scanner;

public class main {
    static String alumno;
    static double nota;
    static Scanner sc = new Scanner(System.in);

    static void main(String[] args) {
        System.out.print("Introduzca el nombre del Alumno: ");
        alumno= sc.nextLine();
        System.out.println("Introduzca la nota: ");
        nota= sc.nextDouble();

        System.out.println("Alumno: " + alumno);
        System.out.println("Nota: " + nota);
        valorarNota();

    }
    static void valorarNota(){
        if (nota<0 || nota>10){
            System.out.println("Nota no válida");
        } else if (nota<5) {
            System.out.println("Resultado: Suspenso");
        } else if (nota>=5 && nota<7) {
            System.out.println("Resultado: Aprobado");
        }else if (nota>=7 && nota<9) {
            System.out.println("Resultado: Notable");
        }else{
            System.out.println("Resultado: Sobresaliente");
        }
    }

}