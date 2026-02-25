package com.MeuImovel.MeuImovelCRM.model;

public class Alertas {
    private String titulo;
    private String cor;
    private String mensagem;
    private Agenda entidadeDoAlerta; //aqui ele vai puxar todas as informaõcoes da agenda(status, entidade, etc...) para poder colocar a lista de entidades ja filtrada
}

// e aqui onde serao criadas as "pastas" que foram filtradas na agenda do corretor