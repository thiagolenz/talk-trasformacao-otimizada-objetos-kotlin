package transformacao.kotlin.dtos

import java.time.LocalDateTime

fun main() {
    val empresa = Empresa (cnpj = "123123123123",
            razaoSocial = "Palestra Kotlin Conf - LTDA", nomeFantasia = "Kotlin Conf",
            dataAbertura = LocalDateTime.now())

    val empresaDTO = empresa.toEmpresaDTO()
    println(empresaDTO)

    val empresaSimplesDTO = empresa.toEmpresaSimplesDTO()
    println(empresaSimplesDTO)

    println(empresaDTO.toEmpresa())
}