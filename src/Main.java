public class Main {
    public static void main(String[] args) {
        //Datos Primitivos
        //enteros
        byte edad2 = 127; // 1 byte -> 8bits = soporta hasta 127
        short edad3 = 32767;//2 bytes -> 16bits = soporta hasta 32767
        int edad = 20;//4 bytes -> 32 bytes = soporta hasta 2147483647
        long edad4 = 9223372036854775807L;//8 bytes -> 64 bytes

        //decimales
        float dato = 15.5f; //4 bytes -> 32 bits
        double dato1= 1.7976931348623157E308;//8 bytes -> 64 bits

        //caracter
        char dato3 = 'a'; //2bytes -> 16 bits


        //booleans
        boolean activo = true;    // 1bit
        boolean inactivo = false; //1bit



        //No es primitivo
        String nombre = "Favio";




        System.out.println("Hello world!");
        System.out.println("Nombre: " + nombre);
        System.out.println("Edad: " + edad);
        System.out.print("Valor: " + dato1);

    }
}