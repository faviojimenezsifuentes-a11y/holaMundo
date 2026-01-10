package POO.enums;

public class Main5 {
    public static void main(String[] args) {
        for(Rol r : Rol.values()){
            System.out.println("Rol: "+r);
        }

        String texto = "ADMIN";
        Rol rol = Rol.valueOf(texto);
        System.out.println("Convertido : "+texto);

        System.out.println("============= Ejercicio 2 =============");

        NivelAcceso n = NivelAcceso.MEDIO;
        System.out.println(n + " Tiene codigo: "+n.getCodigo());

        System.out.println("============= Ejercicio 3 =============");
        NivelCalificacion cali = NivelCalificacion.ALTO;
        System.out.println(cali + " Tiene codigo: "+cali.getCodigo()+" y tiene una descripcon: "+ cali.getDescripcion());

        System.out.println("============= Ejercicio 4 =============");
        int a=10, b=3;

        Operacion op = Operacion.REST;
        int resultado = op.aplicar(a,b);

        System.out.println("Resultado: "+resultado );

        System.out.println("============= Ejercicio 5 =============");
        int code = 404;

        HttpStatus status = HttpStatus.fromCode(code);

        if(status != null){
            System.out.println("Status: "+status);
            System.out.println("Descripcion: "+status.getDescripcion());
        }else{
            System.out.println("Codigo invalido");
        }

        System.out.println("============= Ejercicio 6 =============");
        int codigo = 1;

        EstadoPedido p = EstadoPedido.fromCodigo(codigo);
        if(p != null){
               System.out.println("Nombre del estado: "+p);
               System.out.println("Codigo del estado: "+p.getCodigo());
               System.out.println("Descripcion del estado: "+p.getDescripcion());

        }else{
            System.out.println("Error!! No existe el estado");
        }


    }
}
