public class OperadoresAsignacion {
    public static void main(String[] args) {
        int x = 1;
        int y = 1;
        // x = 20; -> Sobreescribiendo
        // x += 3; -> Asignacion de suma : x = x + 3
        // x -= 3;
        // y += 2;
        // x *= 3;
        //x /= 3;
        //x %= 3;
        //x &= y; Esto compara valores binarios : x=1 , y=1 -> x&y = 1


        //System.out.println("Valor: " + x);
        System.out.println(Integer.toBinaryString(x));
        System.out.println(Integer.toBinaryString(y));
    }
}
