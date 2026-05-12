package com.MeuImovel.MeuImovelCRM.model;
import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import lombok.Getter;

@Getter
@Embeddable
public class Celular {
    @Column(name = "celular")
    private String celularDigitos;

    protected Celular(){

    }
    public Celular(String celularEntrada){
        validateDigitosCelular(celularEntrada);
        this.celularDigitos = celularEntrada;
    }

    public String getCelular(){
        return this.celularDigitos;
    }

    private void validateDigitosCelular(String celularDigitos){ // esse metodo vai validar o celular

        if(celularDigitos == null){
            throw new IllegalArgumentException("The phone number cannot null!");
        }

        String phoneClean = celularDigitos.replaceAll("\\D", "");

        if(phoneClean.length() != 11){
            throw new IllegalArgumentException("The phone number must have 11 digits!");
        }

        if (phoneClean.matches("(\\d)\\1{10}")) {
            throw new IllegalArgumentException("The phone number cannot consist of repeated numbers!");
        }

        if(!phoneClean.matches("^[1-9]{2}9[0-9]{8}$")){
            throw new IllegalArgumentException("The phone number invalid!");
        };

    }
}


