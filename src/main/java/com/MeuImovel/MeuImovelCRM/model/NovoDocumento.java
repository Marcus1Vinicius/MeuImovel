package com.MeuImovel.MeuImovelCRM.model;

import jakarta.persistence.Embeddable;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Embeddable
@Data
public class NovoDocumento {
    @Id // Identifica que este campo é a chave primária
    @GeneratedValue(strategy = GenerationType.IDENTITY) // Diz ao banco para auto-incrementar o número
    private Long id;
    private String nome;
    private String urlParaLocalizarArquivo;
}
