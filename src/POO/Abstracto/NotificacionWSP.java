package POO.Abstracto;

public class NotificacionWSP extends Notificacion{
    public NotificacionWSP(String remitente) {
        super(remitente);
    }

    @Override
    public void enviar(String mensaje) {
        System.out.println("WTSP enviadp: "+mensaje);
    }
}
