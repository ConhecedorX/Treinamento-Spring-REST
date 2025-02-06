package com.conhecedev.di.notification;

import com.conhecedev.di.model.Cliente;

public interface Notificador {

    void notificar(Cliente cliente, String mensagem);

}
