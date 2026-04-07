package com.MeuImovel.MeuImovelCRM.service;

import com.MeuImovel.MeuImovelCRM.dto.ViaCepResponse;
import com.MeuImovel.MeuImovelCRM.model.Cep;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpStatusCode;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestClient;
import tools.jackson.databind.ObjectMapper;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
@Service
public class ViaCepService {
    private final RestClient restClient;

    public ViaCepService(RestClient.Builder builder, @Value("${viacep.api.url}") String urlViaCep) {
        this.restClient = builder
                .baseUrl(urlViaCep)
                .build();
    }

    public ViaCepResponse getCep(String Cep){
        return restClient.get()
                .uri("/{cep}/json/", Cep)
                .retrieve()
                .onStatus(HttpStatusCode::is4xxClientError, (request, response) -> {
                    throw new RuntimeException("Cep não encontrado!");
                })
                .body(ViaCepResponse.class);
    }
}

//aqui e a regra de negocio para a validacao de cep no nosso sistema
