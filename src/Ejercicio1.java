import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Ingresa tu nombre: ");
        String nombre = scan.nextLine();

        System.out.print("Nota del primer examen: ");
        int nota1 = scan.nextInt();

        System.out.print("Nota del segundo examen: ");
        int nota2 = scan.nextInt();

        System.out.print("Nota del Trabajo final: ");
        int Tf = scan.nextInt();

        System.out.print("Edad del alumno: ");
        int edad = scan.nextInt();

        double promedio = (nota1 * 0.30) + (nota2 * 0.30) + (Tf * 0.40);

        System.out.println("-------------------------------------");
        System.out.println("        REPORTE ACADEMICO");
        System.out.println("-------------------------------------");
        System.out.println("Nombre : " + nombre);
        System.out.println("Edad   : " + edad);
        System.out.println("Promedio final : " + promedio);
        String estado = (promedio >= 11) ? "Aprobado" : "Desaprobado";
        System.out.println("Estado         : " + estado);
        String comentario = " ";
        comentario += (edad < 18) ? "Alumno menor de edad, se recomienda acompañamiento. ": "";
        comentario += (promedio >= 11)? "¡Felicitaciones!": "Debe reforzar sus estudios.";
        comentario += (promedio >= 10 && promedio < 11)? " El alumno está a 1 punto o menos de aprobar.": "";
        comentario += (promedio <= 5)? " Rendimiento crítico.": "";
        System.out.println("Comentario     :");
        System.out.println(comentario);
        System.out.println("-------------------------------------");
        scan.close();
    }
}
