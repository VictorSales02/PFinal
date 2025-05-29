package sistema.financeiro.demo.domain.Lancamento;

import jakarta.validation.constraints.NotNull;

import java.math.BigDecimal;
import java.time.LocalDate;

public record DadosAtualizacaoLancamento(
        String descricao,
         LocalDate dataVencimento,
         LocalDate dataPagamento,
         BigDecimal valor,
         String observacao,
        TipoLancamento tipoLancamento) {
}
