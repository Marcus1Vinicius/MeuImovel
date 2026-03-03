package com.MeuImovel.MeuImovelCRM.model;

import java.time.LocalDateTime;
public class Contrato {
    private Cliente cliente;
    private Imovel imovel;
    private LocalDateTime data;
    private int validade; //vai ser contada em dias

    private String arquivoDocumento;

    private Status statusDocumento;
}
