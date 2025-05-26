package sistema.financeiro.demo.domain.Pessoa;
import sistema.financeiro.demo.domain.endereco.Endereco;

public record DadosDetalhamentoPessoa(Long id, String nome,
                                      Endereco endereco) {
    public DadosDetalhamentoPessoa (Pessoa pessoa){
        this(pessoa.getId(),
                pessoa.getNome(),
                pessoa.getEndereco());
    }
}
