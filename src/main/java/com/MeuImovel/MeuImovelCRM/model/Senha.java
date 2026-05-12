package com.MeuImovel.MeuImovelCRM.model;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;

@Embeddable
public class Senha {
    @Column(name = "senha")
    private String senha;

    protected Senha(){
    }
    public Senha(String valorSenha){
        validateSenha(valorSenha);
        this.senha = valorSenha;
    }

    public String getSenha(){
        return this.senha;
    }

    public void validateSenha (String senhaEntrada){
        if(senhaEntrada == null){
            throw new IllegalArgumentException("A senha não pode ser nula!");
        }
        if(senhaEntrada.length() < 8){
            throw new IllegalArgumentException("A senha precisar ter no minimo 8 caracteres");
        }
        if(!senhaEntrada.matches("^(?=.*[A-Z])(?=.*[a-z])(?=.*\\d)(?=.*[@#$%^&+=!]).{8,}$")){
            throw new IllegalArgumentException("The password is invalid format! You need add uppercase and lowercase letters, numeric digits, and special characters '@#$%'");
        }
    }

}
