package sistema.financeiro.demo.domain.Pessoa;

import jakarta.validation.constraints.NotNull;
import sistema.financeiro.demo.domain.endereco.DadosEndereco;


public record DadosAtualizacaoPessoa(

        String nome,
        DadosEndereco endereco) {

}
