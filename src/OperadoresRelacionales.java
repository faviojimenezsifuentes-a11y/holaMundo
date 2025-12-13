public class OperadoresRelacionales {
    public static void main(String[] args) {
        int a = 10;
        int b = 10;

        //Igualdad
        boolean res = (a == b);
        System.out.println("Resultado Igualdad: " + res);

        //Diferente
        boolean res1 = (a != b);
        System.out.println("Resultado Diferente: " + res1);

        //Mayor que
        boolean res2 = (a > b);
        System.out.println("Resultado Mayor que : " + res2);

        //Menor que
        boolean res3 = (a < b);
        System.out.println("Resultado Menor que : " + res3);

        //Mayor o Igual que
        boolean res4 = (a >= b);
        System.out.println("Resultado Mayor que : " + res4);

        //Menor o Igual que
        boolean res5 = (a <= b);
        System.out.println("Resultado Menor que : " + res5);

        //String como este no es un metodo primitivo
        // se usan otrosmetodos
        String dato1 = "Hola";
        String dato2 = "Hola";
        boolean res6 = (dato1.equals(dato2)); // == debe ser igual sea mayus o minus
        boolean res7 = (dato1.equalsIgnoreCase(dato2)); // se compara ignorando las mayus y minus

        System.out.println("Resultado de String: " + res6);

    }
}
