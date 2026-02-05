package com.MeuImovel.MeuImovelCRM.model;
import jakarta.persistence.*;
import lombok.*;
@Data // Cria Getters, Setters e muito mais
@NoArgsConstructor // Cria o construtor vazio para o Hibernate
@AllArgsConstructor // Cria o construtor completo
@Entity
public class Cliente {
    @Id // Identifica que este campo é a chave primária
    @GeneratedValue(strategy = GenerationType.IDENTITY) // Diz ao banco para auto-incrementar o número
    private Long id;
    private String nome;
    @Embedded
    private Cpf cpfCliente;
    @Embedded
    private Rg rgCliente;
    private String carteiraDeTrabalho; // vou adicionar apenas o link para onde o arquivo fica salvo, para melhor performace de consulta.
    private String comprovanteDeResidencia;
    @Embedded
    private Email emailCliente;
    @Embedded
    private Celular celularCliente;
    @OneToOne(cascade = CascadeType.ALL) // Um cliente para um único dependente
    @JoinColumn(name = "dependente_id", referencedColumnName = "id")
    private Dependente dependente;
    private int tempoDeCarteiraAssinada; // vai contabilizar quantos meses(se o cliente nãão tiver mais de um ano de carteira assinada) se tiver mais de um ano vai contabilizar em anos.
    private int rendaDoCliente;
    @Enumerated(EnumType.STRING)
    public StatusCliente status; // para o corretor poder saber quais os estáágios que o cliente se encontra

    @ManyToOne // Muitos clientes para um corretor
    @JoinColumn(name = "corretor_id") // Nome da coluna que guardará o ID do corretor no banco
    private Corretor corretorVendedor;

}
