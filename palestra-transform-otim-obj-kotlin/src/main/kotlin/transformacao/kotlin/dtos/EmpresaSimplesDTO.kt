package transformacao.kotlin.dtos

import java.time.LocalDateTime

data class EmpresaSimplesDTO(val nome: String,
                             val cnpj: String,
                             val dataAbertura: LocalDateTime)