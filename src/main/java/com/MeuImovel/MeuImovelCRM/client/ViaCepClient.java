package com.MeuImovel.MeuImovelCRM.client;
import com.MeuImovel.MeuImovelCRM.dto.ViaCepResponse;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestClient;

@Component
public class ViaCepClient {
    private final RestClient restClient;

    public ViaCepClient() {
        this.restClient = RestClient.create("https://viacep.com.br/ws/");
    }

    public ViaCepResponse buscarDados (String cepNumeros){ // preciso entender como fazer essa parte
        return RestClient.get()
    }
}
