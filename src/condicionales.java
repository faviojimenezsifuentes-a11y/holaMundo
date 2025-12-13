import java.util.Scanner;

public class condicionales {
    public static void main(String[] args) {
        //Ejemplo if
        int numero = 15;


        if(numero > 10 ){
            System.out.println("El numero es mayor a 10");
        }

        //Validar si un estudiante aprobo
        double nota = 14.5;

        if( nota >= 11){
            System.out.println("Aprobado");
        }

        //Verificar si un numero esta dentro de un rango
        int edad = 23;
        if( edad >= 18 && edad <= 30 ){//&& las dos condiciones se deben cumplir
            System.out.println("Edad dentro del rango permitido");
        }

        //Validar si un cliente califica a un prestamo
        double ingresos = 3200;
        boolean tieneDeuda = false;
        int aniosTrabajo = 2;
        int age = 63;

        boolean califica = true;

        if(ingresos <= 2500){
            califica = false;
        }

        if(tieneDeuda == true){
            califica = false;
        }
        if( aniosTrabajo < 2){// anios es menor a 2
            califica = false;
        }

        if(age < 21 || age > 65){ // si es y(&&) se tiene q cumplir con ambas condiciones
           califica = false;
        }

        if (califica){
            System.out.println("Cliente APTO para prestamo");
        }

        if(!califica){
            System.out.println("Cliente NO APTO");
        }


        // Dado un puntaje de 0 a 100, clasificarlo
        // en uno de los sig rangos
        // 0 a 20 = muy bajo - 21 a 50 = bajo
        //51 a 80 = medio - 81 a 100 = alto
        // fuera de rango= puntaje invalido
        //imprimir: rango: Valor de rango

        int rango = 100;
        if(rango >= 0 && rango <=20 ){
            System.out.println("Rango : Muy bajo");
        }
        if(rango >= 21 && rango <=50 ){
            System.out.println("Rango : bajo");
        }
        if(rango >= 51 && rango <=80 ){
            System.out.println("Rango : medio");
        }
        if(rango >= 81 && rango <=100 ){
            System.out.println("alto");
        }
        if(rango < 0 || rango > 100 ){
            System.out.println("Rango: puntaje invalido");
        }
        //ELSE
        int num = 9;

        if(num > 10){
            System.out.println("El numero es mayor a 10");
        }else {
            System.out.println("El numero NO es mayor a 10");
        }

        //ELSE IF
        int note = 10;
        if( note >= 18){
            System.out.println("Excelente");
        }else if( note >= 14){
            System.out.println("Bueno");
        } else if (note >= 12) {
            System.out.println("No tan bueno");
        } else if (note >= 10) {
            System.out.println("Eres malo");
        } else{
            System.out.println("Necesitas mejorar");
        }//estrustura condicional anidada

        // SWITCH
        int dia = 1;
        switch (dia){
            case 1 :
                System.out.println("Lunes");
                break;
            case 2:
                System.out.println("Martes");
                break;//break es para interrumpir y para q no se sigue
                       // siga validando lo demas
            default:
                System.out.println("Otro dia");
        }

        //SWITCH SEGUNDO EJEMPLO
        Scanner scn = new Scanner(System.in);
        String producto = scn.nextLine();
        int stock = 2;

        switch (producto.trim().toUpperCase()){//Le quita los espacios cuando se ingresa en la consola con un espacio demas
            case "BEBIDA":              // uper case te pone todo en mayus lo q pones en consola
                if (stock > 10){
                    System.out.println("Stock Alto");
                } else if (stock >= 5 && stock <= 10) {
                    System.out.println("Stock Moderado");
                }else {
                    System.out.println("Stock bajo");
                }
                break;
            case "POSTRE":
                if(stock < 3){
                    System.out.println("Necesita reposicion");
                }
                break;
            default:
                System.out.println("Producto no registrado");
        }

    }

    // smell : codigo que no se le puede dar mantenimiento a
    //un futuro como este codigo que tiene muchas condiciones
}
