package transformacao.kotlin.dtoscomplexos.conversor

import transformacao.kotlin.dtoscomplexos.beans.Cliente
import transformacao.kotlin.dtoscomplexos.beans.Produto
import transformacao.kotlin.dtoscomplexos.beans.Venda
import transformacao.kotlin.dtoscomplexos.beans.VendaItem
import java.math.BigDecimal
import java.time.LocalDateTime

fun main() {
    val venda = Venda(
            valorTotal = BigDecimal(1000),
            cliente = Cliente(nome = "Fulano", documento = "99999999", endereco = "Av 7 de Setembro"),
            dataVenda = LocalDateTime.now(),
            numero = 1,
            itens = listOf(
                    VendaItem(quantidade = BigDecimal.ONE,
                            valorUnitario = BigDecimal(1000),
                            valorTotal = BigDecimal(1000),
                            produto = Produto(nome = "Monitor Dell",
                                    valorUnitario = BigDecimal(1000)))
            )
    )
    var conversionStart = System.currentTimeMillis()
    println(venda.toVendaDTO())
    println(System.currentTimeMillis() - conversionStart)

    conversionStart = System.currentTimeMillis()
    println(venda.toVendaDTO())
    println(System.currentTimeMillis() - conversionStart)

    Thread.sleep(50000)

    conversionStart = System.currentTimeMillis()
    println(venda.toVendaDTO())
    println(System.currentTimeMillis() - conversionStart)
}