package com.MeuImovel.MeuImovelCRM.controller;

import com.MeuImovel.MeuImovelCRM.service.ViaCepService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/imoveis")
public class ViaCepController {
    private final ViaCepService viaCepService;

    public ViaCepController(ViaCepService viaCepService) {
        this.viaCepService = viaCepService;
    }
}

//aqui vai estar todas as requisiçoes que envolvem a entidade imovel no nosso sistema
