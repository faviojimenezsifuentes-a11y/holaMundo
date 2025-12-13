import java.util.Scanner;

public class Repetitivas {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("=====Sin Bucle=====");
        System.out.println(1);
        System.out.println(2);
        System.out.println(3);
        System.out.println(4);
        System.out.println(5);

        System.out.println("=====Con Bucle=====");
        //FOR
        System.out.println("===============for===============");
        for(int i = 1; i<=5 ; i++){
            System.out.println(i);
        }

        int[] numeros = {4 ,8 ,12, 10}; //Arreglo simple este es uuna estructura
        //Que nos permite guardar varios valores del mismo tipo en una sola
        // siempre empieza en el indice 0
        System.out.println("Suma bucle con arreglos");
        int suma = 0;
        for(int j = 0 ; j < numeros.length ; j++){
            suma += numeros[j];
            System.out.println(suma);
        }
        System.out.println("La suma final es: "+ suma);

        //Ejercicio
        int[] valores = {200, 8, 40, 22, 100};
        int mayor = valores[0];
        for(int i = 1 ; i < valores.length; i++ ){
            if(valores[i] > mayor){
                mayor = valores[i];
            }
        }
        System.out.println("El mayor es: " +mayor);
        System.out.println("===============while===============");
        //WHILE
        int i = 5 ;
        while(i > 0){
            System.out.println(i);
            i--;
        }

        //Ingresa un numero positivo
       // int n = -1;
      //  while(n < 0){
           // System.out.println("Ingrese un numero positivo: ");
            //n = scn.nextInt();
        //}
        //System.out.println("Correcto: " +n);

        //Sumar numeros hasta que el usuario escriba el o
        int n1 = 1;
        suma = 0;
        int contador = 0;
        while(n1 != 0) {
            System.out.println("Ingrese un numero a sumar: ");
            n1 = scn.nextInt();
             suma += n1;
             contador++;

        }
        System.out.println("Suma Total: " +suma);
        System.out.println("Numeros Totales: " +contador);


    }
}
/*
for: Se usa cuantas repeticiones necesitas
while: Se usa cuando no sabes cuantas repeticiones necesitas y depende de
una condicion

*/
