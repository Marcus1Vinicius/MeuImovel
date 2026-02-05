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

}

// o status do dependente vai vir para ca