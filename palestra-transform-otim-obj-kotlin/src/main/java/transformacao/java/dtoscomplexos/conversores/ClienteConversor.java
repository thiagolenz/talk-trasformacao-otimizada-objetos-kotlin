package transformacao.java.dtoscomplexos.conversores;

import transformacao.java.dtoscomplexos.objetos.dto.ClienteDTO;
import transformacao.java.dtoscomplexos.objetos.model.Cliente;

public class ClienteConversor {
    public ClienteDTO toDTO (Cliente cliente) {
        ClienteDTO clienteDTO = new ClienteDTO();
        clienteDTO.setNome(cliente.getNome());
        clienteDTO.setDocumento(cliente.getDocumento());
        clienteDTO.setEndereco(cliente.getEndereco());
        return clienteDTO;
    }
}
