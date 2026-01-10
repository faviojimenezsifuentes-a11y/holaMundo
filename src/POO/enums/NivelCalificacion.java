package POO.enums;

public enum NivelCalificacion {
    BAJO(1,"Rendimiento insuficiente"), MEDIO(2,"Rendimiento aceptable"), ALTO(3,"Rendimiento destacado");
    private final int codigo;
    private final String descripcion;

    NivelCalificacion(int codigo, String descripcion) {
        this.codigo = codigo;
        this.descripcion = descripcion;
    }

    public int getCodigo() {
        return codigo;
    }

    public String getDescripcion() {
        return descripcion;
    }
}
