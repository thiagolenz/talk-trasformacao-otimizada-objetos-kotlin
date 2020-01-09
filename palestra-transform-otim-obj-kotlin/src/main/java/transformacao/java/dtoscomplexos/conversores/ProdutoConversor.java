package transformacao.java.dtoscomplexos.conversores;

import transformacao.java.dtoscomplexos.objetos.dto.ProdutoDTO;
import transformacao.java.dtoscomplexos.objetos.model.Produto;

public class ProdutoConversor {
    public ProdutoDTO toDTO (Produto produto) {
        ProdutoDTO produtoDTO = new ProdutoDTO();
        produtoDTO.setDescricao(produto.getDescricao());
        produtoDTO.setValorUnitario(produto.getValorUnitario());
        return produtoDTO;
    }
}
