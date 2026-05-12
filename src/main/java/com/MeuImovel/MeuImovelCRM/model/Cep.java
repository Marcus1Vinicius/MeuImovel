package com.MeuImovel.MeuImovelCRM.model;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import lombok.Getter;

@Getter
@Embeddable
public class Cep{
    @Column(name = "CEP")
    private String cepDigits;

    protected Cep(){}

    public Cep(String cepInput){
        validateCep(cepInput);
        this.cepDigits = cepInput;
    }
    public String getCep() {
        return this.cepDigits;
    }

    public void validateCep(String cepDigits){

        if(cepDigits == null){
            throw new IllegalArgumentException("CEP nulo!");
        }

        String cepClean = cepDigits.replaceAll("\\D", "");

        if(!cepClean.matches("^\\d+$")){
            throw new IllegalArgumentException("O cep deve conter apenas números!");
        }

        if(cepClean.length() != 8){
            throw new IllegalArgumentException("CEP deve conter exatamente 8 números.");
        }

        if (cepClean.matches("(\\d)\\1{7}")) {
            throw new IllegalArgumentException("O CEP não pode conter apenas números repetidos!");
        }

        this.cepDigits = cepClean;
    }
}
