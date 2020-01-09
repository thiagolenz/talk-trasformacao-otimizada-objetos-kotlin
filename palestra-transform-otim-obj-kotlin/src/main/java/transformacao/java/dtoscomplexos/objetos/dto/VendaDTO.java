package transformacao.java.dtoscomplexos.objetos.dto;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.List;

public class VendaDTO {
    private LocalDateTime dataVenda;
    private ClienteDTO cliente;
    private BigDecimal valorTotal;
    private List<VendaItemDTO> itensVenda;

    public LocalDateTime getDataVenda() {
        return dataVenda;
    }

    public void setDataVenda(LocalDateTime dataVenda) {
        this.dataVenda = dataVenda;
    }

    public ClienteDTO getCliente() {
        return cliente;
    }

    public void setCliente(ClienteDTO cliente) {
        this.cliente = cliente;
    }

    public BigDecimal getValorTotal() {
        return valorTotal;
    }

    public void setValorTotal(BigDecimal valorTotal) {
        this.valorTotal = valorTotal;
    }

    public List<VendaItemDTO> getItensVenda() {
        return itensVenda;
    }

    public void setItensVenda(List<VendaItemDTO> itensVenda) {
        this.itensVenda = itensVenda;
    }
}
