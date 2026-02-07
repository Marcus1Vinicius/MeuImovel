package com.MeuImovel.MeuImovelCRM.model;

import jakarta.persistence.*;
import lombok.Data;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
@Data
@NoArgsConstructor // Cria o construtor vazio para o Hibernate
@AllArgsConstructor // Cria o construtor completo
@Entity
public class Imovel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    private String nome;

    private int valor;

    @Enumerated(EnumType.STRING)
    private StatusImovel status; //vai ser uma lista assim como o status cliente

    private String fotos;

    private String videos;

    private String imagem360;

    private boolean financiavel; //talvez uma lista, vai servir basicamente para dizer se aquele imóovel pode ser financiado

    @Embedded
    private Cep cepImovel;

    private String Bairro;

    private int numero;

    private String construtora;

    @ManyToOne // Muitos imoveis para um corretor
    @JoinColumn(name = "corretor_id") // Nome da coluna que guardará o ID do corretor no banco
    private Corretor corretorResponsavel;

    @ManyToOne // Muitos imoveis para um cliente
    @JoinColumn(name = "cliente_id") // Nome da coluna que guardará o ID do corretor no banco
    private Cliente clienteComprador;

}
