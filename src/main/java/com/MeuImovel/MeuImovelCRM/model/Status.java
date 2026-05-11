package com.MeuImovel.MeuImovelCRM.model;

import jakarta.persistence.*;
@Entity
public class Status {
private
    @Id // Identifica que este campo é a chave primária
    @GeneratedValue(strategy = GenerationType.IDENTITY) // Diz ao banco para auto-incrementar o número
    Long id;
    String nome;
    String cor;
    @Enumerated(EnumType.STRING)
    String tipoEntidade;
}

// aqui o corretor vai "etiquetar" seus clientes, imoveis e dependentes cadastrados