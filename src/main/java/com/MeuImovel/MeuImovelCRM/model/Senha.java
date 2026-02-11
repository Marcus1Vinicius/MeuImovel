package com.MeuImovel.MeuImovelCRM.model;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;

@Embeddable
public class Senha {
    @Column(name = "senha")
    private String senha;

    protected Senha(){
    }

    public Senha (String senhaEntrada){

        if(!validarSenha(senhaEntrada)){
            throw new IllegalArgumentException("Senha inválida! A senha precisa de 8 caracteres(letras maiusculas e minuscula, digitos numericos e caracteres especiais '@#$%' ");
        }
        this.senha = senhaEntrada;
    }

    private boolean validarSenha(String senha){ //precisamos que a senha tenha no minimo 8 caracteres, onde tenha pelo menos um numero, um digito especial e uma letra maiuscula

        if(senha == null){
            throw new IllegalArgumentException("A senha não pode ser nula!");
        }

        if(senha.length() < 8){
            throw new IllegalArgumentException("A senha precisar ter no minimo 8 caracteres");
        }

        return senha.matches("^(?=.*[A-Z])(?=.*\\d)(?=.*[@#$%^&+=!]).+$");

    }
}
