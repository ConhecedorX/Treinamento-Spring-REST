package com.conhecedev.di.service;

import com.conhecedev.di.model.Cliente;
import com.conhecedev.di.model.Produto;
import com.conhecedev.di.notification.Notificador;

public class EmissaoNotaFiscalService {

    private Notificador notificador;

    public EmissaoNotaFiscalService(Notificador notificador) {
        this.notificador = notificador;
    }

    public void emitir(Cliente cliente, Produto produto) {
        // TODO emite a nota fiscal aqui...

        this.notificador.notificar(cliente, "Nota fiscal do produto" + produto.getNome() + " foi emitida! ");
    }

}
