package transformacao.kotlin.dtosimples

import java.time.LocalDateTime


fun main() {
    val empresa = Empresa(cnpj = "0000000000",
            razaoSocial = "Palestra Kotlin LTDA",
            nomeFantasia = "Palestra Kotlin",
            dataAbertura = LocalDateTime.now(),
            municipio = "Curitiba",
            nomeResponsavel = "Fulano Silva")
    println(empresa.toDTO())
}

fun Empresa.toDTO () = EmpresaDTO(cnpj = cnpj,
        razaoSocial = razaoSocial,
        nomeFantasia = nomeFantasia,
        dataAbertura = dataAbertura,
        nomeResponsavel = nomeResponsavel,
        municipio = municipio)





