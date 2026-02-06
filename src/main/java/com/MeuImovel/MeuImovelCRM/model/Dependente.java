package com.MeuImovel.MeuImovelCRM.model;

import jakarta.persistence.*;

@Entity
public class Dependente {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nome;
    @Embedded
    private Cpf cpfDependente;

    @Enumerated(EnumType.STRING)
    private StatusDependente status;

    private int dataNascimento;
    @Embedded
    private CertidaoDeNascimento Certidao;

    @Embedded
    private String carteiraDeTrabalho;



}

// o status do dependente vai precisar ser criado em formato de enum assim como statusCliente