package POO.Abstracto;

public abstract class Notificacion {
    protected String remitente;
    public Notificacion(String remitente){
        this.remitente=remitente;
    }
    //Metodo abstracto (es el que cada hijo debe implementar)
    public abstract void enviar(String mensaje);

    //Metodo Concreto (logica comun)
    public void login(){
        System.out.println("Logueao");
    }
}
