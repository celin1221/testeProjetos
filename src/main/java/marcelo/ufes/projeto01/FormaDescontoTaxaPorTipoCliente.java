package marcelo.ufes.projeto01;

import java.util.HashMap;
import java.util.Map;

public class FormaDescontoTaxaPorTipoCliente implements IFormaDescontoTaxaEntrega{
    
    private Map<String,Double> descontosPorTipoCliente;
    private String tipoCliente;
    
    public FormaDescontoTaxaPorTipoCliente(){
        
        this.descontosPorTipoCliente = new HashMap<>();
        this.descontosPorTipoCliente.put("Bronze", 1.0);
        this.descontosPorTipoCliente.put("Prata", 2.0);
        this.descontosPorTipoCliente.put("Ouro", 3.0);
        
        
    }

    @Override
    public CupomDescontoEntrega calcularDesconto(Pedido pedido) {
        double desconto = descontosPorTipoCliente.get(tipoCliente);
        return new CupomDescontoEntrega("DescontoTaxaPorTipoCliente", desconto);
    }

    @Override
    public boolean seAplica(Pedido pedido) {
        this.tipoCliente = pedido.getCliente().getTipo();
        for(String tipo : descontosPorTipoCliente.keySet()){
            if(tipoCliente.equals(tipo)){
                return true;
            }
        }
        return false;
    }

}