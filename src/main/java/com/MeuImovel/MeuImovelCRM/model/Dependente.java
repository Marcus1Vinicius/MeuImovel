package com.MeuImovel.MeuImovelCRM.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

import java.util.ArrayList;
import java.util.List;

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
    private Cpf cpfDigitadoDependente;

    private String arquivoDoCpfDependente;

    @ManyToOne
    @JoinColumn(name = "Statusid")
    private Status status;

    private int idade;

    private LocalDate dataNascimento;

    @Embedded
    private String CertidaoNascimento;

    @Embedded
    private String carteiraDeTrabalho; // se o dependente for de maior

    private String arquivoDoRgDependente;

    @ElementCollection
    @CollectionTable(name = "documento_extra_do_dependente", joinColumns = @JoinColumn(name = "dependente_id"))
    @Column(name = "NovoDocumentoDependente")
    private List<NovoDocumento> novoDocumentoDependente = new ArrayList<>();// atributo dedicado a documentos que surgem a medida que o processo de compra do imovel vai dando certo
}
