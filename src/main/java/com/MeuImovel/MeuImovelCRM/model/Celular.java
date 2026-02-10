package com.MeuImovel.MeuImovelCRM.model;
import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;

@Embeddable
public class Celular {
    @Column(name = "celular")
    private String celularDigitos;

    protected Celular(){

    }

    public Celular(String celularEntrada){

        boolean celularProcessado = validarDigitosCelular(celularEntrada);

        if (celularProcessado){
            throw new IllegalArgumentException("Celular invalido!");
        }
        this.celularDigitos = celularEntrada.replaceAll("\\D", "");

    }

    private boolean validarDigitosCelular(String celularDigitos){ // esse metodo vai validar o celular

        if(celularDigitos == null){
            throw new IllegalArgumentException("O celular não pode ser nulo!");
        }

        String celularLimpo = celularDigitos.replaceAll("\\D", "");

        return celularLimpo.matches("^(?:1[1-9]|[2-9][1-9])9\\d{8}$"); // esse regex faz toda a validação dos celulares do brasil

    }
}


