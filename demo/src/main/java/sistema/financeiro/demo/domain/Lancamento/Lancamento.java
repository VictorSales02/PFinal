package sistema.financeiro.demo.domain.Lancamento;

import jakarta.persistence.*;
import lombok.*;
import sistema.financeiro.demo.domain.Categoria.Categoria;
import sistema.financeiro.demo.domain.Pessoa.Pessoa;

import java.math.BigDecimal;
import java.time.LocalDate;

@Table(name = "lancamentos")
@Entity(name = "lancamento")
@Data
@Getter
@AllArgsConstructor
@EqualsAndHashCode(of = "id")
public class Lancamento {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String descricao;
    private LocalDate dataVencimento;
    private LocalDate dataPagamento;
    private BigDecimal valor;
    private String observacao;
    private Boolean ativo;

    @Enumerated(EnumType.STRING)
    private TipoLancamento tipoLancamento;

    @ManyToOne
    @JoinColumn(name = "id_pessoa")
    private Pessoa pessoa;

    @ManyToOne
    @JoinColumn(name = "id_categoria")
    private Categoria categoria;

    public Lancamento() {}

    public Long getId() {
        return id;
    }

    public String getDescricao() {
        return descricao;
    }

    public LocalDate getDataVencimento() {
        return dataVencimento;
    }

    public LocalDate getDataPagamento() {
        return dataPagamento;
    }

    public BigDecimal getValor() {
        return valor;
    }

    public String getObservacao() {
        return observacao;
    }

    public TipoLancamento getTipoLancamento() {
        return tipoLancamento;
    }

    public Boolean getAtivo() {
        return ativo;
    }

    public Lancamento(DadosCadastroLancamento dados){
        this.descricao = dados.descricao();
        this.dataVencimento = dados.dataVencimento();
        this.dataPagamento = dados.dataPagamento();
        this.valor = dados.valor();
        this.observacao = dados.observacao();
        this.tipoLancamento = dados.tipoLancamento();
    }

    public void atualizarinformacoes(DadosAtualizacaoLancamento dados) {
        if (dados.descricao() != null) {
            this.descricao = dados.descricao();
        }
        if (dados.dataPagamento() != null) {
            this.dataPagamento = dados.dataPagamento();
        }
        if (dados.dataVencimento() != null) {
            this.dataVencimento = dados.dataVencimento();
        }

        if (dados.valor() != null) {
            this.valor = dados.valor();
        }
        if (dados.descricao() != null) {
            this.observacao = dados.descricao();
        }

    }


    public void excluir() {
        this.ativo = false;
    }
}
