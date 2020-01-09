package transformacao.kotlin.dtoscomplexos.beans

import java.math.BigDecimal
import java.time.LocalDateTime

data class Venda(
        val numero: Int,
        val cliente: Cliente,
        val valorTotal: BigDecimal,
        val dataVenda: LocalDateTime,
        val itens: List<VendaItem>)

data class VendaItem(
        val quantidade: BigDecimal,
        val valorUnitario: BigDecimal,
        val valorTotal: BigDecimal,
        val produto: Produto
)