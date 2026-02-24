package com.MeuImovel.MeuImovelCRM.model;

public class Alertas {
    private String titulo;
    private String cor;
    private String mensagem;

    private String entidadeDoAlerta; //aqui vai mostrar qual entidade(cliente, imovel, dependente) o alerta serve
    private String statusEntidade; //vai ser o filtro da entidade;
}

// e aqui onde serao criadas as "pastas" que foram filtradas na agenda do corretor