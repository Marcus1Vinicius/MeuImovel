package com.MeuImovel.MeuImovelCRM;
import com.MeuImovel.MeuImovelCRM.model.Email;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class EmailTest {
    @Test
    @DisplayName("Não deve aceitar emails sem arroba com formato inválido!")
    void testEmailSemArroba(){
        assertThrows(IllegalArgumentException.class, () -> new Email("email.com"));
    }

    @Test
    @DisplayName("Não deve aceitar emails com formato inválido!")
    void testFormatoEmail(){
        assertThrows(IllegalArgumentException.class, () -> new Email("email@comf"));
    }

}
