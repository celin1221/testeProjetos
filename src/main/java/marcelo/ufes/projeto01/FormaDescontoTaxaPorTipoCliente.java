package marcelo.ufes.projeto01;

import java.util.Map;

public class FormaDescontoTaxaPorTipoCliente implements IFormaDescontoTaxaEntrega{
    
    private Map<String,Double> descontosPorTipoCliente;
    private String tipoCliente;

    @Override
    public CupomDescontoEntrega calcularDesconto(Pedido pedido) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public boolean seAplica(Pedido pedido) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

}