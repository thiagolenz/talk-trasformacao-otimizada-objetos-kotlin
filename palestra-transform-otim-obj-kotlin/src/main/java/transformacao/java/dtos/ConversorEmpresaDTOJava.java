package transformacao.java.dtos;

public class ConversorEmpresaDTOJava {

    public EmpresaDTO toDTO (Empresa empresa) {
        EmpresaDTO empresaDTO = new EmpresaDTO();

        empresaDTO.setCnpj(empresa.getCnpj());
        empresaDTO.setDataAbertura(empresa.getDataAbertura());
        empresaDTO.setNomeFantasia(empresa.getNomeFantasia());
        empresaDTO.setRazaoSocial(empresa.getRazaoSocial());
        //... continua se tiver mais campos

        return empresaDTO;
    }
}



