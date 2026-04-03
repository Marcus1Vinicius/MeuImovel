package com.MeuImovel.MeuImovelCRM.model;

public enum TipoStatus {
    vencido, // vai servir para contrato
    noPrazo, // vai servir para contrato
    documentacaoImcompleta, // vai servir para cliente
    documentacaoCompleta, // vai servir para cliente
    documentacaoDependenteImcompleta, // vai servir para dependente
    documentacaoDependentecompleta, // vai servir para dependente
    avaliacaoNoPrazo, // vai servir para cliente
    avaliacaoVencida, // vai servir para cliente

}

// aqui eu vou deixar status pre-programados que serao necessarios, pois exigem uma logica de validacao que o usuario nao vai poder programar