package com.MeuImovel.MeuImovelCRM.dto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true) //ignora propriedades desconhecidas
public record ViaCepResponse(
        String cep,
        String logradouro,
        String complemente,
        String unidade,
        String bairro,
        String localidade,
        String uf,
        String estado,
        String regiao,
        String ibge,
        String gia,
        String ddd,
        String siafi) {
}
