package transformacao.kotlin.dtos

import kotlin.reflect.full.memberProperties

fun Empresa.toEmpresaSimplesDTO() = with(::EmpresaSimplesDTO) {
    val propertiesByName = Empresa::class.memberProperties.associateBy { it.name }
    callBy(parameters.associateWith {
        when (it.name) {
            EmpresaSimplesDTO::nome.name -> "$razaoSocial ($nomeFantasia)"
            else -> propertiesByName[it.name]?.get(this@toEmpresaSimplesDTO)
        }
    })
}