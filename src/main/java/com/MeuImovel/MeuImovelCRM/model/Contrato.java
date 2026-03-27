package com.MeuImovel.MeuImovelCRM.model;

import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

import java.time.LocalDateTime;
public class Contrato {
    private Cliente cliente;
    private Imovel imovel;
    private LocalDateTime data;
    private int validade; //vai ser contada em dias

    private String arquivoDocumento;
    @ManyToOne
    @JoinColumn(name = "status_id")
    private Status statusDocumento;
}
