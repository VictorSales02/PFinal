package sistema.financeiro.demo.domain.Lancamento;

import jakarta.validation.constraints.NotNull;

import java.math.BigDecimal;
import java.time.LocalDate;

public record DadosDetalhamentoLancamento(
        @NotNull
        Long id,
        String descricao,
        LocalDate dataVencimento,
        LocalDate dataPagamento,
        BigDecimal valor,
        String observacao,
    TipoLancamento tipo
) {
    public DadosDetalhamentoLancamento (Lancamento Lancamento){
        this(Lancamento.getId(),
                Lancamento.getDescricao(),
                Lancamento.getData_vencimento(),
                Lancamento.getData_pagamento(),
                Lancamento.getValor(),
                Lancamento.getObservacao(),
                Lancamento.getTipo());
    }
}
