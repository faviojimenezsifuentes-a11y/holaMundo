import java.util.Scanner;

public class BucleDoWhile {
    public static void main(String[] args) {
        /*do-while: Se usa cuando necesitas ejecutar minimo una vez, sin importar
        la condicion*/
        Scanner scn = new Scanner(System.in);
        int i =1;
        do{
            System.out.println("Ejecutado al menos una vez");
            i--;
        }while(i > 0);

        // Menu simple
        //int opcion;
        //int opciones tambien puede ser;
        //do{
           // System.out.println("1.Saludar");
           // System.out.println("0.Salir");
           // System.out.println("Opcion: ");
           // opcion = scn.nextInt();

          //  if(opcion == 1){
          //      System.out.println("HOLAAAA!!");
         //   }
       // }while(opcion != 0);

        //Validacion de contrasena(maximo 3 intentos)
        String claveCorrecta = "java123";
        String claveIngresada;
        int j = 3;
        do{
            System.out.println("Ingrese la clave correcta tienes " + j  + " intentos : " );
            claveIngresada = scn.nextLine();
            j--;
            if(claveIngresada.equals(claveCorrecta)){
                System.out.println("Acceso permitido");
                break;
            }else{
                if( j > 0){
                    System.out.println(("Ingreso Incorrecto"));
                }else {
                    System.out.println("Intentos acabados");
                }
            }
        }while(j > 0 && !claveIngresada.equals(claveCorrecta));
    }
}
