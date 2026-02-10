package com.MeuImovel.MeuImovelCRM.model;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import org.hibernate.annotations.Collate;


@Embeddable // preciso adicionar em todos os objetos que sao atributos em outras classes

public class Cpf {
    //Atributos
    @Column(name = "cpf")
    private String cpfDigitos;

    //construtores
    protected Cpf(){

    };

    public Cpf(String cpfEntrada){
        String cpfProcessado = validarTamanhoCpf(cpfEntrada);

        if(!ValidarCpf(cpfProcessado)){
            throw new IllegalArgumentException("O cálculo do CPF é inválido.");
        }
        this.cpfDigitos = cpfProcessado;
    }

    //metodos
    private String validarTamanhoCpf(String cpfDigitos) { //esse metodo retira os pontos e tracos do cpf, valida se foi digitado algo no cpf, valida a quantidade de caracteres, valida se esses caracteres sao somente numericos e converte o cpf string para int

        if(cpfDigitos == null){
            throw new IllegalArgumentException("O CPF nao pode ser nulo");
        }

        String cpfLimpo = cpfDigitos.replaceAll("[.-]", "");

        if(!cpfLimpo.matches("\\d{11}")){
            throw new IllegalArgumentException("O CPF deve conter apenas 11 números");
        }

        if (cpfLimpo.matches("(\\d)\\1{10}")) {
            throw new IllegalArgumentException("CPF inválido (números repetidos)");
        }

        return cpfLimpo;
    }
    private boolean ValidarCpf(String cpfLimpo) { // esse metodo vai realizar o calculo necessario para validar os dois ultimos digitos do cpf, para validar se o cpf esta correto ou incorreto

        int[] pesosPrimeiroDigito = {10, 9, 8, 7, 6, 5, 4, 3, 2};

        int soma = 0;

        for(int i = 0; i < 9; i++){
            int conversor = cpfLimpo.charAt(i) - '0';
            soma += conversor * pesosPrimeiroDigito[i];
        }

        int validarPrimeiroDigito = (soma * 10) % 11;

        if(validarPrimeiroDigito == 10){
            validarPrimeiroDigito = 0;
        }

        int valorPrimeiroDigito = cpfLimpo.charAt(9) - '0';

      if(validarPrimeiroDigito != valorPrimeiroDigito){
           return false;
       }

      // agora vamos validar o decimo segundo digito do cpf

      soma = 0;
      int[] pesoSegundoDigito = {11, 10, 9, 8, 7, 6, 5, 4, 3, 2};

      for(int j = 0; j < 10; j++){
          int conversor = cpfLimpo.charAt(j) - '0';
          soma += conversor * pesoSegundoDigito[j];
      }

      int validarSegundoDigito = (soma * 10) % 11;

      if(validarSegundoDigito == 10){
          validarSegundoDigito = 0;
      }

      int valorSegundoDigito = cpfLimpo.charAt(10) - '0';

      if(validarSegundoDigito != valorSegundoDigito){
          return false;
      }

      return true;

    }

    @Override
    public String toString() {
        // Esse método aplica a máscara: 000.000.000-00 para melhor leitura do user
        return cpfDigitos.substring(0, 3) + "." +
                cpfDigitos.substring(3, 6) + "." +
                cpfDigitos.substring(6, 9) + "-" +
                cpfDigitos.substring(9);
    }
}

