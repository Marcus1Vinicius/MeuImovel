package com.MeuImovel.MeuImovelCRM.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

import java.time.LocalDate;

@Data // Cria Getters, Setters e muito mais
@NoArgsConstructor // Cria o construtor vazio para o Hibernate
@AllArgsConstructor // Cria o construtor completo

@Entity
public class Corretor {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    private String nome;

    private LocalDate dataNascimento;

    private int idade;

    private String creciCorretor;

    private String fotoCorretor;

    @Embedded
    private Cpf cpfCorretor;

    @Embedded
    private Senha senhaCorretor;

    @Embedded
    private Email emailCorretor;

    @OneToMany(mappedBy = "corretorVendedor") // Muitos clientes para um corretor // Nome da coluna que guardará o ID do cliente no banco
    private List<Cliente> clientesCorretor;

    @OneToMany(mappedBy = "corretorResponsavel") // Muitos imoveis para um corretor // Nome da coluna que guardará o ID do imovel no banco
    private List<Imovel> imoveisCorretor;

    private AssinaturaCorretor pacote; // temos que desenvolver a logica necessaria para a assinatura do corretor

}
