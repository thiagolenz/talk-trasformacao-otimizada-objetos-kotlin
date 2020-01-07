package transformacao.java.dtos;

import java.time.LocalDateTime;

public class MainJavaConverterDTO {
    public static void main(String[] args) {

        Empresa empresa = createEmpresa();
        ConversorEmpresaDTOJava conversor = new ConversorEmpresaDTOJava();
        EmpresaDTO empresaDTO = conversor.toDTO(empresa);

        System.out.println(empresaDTO);
    }

    private static Empresa createEmpresa () {
        Empresa empresa = new Empresa();
        empresa.setCnpj("2123123123");
        empresa.setDataAbertura(LocalDateTime.now());
        empresa.setNomeFantasia("Palestra Kotlin");
        empresa.setRazaoSocial("Palestra Kotlin - LTDA");
        return empresa;
    }
}
