package com.MeuImovel.MeuImovelCRM;

import com.MeuImovel.MeuImovelCRM.model.Cpf;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class CpfTest {

    @Test
    @DisplayName("Não deve aceitar CPF com formato inválido")
    void testeFormatoInvalido() {
        assertThrows(IllegalArgumentException.class, () -> new Cpf("123.456"));
    }

    @Test
    @DisplayName("Não deve aceitar CPF com números repetidos")
    void testeNumerosRepetidos() {
        assertThrows(IllegalArgumentException.class, () -> new Cpf("11111111111"));
    }

    @Test
    @DisplayName("Não deve aceitar CPF quase valido")
    void testeCpfQuaseInvalido() {
        assertThrows(IllegalArgumentException.class, () -> new Cpf("52998224729"));
    }

    @Test
    @DisplayName("Deve criar CPF com sucesso quando o número é válido")
    void testeCpfValido() {
        // Use um CPF válido real para esse teste (ex: gerado por um site de testes)
        String cpfValido = "52998224725";
        assertDoesNotThrow(() -> new Cpf(cpfValido));
    }
}