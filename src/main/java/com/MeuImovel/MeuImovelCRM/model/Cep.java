package com.MeuImovel.MeuImovelCRM.model;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;

@Embeddable
public class Cep {
    @Column(name = "CEP")
    private String valor;

    protected Cep(){}

    public Cep(String cepEntrada){

        if (cepEntrada == null || !cepEntrada.matches("\\d{8}")) {
            throw new IllegalArgumentException("CEP deve conter exatamente 8 números.");
        }
        this.valor = cepEntrada;

    }

    public String getValor() { return valor; }

    private boolean validarCep(String valor){ //esse metodo garante que o cep vai estar no formato requisitado pela api

        if(valor == null){
            throw new IllegalArgumentException("O cep não pode ser nulo!");
        }

        if(!valor.matches("^\\\\d+$")){
            throw new IllegalArgumentException("O cep deve conter apenas números!");
        }

        if(valor.length() != 8){
            throw new IllegalArgumentException("O cep deve conter apenas 8 digitos!");
        }

        return valor.matches("^\\d{5}\\d{8}$");

    }
}
