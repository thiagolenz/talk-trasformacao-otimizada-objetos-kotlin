package transformacao.kotlin.dtoscomplexos.conversor

import transformacao.kotlin.dtoscomplexos.beans.*
import kotlin.reflect.full.memberProperties

fun Venda.toVendaDTO() = with(::VendaDTO) {
    val propertiesByName = Venda::class.memberProperties.associateBy { it.name }
    callBy(parameters.associateWith {
        when (it.name) {
            VendaDTO::cliente.name -> "${cliente.nome} - (${cliente.documento})"
            VendaDTO::endereco.name -> cliente.endereco
            VendaDTO::itens.name -> itens.map { item -> item.toVendaItemDTO() }
            else -> propertiesByName[it.name]?.get(this@toVendaDTO)
        }
    })
}

fun VendaItem.toVendaItemDTO() = with(::VendaItemDTO) {
    val propertiesByName = VendaItem::class.memberProperties.associateBy { it.name }
    callBy(parameters.associateWith {
        when (it.name) {
            VendaItemDTO::produto.name -> produto.toProdutoDTO()
            else -> propertiesByName[it.name]?.get(this@toVendaItemDTO)
        }
    })
}

fun Produto.toProdutoDTO() = with(::ProdutoDTO) {
    val propertiesByName = Produto::class.memberProperties.associateBy { it.name }
    callBy(parameters.associateWith {
        propertiesByName[it.name]?.get(this@toProdutoDTO)
    })
}

