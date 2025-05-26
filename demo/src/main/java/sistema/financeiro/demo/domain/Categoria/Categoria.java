package sistema.financeiro.demo.domain.Categoria;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import sistema.financeiro.demo.domain.Lancamento.Lancamento;

import java.util.ArrayList;
import java.util.List;

@Table(name = "categorias")
@Entity(name = "categoria")
@Getter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(of = "id")
public class Categoria {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private Long id;
    private String nome;
    private boolean ativo;

    @OneToMany(mappedBy = "categoria")
    private List<Lancamento> lancamentos = new ArrayList<>();

    public Categoria(DadosCadastroCategoria dados){
        this.nome = dados.nome();
        this.ativo = true;
    }

    public void atualizarinformacoes(DadosAtualizacaoCategoria dados) {
        if (dados.nome() != null) {
            this.nome = dados.nome();
            System.out.println("this.nome" + this.nome);
        }
    }


    public void excluir() {
        this.ativo = false;
    }
}
