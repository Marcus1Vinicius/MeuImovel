package com.MeuImovel.MeuImovelCRM.model;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

import java.time.LocalDateTime;

public class Alerta {
    @Id // Identifica que este campo é a chave primária
    @GeneratedValue(strategy = GenerationType.IDENTITY) // Diz ao banco para auto-incrementar o número
    private Long id;
    private String mensagem; // aqui o corretor vai colocar o intuito da mensagem
    private String entidade; // aqui o corretor escolhe se ele vai agendar o alerta sobre cliente, imovel, dependente ou contrato
    private Status statusEntidade; //vai ser o filtro da entidade escolhida
    private LocalDateTime data;
    private int recorrencia; //aqui o corretor pode escolher ser alertado diariamente, semanal, mensal, trimestral, semestral ou anual;
}

// aqui o corretor vai criar alertas por n motivos, esses alertas quando chegarem no prazo determinado, vao estar no campo agenda

