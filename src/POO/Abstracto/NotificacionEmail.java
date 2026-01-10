package POO.Abstracto;

public class NotificacionEmail extends Notificacion{

    public NotificacionEmail(String remitente) {
        super(remitente);
    }

    @Override
    public void enviar(String mensaje) {
        System.out.println("Email enviado: "+mensaje);
    }
}
