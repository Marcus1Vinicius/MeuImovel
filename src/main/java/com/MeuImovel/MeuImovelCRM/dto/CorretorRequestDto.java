package com.MeuImovel.MeuImovelCRM.dto;

import com.MeuImovel.MeuImovelCRM.model.AssinaturaCorretor;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Past;
import java.time.LocalDate;

public record CorretorRequestDto(
        @NotBlank(message = "O nome é obrigatório")
        String nome,

        @NotNull(message = "A data de nascimento é obrigatória")
        @Past(message = "A data de nascimento deve ser no passado")
        LocalDate dataNascimento,

        @NotBlank(message = "O CRECI é obrigatório")
        String creci,

        String foto,

        @NotBlank(message = "O CPF é obrigatório")
        String cpf,

        @NotBlank(message = "A senha é obrigatória")
        String senha,

        @NotBlank(message = "O e-mail é obrigatório")
        String email,

        @NotBlank(message = "O celular é obrigatório")
        String celular,

        AssinaturaCorretor pacote

) {
}

//no dto nós usamos os tipos primitivos, e usamos as anotacoes de validacao do jakarta validation para evitar que o user envie dados incorretos logo de cara
