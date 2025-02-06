package com.conhecedev.di;

import com.conhecedev.di.model.Cliente;
import com.conhecedev.di.notification.Notificador;
import com.conhecedev.di.notification.NotificadorEmail;
import com.conhecedev.di.notification.NotificadorSMS;
import com.conhecedev.di.service.AtivacaoClienteService;

public class Main {

    public static void main(String[] args) {
        Cliente joao = new Cliente("João", "joao@xyz.com", "11 32423512");
        Cliente maria = new Cliente("Maria", "maria@xyz.com", "11 32155510");

        Notificador notificador = new NotificadorSMS() ;

        AtivacaoClienteService ativacaoCliente = new AtivacaoClienteService(notificador);
        ativacaoCliente.Ativar(joao);
        ativacaoCliente.Ativar(maria);
    }
}
