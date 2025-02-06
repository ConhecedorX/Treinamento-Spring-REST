package com.conhecedev.di.notification;

import com.conhecedev.di.model.Cliente;

public class NotificadorEmail implements Notificador{

    @Override
    public void notificar(Cliente cliente, String mensagem) {
        System.out.printf("Notificando %s através do e-mail %s: %s\n", cliente.getnome(), cliente.getEmail(), mensagem);
    }
}
