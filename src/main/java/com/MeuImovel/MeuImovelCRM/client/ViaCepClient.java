package com.MeuImovel.MeuImovelCRM.client;
import com.MeuImovel.MeuImovelCRM.dto.ViaCepResponse;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestClient;
import com.MeuImovel.MeuImovelCRM.config.ClientConfig;

@Component
public class ViaCepClient {
    private final RestClient restClient;

    public ViaCepClient(RestClient restClient) {
        this.restClient = restClient;
    }

    public ViaCepResponse buscarCep(String cepNumeros){ // preciso entender como fazer essa parte
        return RestClient.get()
                .uri("{cep}/json/", cepNumeros)
                .retrieve()
                .body(ViaCepResponse.class);
    }
}
