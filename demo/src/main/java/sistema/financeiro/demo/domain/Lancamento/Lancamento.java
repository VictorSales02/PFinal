package sistema.financeiro.demo.domain.Lancamento;

import jakarta.persistence.*;
import lombok.*;
import sistema.financeiro.demo.domain.Categoria.Categoria;
import sistema.financeiro.demo.domain.Pessoa.Pessoa;

import java.math.BigDecimal;
import java.time.LocalDate;

@Table(name = "lancamentos")
@Entity(name = "lancamento")
@Getter
@AllArgsConstructor
public class Lancamento {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String descricao;
    private LocalDate data_vencimento;
    private LocalDate data_pagamento;
    private BigDecimal valor;
    private String observacao;


    @Enumerated(EnumType.STRING)
    private TipoLancamento tipo;

    @ManyToOne
    @JoinColumn(name = "id_pessoa")
    private Pessoa pessoa;

    @ManyToOne
    @JoinColumn(name = "id_categoria")
    private Categoria categoria;

    private Boolean ativo;

    public Long getId() {
        return id;
    }

    public String getDescricao() {
        return descricao;
    }

    public LocalDate getData_vencimento() {
        return data_vencimento;
    }

    public LocalDate getData_pagamento() {
        return data_pagamento;
    }

    public BigDecimal getValor() {
        return valor;
    }

    public String getObservacao() {
        return observacao;
    }

    public TipoLancamento getTipo() {
        return tipo;
    }

    public Lancamento() {}

    public Lancamento(DadosCadastroLancamento dados){
        this.descricao = dados.descricao();
        this.data_vencimento = dados.dataVencimento();
        this.data_pagamento = dados.dataPagamento();
        this.valor = dados.valor();
        this.observacao = dados.observacao();
        this.tipo = dados.tipo();
        this.pessoa = dados.pessoa();
        this.categoria = dados.categoria();
        this.ativo = true;
    }

    public void atualizarinformacoes(DadosAtualizacaoLancamento dados) {
        if (dados.descricao() != null) {
            this.descricao = dados.descricao();
        }
        if (dados.dataPagamento() != null) {
            this.data_pagamento = dados.dataPagamento();
        }
        if (dados.dataVencimento() != null) {
            this.data_vencimento = dados.dataVencimento();
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
