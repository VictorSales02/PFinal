package sistema.financeiro.demo.domain.Pessoa;

import jakarta.validation.constraints.NotNull;
import sistema.financeiro.demo.domain.endereco.DadosEndereco;


public record DadosAtualizacaoPessoa(

        @NotNull
        Long id,
        String nome,
        DadosEndereco endereco) {

}
