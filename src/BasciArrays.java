import java.util.Scanner;

public class BasciArrays {
    public static void main(String[] args) {
      int[] numeros = {5,10,15,20,25};

      for(int i = 0 ; i < numeros.length; i++){
          System.out.println("Elemento en posicion " + i + " : "
                  + numeros[i]);

      }

        //Ejercicio 2
        //Reutilizamos el array de numeros
        int suma = 0;
        for(int j = 0 ; j < numeros.length; j++){
          suma += numeros[j];
         }
        System.out.println("La suma total es: "+ suma);

        //Ejercicio 3
        int[] numeros2 = {1 ,4,5,10,13,16,19,22,25,28};
        int pares = 0;
        int impares = 0;
        for(int h = 0 ;h < numeros2.length; h++ ){
            if(numeros2[h] % 2 == 0 ){
                pares++;
            }else{
                impares++;
            }
        }
        System.out.println("Hay "+ pares
                + " pares y " + impares +" impares");

        //Ejercicio 3
        int [] nums= {1,3,3,7,9,8,5,2,5};
        for(int k=0 ; k < nums.length;k++){
            for(int g= k + 1 ; g < nums.length;g++){
                if(nums[k] == nums[g]){
                    System.out.println("Numero Repetido: "
                            +nums[k]);
                    break;
                }
            }
        }
        //Ejercicio 4
        String [] nombres = {"Ana","Nike","Bryan","Favio","Jean"};

        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese el nombre a busca: ");
        String nombreBuscado = sc.nextLine();
        boolean encontrado = false;
        int posicion = -1;

        for(int e = 0 ;e < nombres.length;e++){
            if(nombres[e].equalsIgnoreCase(nombreBuscado)){
                encontrado = true;
                posicion = e;
                break;

            }
        }
        if(encontrado){
            System.out.println("Nombre encontrado en la posicion: "+posicion);

        }else{
            System.out.println("Nombre no encontrado");
        }

        //Ejercicio 4
        char[] vocales = {'p','r','o','g','r','a','m','a','c','i','o','n'};
        int vocal = 0 ;
        int consonante = 0;
        for(int l = 0 ; l < vocales.length ; l++){
            char c = vocales[l];
            if(c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u'){
                vocal++;
            }else{
                consonante++;
            }
        }
        System.out.println("Hay: "+vocal+" vocales");
        System.out.println("Hay: "+consonante+" consonantes");
    }
}
