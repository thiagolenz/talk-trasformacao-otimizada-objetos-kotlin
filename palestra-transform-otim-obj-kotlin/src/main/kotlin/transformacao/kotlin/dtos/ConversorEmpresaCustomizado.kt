package transformacao.kotlin.dtos

import kotlin.reflect.full.memberProperties

fun Empresa.toEmpresaSimplesDTO() = with(::EmpresaSimplesDTO) {
    val propertiesByName = Empresa::class.memberProperties.associateBy { it.name }
    callBy(parameters.associateWith { parameter ->
        when (parameter.name) {
            EmpresaSimplesDTO::nome.name -> "$razaoSocial ($nomeFantasia)"
            else -> propertiesByName[parameter.name]?.get(this@toEmpresaSimplesDTO)
        }
    })
}