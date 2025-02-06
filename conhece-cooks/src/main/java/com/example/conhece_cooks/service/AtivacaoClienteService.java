package com.example.conhece_cooks.service;


import com.example.conhece_cooks.model.Cliente;
import com.example.conhece_cooks.notification.NivelUrgencia;
import com.example.conhece_cooks.notification.Notificador;
import com.example.conhece_cooks.notification.TipoDoNotificador;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class AtivacaoClienteService {

    @TipoDoNotificador(NivelUrgencia.URGENTE)
    @Autowired(required = false)
    private Notificador notificador;

    public void ativar(Cliente cliente) {
        cliente.ativar();

        notificador.notificar(cliente, "Seu cadastro no sistema está ativo!");

//            for(Notificador notificador : notificadores) {
//                notificador.notificar(cliente, "Seu cadastro no sistema está ativo!");
//            }
    }



//    @Autowired
//    public AtivacaoClienteService (Notificador notificador) {
//        this.notificador = notificador;
//
//        System.out.println("AtivacaoClienteService: " + notificador);
//    }

//    public AtivacaoClienteService(String qualquer){
//
//    }


//    @Autowired
//    public void setNotificador(Notificador notificador) {
//        this.notificador = notificador;
//    }
}
