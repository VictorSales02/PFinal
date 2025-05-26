package sistema.financeiro.demo.domain.Categoria;

import jakarta.validation.constraints.NotNull;

public record DadosAtualizacaoCategoria(@NotNull
                                        Long id,
                                        String nome) {

}
