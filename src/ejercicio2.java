import java.util.Scanner;

public class ejercicio2 {
    public static void main(String[] args) {
        //Un sistema de transpote cobra una tarifa segun tipo
        //de ruta:
        //Corto -> 3.00
        //Medio -> 5.00
        //Largo -> 8.00
        //Reglas:
        //1. Si el pasajero es estudiante -> 20% descuento
        //2. Si es adulto mayor (mayor o igual de 60 anios) -> 30% descuento
        //3.SINO pertenece a ninguno paga normal
        //ADICIONAL
        //1.Si el tipo de ruta no existe -> ERROR
        //2.Si la edad es menor a 0 -> ERROR
        //3.Solo se aplica un descuento, el mayor
        Scanner scr = new Scanner(System.in);
        System.out.println("==== TIPOS DE RUTA ====");
        System.out.println("1. Corto (S/ 3.00)");
        System.out.println("2. Medio (S/ 5.00)");
        System.out.println("3. Largo (S/ 8.00)");
        System.out.print("Seleccione una ruta: ");
        int ruta = scr.nextInt();

        System.out.print("Ingrese du edad: ");

        int edad = scr.nextInt();
        if ( edad < 0) {
            System.out.println("ERROR");
            return;
        }

        System.out.print("Es estudiante? (true/false): ");
        boolean estudiante = scr.nextBoolean();

        double tarifaBase;

        switch (ruta){
            case 1:
                 tarifaBase = 3.00;
                break;
            case 2:
                tarifaBase = 5.00;
                break;
            case 3:
                tarifaBase = 8.00;
                break;
            default:
                System.out.println("ERROR");
                return;
        }

        double tarifa;

        if(edad >= 60){
            tarifa = tarifaBase * 0.70;
            System.out.println("El pasajero es un adulto mayor, su tarifa es de: " + tarifa);
        } else if (estudiante == true) {
            tarifa = tarifaBase * 0.80;
            System.out.println("El pasajero es un estudiante, su tarifa es de: " + tarifa);
        }else {
            tarifa = tarifaBase;
            System.out.println("El pasajero paga completo: " + tarifa);
        }

    }
}
