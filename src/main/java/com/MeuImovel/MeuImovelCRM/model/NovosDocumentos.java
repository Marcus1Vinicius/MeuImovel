package com.MeuImovel.MeuImovelCRM.model;

import jakarta.persistence.Embeddable;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Embeddable
@Data
public class NovosDocumentos {
    private String nome;
    private String urlParaLocalizarArquivo;
}
