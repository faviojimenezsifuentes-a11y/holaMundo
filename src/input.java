import java.util.Scanner;

public class input {
    //Instancia: Crear un objeto en memoria que le
    // pertenece a una clase

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in); // instancia de la clase scanner
        // existe en memoria

        System.out.print("Ingresa tus nombres : ");
        String nombre = scan.nextLine();

        System.out.print("Ingresa tu edad: ");
        int edad = scan.nextInt();

        System.out.println("Hola " + nombre + " tienes "+ edad+ " años");




    }
}
