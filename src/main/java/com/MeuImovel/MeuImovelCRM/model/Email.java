package com.MeuImovel.MeuImovelCRM.model;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;

@Embeddable
public class Email {
    @Column(name = "email")
    private String email;

    protected Email(){

    }
    public Email(String emailEntrada){

        boolean emailProcessado = validarEmail(emailEntrada);

        if(!emailProcessado){
            throw new IllegalArgumentException("email inválido!");
        }

        this.email = emailEntrada;
    }

    private boolean validarEmail(String email){

        if(email == null){
            throw new IllegalArgumentException("O email não pode ser nulo!");
        }

        return email.matches("^[a-zA-Z0-9_+&*-]+(?:\\.[a-zA-Z0-9_+&*-]+)*@(?:[a-zA-Z0-9-]+\\.)+[a-zA-Z]{2,7}$");
    }
}
