package transformacao.kotlin.dtos

import kotlin.reflect.full.memberProperties

fun Empresa.toEmpresaDTO() = with(::EmpresaDTO) {
    val propertiesByName = Empresa::class.memberProperties.associateBy { it.name }
    callBy(parameters.associateWith {
        propertiesByName[it.name]?.get(this@toEmpresaDTO)
    })
}
