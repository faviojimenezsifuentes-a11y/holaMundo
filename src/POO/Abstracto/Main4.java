package POO.Abstracto;

import java.util.ArrayList;
import java.util.List;

public class Main4 {
    public static void main(String[] args) {
        List<Notificacion> noti = new ArrayList<>();
        noti.add(new NotificacionWSP("Sistema "));
        noti.add(new NotificacionEmail("Sistema"));
        noti.add(new NotificacionSMS("Sistema"));
        for(Notificacion n : noti){
            n.enviar("Mensaje 1");
        }

    }
}
