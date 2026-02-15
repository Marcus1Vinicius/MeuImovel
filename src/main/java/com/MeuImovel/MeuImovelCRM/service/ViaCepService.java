package com.MeuImovel.MeuImovelCRM.service;

import com.MeuImovel.MeuImovelCRM.dto.ViaCepResponse;
import com.MeuImovel.MeuImovelCRM.model.Cep;
import tools.jackson.databind.ObjectMapper;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class ViaCepService {
    public ViaCepResponse getCep(String cep){
        ViaCepResponse enderecoDto = null;
        try {
            HttpClient client = HttpClient.newHttpClient();
            HttpRequest request = HttpRequest.newBuilder()
                    .uri(URI.create("https://viacep.com.br/ws/"+ cep +"/json/")).build();
            HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());

            ObjectMapper mapper = new ObjectMapper();
            enderecoDto = mapper.readValue(response.body(), ViaCepResponse.class);
        } catch (Exception e){
            e.printStackTrace();
        }
        return enderecoDto;
    }
}
