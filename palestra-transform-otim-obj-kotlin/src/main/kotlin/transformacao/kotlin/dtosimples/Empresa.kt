package transformacao.kotlin.dtosimples

import java.time.LocalDateTime

data class Empresa(val cnpj: String,
                   val razaoSocial: String,
                   val nomeFantasia: String,
                   val dataAbertura: LocalDateTime,
                   val nomeResponsavel : String,
                   val municipio: String)