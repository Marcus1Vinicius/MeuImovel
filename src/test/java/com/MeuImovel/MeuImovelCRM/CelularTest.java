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
    @DisplayName("Não deve aceitar os celulares que não sejam válidos")
    void testeNumeroQuaseValido() {
        assertThrows(IllegalArgumentException.class, () -> new Celular("1086398194"));
    }

    @Test
    @DisplayName("Deve aceitar os celulares que sejam válidos")
    void testeNumeroValido() {
        String celularValido = "84986398194";
        assertDoesNotThrow(() -> new Celular(celularValido));
    }

}
