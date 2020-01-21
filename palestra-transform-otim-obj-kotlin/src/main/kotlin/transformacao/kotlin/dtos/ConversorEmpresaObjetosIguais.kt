package transformacao.kotlin.dtos

import kotlin.reflect.full.memberProperties

fun Empresa.toEmpresaDTO() = with(::EmpresaDTO) {
    // obter propriedades da Empresa através de Reflexão
    // Map<String, KProperty>
    val mapProperEmpresa = Empresa::class.memberProperties.associateBy { it.name }

    // Map<KParameter, Any?>
    val mapaConstrutor = parameters.associateWith {
        mapProperEmpresa[it.name]?.get(this@toEmpresaDTO)
    }

    // callBy de KotlinReflections recebe o Mapa de Parametros e aplica
    // no construtor obtido no retorno do metodo através dos ::
    callBy(mapaConstrutor)
}


fun EmpresaDTO.toEmpresa() = with(::Empresa) {
    // obter propriedades da EmpresaDTO através de Reflexão
    val propertiesByName = EmpresaDTO::class.memberProperties.associateBy { it.name }

    // mapa de chave (váriavel) valor
    val mapaConstrutor = parameters.associateWith {
        propertiesByName[it.name]?.get(this@toEmpresa)
    }

    // callBy de KotlinReflections recebe um mapa e aplica
    // no construtor obtido no retorno do metodo através dos ::
    callBy(mapaConstrutor)
}




/**
    1 - Primeiro ponto é criado um Extension Function para a classe Empresa, um Lambda,
        with (::EmpresaDTO) passa a referencia do construtor padrão
    2 - O Retorno dessa extension function é um objeto do tipo EmpresaDTO,
    3 - O terceiro passo é obter um mapa de propriiedades do Objeto origem, no caso Empresa
    4 - É invocado o construtor padrão da class EmpresaDTO através da instrução callBy
    5 - callBy espera um mapa, chave valor de cada váriavel
        a) Parameteres vai pegar as variaveis declaradas no construtor de EmpresaDTO
        b) Para cada variavel ele vai associar ao mesmo nome do objeto origem
        c) Existindo a variavel ele obtem o valor dessa variavel do objeto referência
    6) caso uma variável obrigatória não exista, uma exception será lançada


    ..... MOSTRAR O EXEMPLO COMPLICADO .. DEPOIS MOSTRAR O CONTEÚDO ABAIXO COMO RESUMO

    7) A primeira vez que roda essa conversão ele perde um pouco de performance, mas isso só acontece na primeira conversão,
    depois ele acaba sendo bem rápido

    8) Esse mecanismo pode ser utilizado quando existe muita similaridade entre os objetos e existe pouca customização,
 geralmente quando os objetos são muito extensos. Nesse caso vale uma reflexão se a quantidade dos dados retornados não é demais,
 cabe aqui dar uma pesquisada no conteúdo de BFF (Back For Front)

 **/

