package com.MeuImovel.MeuImovelCRM.dto;

import com.MeuImovel.MeuImovelCRM.model.Celular;
import com.MeuImovel.MeuImovelCRM.model.Email;

public record CorretorResponseDTO(
        Long id,
        String nome,
        String creci,
        String foto,
        String emailCorretor,
        String celularCorretor

) {
}
