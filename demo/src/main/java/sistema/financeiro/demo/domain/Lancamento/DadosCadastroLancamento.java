package sistema.financeiro.demo.domain.Lancamento;

import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;
import sistema.financeiro.demo.domain.Categoria.Categoria;
import sistema.financeiro.demo.domain.Pessoa.Pessoa;

import java.math.BigDecimal;
import java.time.LocalDate;

public record DadosCadastroLancamento(

        String descricao,
        LocalDate dataVencimento,
        LocalDate dataPagamento,
        BigDecimal valor,
        String observacao,
        TipoLancamento tipo,
        @NotNull @Valid Pessoa pessoa,
        @NotNull @Valid Categoria categoria

) { }
