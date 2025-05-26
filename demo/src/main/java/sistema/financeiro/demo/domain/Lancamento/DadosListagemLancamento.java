package sistema.financeiro.demo.domain.Lancamento;

import jakarta.validation.constraints.NotNull;

import java.math.BigDecimal;
import java.time.LocalDate;

public record DadosListagemLancamento(
        @NotNull
        Long id, String descricao,
        LocalDate dataVencimento,
        LocalDate dataPagamento,
        BigDecimal valor,
        String observacao,
        TipoLancamento tipoLancamento
) {

        public DadosListagemLancamento(Lancamento lancamento){
                this(lancamento.getId(),
                        lancamento.getDescricao(),
                        lancamento.getDataVencimento(),
                        lancamento.getDataPagamento(),
                        lancamento.getValor(),
                        lancamento.getObservacao(),
                        lancamento.getTipoLancamento());
        }
}
