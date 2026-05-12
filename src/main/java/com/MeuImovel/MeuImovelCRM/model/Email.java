package com.MeuImovel.MeuImovelCRM.model;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import lombok.Getter;

@Getter
@Embeddable
public class Email {
    @Column(name = "email")
    private String email;

    protected Email(){

    }
    public Email(String emailEntrada){
        validateEmail(emailEntrada);
        this.email = emailEntrada;
    }

    private void validateEmail(String email){

        if(email == null){
            throw new IllegalArgumentException("O email não pode ser nulo!");
        }
        if(!email.matches("^[a-zA-Z0-9_+&*-]+(?:\\.[a-zA-Z0-9_+&*-]+)*@(?:[a-zA-Z0-9-]+\\.)+[a-zA-Z]{2,7}$")){
            throw new IllegalArgumentException("Email format invalid!");
        }
    }
}
