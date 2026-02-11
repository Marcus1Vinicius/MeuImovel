package com.MeuImovel.MeuImovelCRM;

import com.MeuImovel.MeuImovelCRM.model.Senha;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class SenhaTest {
    @Test
    @DisplayName("Não deve aceitar senha com formato inválido")
    void testFormatoSenha(){assertThrows(IllegalArgumentException.class, () -> new Senha("123f4568"));}

    @Test
    @DisplayName("Não deve aceitar senha com menos de 8 caracteres")
    void testSenhaCurta(){assertThrows(IllegalArgumentException.class, () -> new Senha("123f456"));}

    @Test
    @DisplayName("Não deve aceitar senhas quase certas")
    void testSenhaQuaseValida(){assertThrows(IllegalArgumentException.class, () -> new Senha("123f@456"));}

    @Test
    @DisplayName("Deve criar uma nova senha")
    void testSenha(){
        String senhaValida = "Ouh@54jKl";
        assertDoesNotThrow(() -> new Senha(senhaValida));
    }
}
