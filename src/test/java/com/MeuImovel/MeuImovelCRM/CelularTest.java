package com.MeuImovel.MeuImovelCRM;
import com.MeuImovel.MeuImovelCRM.model.Celular;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CelularTest {
    @Test
    @DisplayName("Não deve aceitar celular com tamanho inválido")
    void testeFormatoInvalido() {
        assertThrows(IllegalArgumentException.class, () -> new Celular("843465"));
    }

    @Test
    @DisplayName("Não deve aceitar celular com números repetidos")
    void testeNumeroRepetido() {
        assertThrows(IllegalArgumentException.class, () -> new Celular("88888888888"));
    }

    @Test
    @DisplayName("Não deve aceitar celular que não sejam válidos")
    void testeNUmeroQuaseValido() {
        assertThrows(IllegalArgumentException.class, () -> new Celular("1086398194"));
    }

}
