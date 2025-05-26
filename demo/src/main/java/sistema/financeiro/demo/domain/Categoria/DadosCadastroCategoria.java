package sistema.financeiro.demo.domain.Categoria;

import jakarta.validation.constraints.NotBlank;

public record DadosCadastroCategoria(

        @NotBlank
        String nome) {
}
