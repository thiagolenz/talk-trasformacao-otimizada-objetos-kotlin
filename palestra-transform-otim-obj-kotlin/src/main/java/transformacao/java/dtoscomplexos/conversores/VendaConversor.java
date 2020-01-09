package transformacao.java.dtoscomplexos.conversores;

import transformacao.java.dtoscomplexos.objetos.dto.VendaDTO;
import transformacao.java.dtoscomplexos.objetos.dto.VendaItemDTO;
import transformacao.java.dtoscomplexos.objetos.model.Venda;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class VendaConversor {

    public VendaDTO toDTO (Venda venda) {
        VendaDTO vendaDTO = new VendaDTO();
        vendaDTO.setCliente(new ClienteConversor().toDTO(venda.getCliente()));
        vendaDTO.setDataVenda(venda.getDataVenda());
        vendaDTO.setValorTotal(venda.getValorTotal());
        vendaDTO.setItensVenda(convertItens(venda));
        return vendaDTO;
    }

    private List<VendaItemDTO> convertItens(Venda venda) {
        List<VendaItemDTO> itens = new ArrayList<>();
        if (venda.getItensVenda() != null) {
            ProdutoConversor produtoConversor = new ProdutoConversor();

            itens.addAll(venda.getItensVenda().stream().map(item -> {
                VendaItemDTO itemDTO = new VendaItemDTO();
                itemDTO.setProduto(produtoConversor.toDTO(item.getProduto()));
                itemDTO.setQuantidade(item.getQuantidade());
                itemDTO.setValorUnitario(item.getValorUnitario());
                itemDTO.setValorTotal(item.getValorTotal());
                return itemDTO;

            }).collect(Collectors.toList()));
        }
        return itens;
    }
}
