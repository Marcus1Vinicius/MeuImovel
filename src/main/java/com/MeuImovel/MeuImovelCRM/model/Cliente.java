package com.MeuImovel.MeuImovelCRM.model;
import jakarta.persistence.*;
import lombok.*;
import org.springframework.context.annotation.EnableMBeanExport;

import java.util.ArrayList;
import java.util.List;

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
    private Cpf cpfDigitadoCliente;

    private String arquivoDoCpfCliente; // aqui vai ficar a URL do arquivo escaneado do cliente;

    @Embedded
    private Rg rgDigitadoCliente;

    private String arquivoDoRgCliente; // aqui vai ficar a URL do arquivo escaneado do cliente;

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
    public StatusCliente status; // para o corretor poder saber quais os estágios que o cliente se encontra

    @ManyToOne // Muitos clientes para um corretor
    @JoinColumn(name = "corretor_id") // Nome da coluna que guardará o ID do corretor no banco
    private Corretor corretorVendedor;

    @OneToMany(mappedBy = "clienteComprador") // Muitos imoveis para um cliente // Nome da coluna que guardará o ID do imovel no banco
    private List<Imovel> imoveisCliente;

    @ElementCollection
    @CollectionTable(name = "documento_extra_do_cliente", joinColumns = @JoinColumn(name = "clientr_id"))
    @Column(name = "NovoDocumentoCliente")
    private List<NovosDocumentos> novoDocumentoCliente = new ArrayList<>();// atributo dedicado a documentos que surgem a medida que o processo de compra do imovel vai dando certo

}
