package POO.enums;

public enum EstadoPedido {
    PENDIENTE(1,"Pedido Registrado"),
    PROCESANDO(2,"Pedido en preparación"),
    ENVIADO(3,"Pedido enviado al cliente"),
    CANCELADO(4,"Pedido cancelado"),
    ;

    private final int codigo;
    private final String descripcion;

    EstadoPedido(int codigo, String descripcion) {
        this.codigo = codigo;
        this.descripcion = descripcion;
    }

    public int getCodigo() {
        return codigo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public static EstadoPedido fromCodigo(int codigo){
      for(EstadoPedido p : values()){
          if(p.codigo == codigo) return p;
      }
      return null;

    }

}
