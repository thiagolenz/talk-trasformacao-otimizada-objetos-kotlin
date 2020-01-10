package transformacao.kotlin.dtosimples

import java.time.LocalDateTime

fun Empresa.toDTO () = EmpresaDTO(cnpj = cnpj,
        razaoSocial = razaoSocial,
        nomeFantasia = nomeFantasia,
        dataAbertura = dataAbertura)


fun main() {
    val empresa = Empresa(cnpj = "0000000000",
            razaoSocial = "Palestra Kotlin LTDA",
            nomeFantasia = "Palestra Kotlin",
            dataAbertura = LocalDateTime.now())
    println(empresa.toDTO())
}

