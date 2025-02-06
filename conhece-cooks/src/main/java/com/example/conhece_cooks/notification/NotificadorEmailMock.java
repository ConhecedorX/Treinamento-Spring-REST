package com.example.conhece_cooks.notification;


import com.example.conhece_cooks.model.Cliente;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

//@Primary
@Profile("dev")
@TipoDoNotificador(NivelUrgencia.URGENTE)
@Component
public class NotificadorEmailMock implements Notificador {

    public NotificadorEmailMock () {
        System.out.println("NotificadorEmail MOCK");
    }

    @Override
    public void notificar(Cliente cliente, String mensagem) {
        System.out.printf("MOCK: Notifição seria enviada para %s através do e-mail %s: %s\n",
                cliente.getNome(), cliente.getEmail(),  mensagem);
    }
}
