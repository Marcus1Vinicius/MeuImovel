package com.MeuImovel.MeuImovelCRM.model;

import jakarta.persistence.*;

import java.time.LocalDateTime;

public class Alerta {
    @Id // Identifica que este campo é a chave primária
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String mensagem;
    @Enumerated(EnumType.STRING)
    private String entidade; // aqui o corretor escolhe se ele vai agendar o alerta sobre cliente, imovel, dependente ou contrato
    private Status statusEntidade; //vai ser o filtro da entidade escolhida
    private LocalDateTime data;
    private Recorrencia recorrencia;
}

// aqui o corretor vai criar alertas por n motivos, esses alertas quando chegarem no prazo determinado, vao estar no campo agenda

