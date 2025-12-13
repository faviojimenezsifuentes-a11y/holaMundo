import java.util.Scanner;

public class ejercicio3DoWhile {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String claveCorrecta = "java123";
        String claveIngresada;
        int j = 3;
        do{
            System.out.println("Ingrese la clave correcta tienes " + j  + " intentos : " );
            claveIngresada = in.nextLine();
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
        }while(!claveIngresada.equals(claveCorrecta) && j > 0  );
    }
}

