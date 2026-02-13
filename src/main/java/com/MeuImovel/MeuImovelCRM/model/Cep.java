package com.MeuImovel.MeuImovelCRM.model;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;

@Embeddable
public class Cep {
    @Column(name = "CEP")
    private String CEP;

    protected Cep(){}

    public Cep(String cepEntrada){

        if(!formatarCep(cepEntrada)){
            throw new IllegalArgumentException("Cep inválido!");
        }

    }

    private boolean formatarCep(String CEP){ //esse metodo garante que o cep vai estar no formato requisitado pela api

        if(CEP == null){
            throw new IllegalArgumentException("O cep não pode ser nulo!");
        }

        if(!CEP.matches("^\\\\d+$")){
            throw new IllegalArgumentException("O cep deve conter apenas números!");
        }

        if(CEP.length() != 8){
            throw new IllegalArgumentException("O cep deve conter apenas 8 digitos!");
        }

        return CEP.matches("^\\d{5}\\d{8}$");

    }

    private boolean validarCep (String CEP){ //esse metodo vai se comunicar com a API viacep para validar o nosso cep



    }
}
