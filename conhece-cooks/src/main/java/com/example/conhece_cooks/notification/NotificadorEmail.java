package com.example.conhece_cooks.notification;


import com.example.conhece_cooks.model.Cliente;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

//@Primary
@Profile("prod")
@TipoDoNotificador(NivelUrgencia.URGENTE)
@Component
public class NotificadorEmail implements Notificador {

    public NotificadorEmail() {
        System.out.println("NotificadorEmail Real");
    }

    @Override
    public void notificar(Cliente cliente, String mensagem) {

        System.out.printf("Notificando %s através do e-mail %s: %s\n"
                , cliente.getNome(), cliente.getEmail(),  mensagem);
    }
}
