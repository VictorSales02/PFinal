package sistema.financeiro.demo.domain.Pessoa;

import jakarta.validation.Valid;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import sistema.financeiro.demo.domain.Lancamento.TipoLancamento;
import sistema.financeiro.demo.domain.endereco.DadosEndereco;

public record DadosCadastroPessoa(

        @NotBlank
        String nome,

        @NotNull @Valid DadosEndereco endereco) {
}

