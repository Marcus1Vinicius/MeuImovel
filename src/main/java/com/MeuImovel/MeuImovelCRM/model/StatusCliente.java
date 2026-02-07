package com.MeuImovel.MeuImovelCRM.model;

public enum StatusCliente {

        // O StatusCliente vai precisar ser separado, assim fica mais facil a organizacao do corretor para os seus clientes
        DOCUMENTACAO_INCOMPLETA,
        DOCUMENTACAO_COMPLETA,
        CLIENTE_SEM_IMOVEL,
        CLIENTE_COM_IMOVEL,
        CLIENTE_SEM_DEPENDENTE,
        CLIENTE_COM_DEPENDENTE,
        CLIENTE_APROVADO,
        CLIENTE_REPROVADO,
        CLIENTE_EM_PROCESSO_DE_VENDA;

}
