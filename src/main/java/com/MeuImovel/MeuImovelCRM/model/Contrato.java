package com.MeuImovel.MeuImovelCRM.model;

import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;
@Data // Cria Getters, Setters e muito mais
@NoArgsConstructor // Cria o construtor vazio para o Hibernate
@AllArgsConstructor // Cria o construtor completo
@Entity
public class Contrato {
    private Cliente cliente;
    private Imovel imovel;
    private LocalDateTime data;
    private String arquivoDocumento;
    @ManyToOne
    @JoinColumn(name = "status_id")
    private Status statusDocumento;
    private Recorrencia validade; // aqui o corretor vai colocar em quanto tempo o contrato se vence
}
