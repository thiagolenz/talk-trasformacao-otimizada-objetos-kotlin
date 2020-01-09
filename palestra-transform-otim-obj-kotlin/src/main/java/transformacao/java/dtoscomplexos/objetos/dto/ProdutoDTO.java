package transformacao.java.dtoscomplexos.objetos.dto;

import java.math.BigDecimal;

public class ProdutoDTO {
    private String descricao;
    private BigDecimal valorUnitario;

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public BigDecimal getValorUnitario() {
        return valorUnitario;
    }

    public void setValorUnitario(BigDecimal valorUnitario) {
        this.valorUnitario = valorUnitario;
    }
}
