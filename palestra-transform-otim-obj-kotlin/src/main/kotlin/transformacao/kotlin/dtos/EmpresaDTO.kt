package transformacao.kotlin.dtos

import java.time.LocalDateTime

data class EmpresaDTO(val cnpj: String,
                      val razaoSocial: String,
                      val nomeFantasia: String,
                      val dataAbertura: LocalDateTime)