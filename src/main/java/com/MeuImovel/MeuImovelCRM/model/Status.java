package com.MeuImovel.MeuImovelCRM.model;

import jakarta.persistence.*;

public class Status {

    @Id // Identifica que este campo é a chave primária
    @GeneratedValue(strategy = GenerationType.IDENTITY) // Diz ao banco para auto-incrementar o número
    private Long id;
    private String nome;
    private String cor;
    @Enumerated(EnumType.STRING)
    private String tipoEntidade;
}

// aqui o corretor vai "etiquetar" seus clientes, imoveis e dependentes cadastrados