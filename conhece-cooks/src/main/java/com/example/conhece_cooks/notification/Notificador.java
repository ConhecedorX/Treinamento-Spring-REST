package com.example.conhece_cooks.notification;

import com.example.conhece_cooks.model.Cliente;

public interface Notificador {
    void notificar(Cliente cliente, String mensagem);
}
