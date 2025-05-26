package sistema.financeiro.demo.domain.Pessoa;

public record DadosListagemPessoa(Long id, String nome) {

    public DadosListagemPessoa(Pessoa pessoa) {
        this(pessoa.getId(), pessoa.getNome());
    }

}
