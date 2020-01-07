package transformacao.kotlin.dtoscomplexos.beans

import java.math.BigDecimal
import java.time.LocalDateTime

data class VendaDTO(
        val numero: Int,
        val cliente: String,
        val endereco: String,
        val valorTotal: BigDecimal,
        val dataVenda: LocalDateTime,
        val itens: List<VendaItemDTO>
)

data class VendaItemDTO(
        val quantidade: BigDecimal,
        val valorUnitario: BigDecimal,
        val valorTotal: BigDecimal,
        val produto: ProdutoDTO
)

data class ProdutoDTO(
        val nome: String,
        val valorUnitario:BigDecimal
)