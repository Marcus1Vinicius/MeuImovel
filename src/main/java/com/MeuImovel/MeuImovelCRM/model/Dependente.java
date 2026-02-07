package com.MeuImovel.MeuImovelCRM.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor // Cria o construtor vazio para o Hibernate
@AllArgsConstructor // Cria o construtor completo
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

    private int idade;

    @Embedded
    private CertidaoDeNascimento Certidao;

    @Embedded
    private String carteiraDeTrabalho;

    @Embedded
    private Rg rgDependente;
}
