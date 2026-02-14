package com.MeuImovel.MeuImovelCRM.dto;

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
        String siafi) {}
