package com.MeuImovel.MeuImovelCRM.model;

import java.time.LocalDateTime;

public class Agenda {
    private String mensagem;
    private String entidade; // aqui o corretor escolhe se ele vai agendar o alerta sobre cliente, imovel ou dependente
    private Status statusEntidade; //vai ser o filtro da entidade escolhida
    private LocalDateTime data;
    private String frequencia; //aqui o corretor pode escolher ser alertado semanal, mensal, trimestral, semestral ou anual;

}

// aqui o corretor por meio dos alertas vai criar "pastas" de clientes que ele pode selecionar a data, o status do cliente,
// adicionar um titulo e uma cor para que seja visto na agenda, seria como agendar um alerta para o corretor.
