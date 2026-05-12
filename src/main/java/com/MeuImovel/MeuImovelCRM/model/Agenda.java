package com.MeuImovel.MeuImovelCRM.model;

import jakarta.persistence.Entity;

import java.time.LocalDateTime;
@Entity
public class Agenda {
    private Alerta entidadeAlerta; //aqui ele vai puxar todas as information do alerta(status, entidade, etc...) para poder colocar a lista de entidades ja filtrada

}
// aqui vai aparecer todos os alertas ativados
