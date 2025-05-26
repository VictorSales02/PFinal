package sistema.financeiro.demo.domain.Pessoa;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import sistema.financeiro.demo.domain.Lancamento.Lancamento;
import sistema.financeiro.demo.domain.endereco.Endereco;

import java.util.ArrayList;
import java.util.List;

@Table(name = "pessoas")
@Entity(name = "pessoa")
@Getter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(of = "id")
public class Pessoa {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nome;
    private Boolean ativo;

    @Embedded
    private Endereco endereco;

    @OneToMany(mappedBy = "pessoa")
    private List<Lancamento> lancamentos = new ArrayList<>();

    public Long getId() {
        return id;
    }



    public String getNome() {
        return nome;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public Pessoa(){}

    public Pessoa(DadosCadastroPessoa dados) {
        this.ativo = true;
        this.nome = dados.nome();
        this.endereco = new Endereco(dados.endereco());
    }

    public void atualizarinformacoes(DadosAtualizacaoPessoa dados) {
        if (dados.nome() != null) {
            this.nome = dados.nome();
        }
        if (dados.endereco() != null) {
            this.endereco.atualizarinformacoes(dados.endereco());
        }

    }


    public void excluir() {
        this.ativo = false;
    }
}
