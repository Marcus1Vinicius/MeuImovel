package com.MeuImovel.MeuImovelCRM.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data // Cria Getters, Setters e muito mais
@NoArgsConstructor // Cria o construtor vazio para o Hibernate
@AllArgsConstructor // Cria o construtor completo

@Entity
public class Corretor {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String nome;
    @Embedded
    private Creci creciCorretor;
    private String fotoCorretor;
    @Embedded
    private Cpf cpfCorretor;
    @Embedded
    private Senha senhaCorretor;
    @Embedded
    private Email emailCorretor;

}
