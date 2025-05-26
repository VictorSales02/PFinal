package sistema.financeiro.demo.domain.Categoria;

public record DadosDetalhamentoCategoria(Long id, String nome) {

    public DadosDetalhamentoCategoria (Categoria categoria){
        this(categoria.getId(),
                categoria.getNome());
    }
}
