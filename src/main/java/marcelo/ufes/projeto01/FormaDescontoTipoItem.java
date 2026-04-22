package marcelo.ufes.projeto01;
import java.util.HashMap;
import java.util.Map;
public class FormaDescontoTipoItem implements IFormaDescontoTaxaEntrega{
    
    private Map<String, Double> descontorPorTipoItem;
    
    public FormaDescontoTipoItem(){
        
        this.descontorPorTipoItem = new HashMap<>();
        this.descontorPorTipoItem.put("Alimentacao", 5.0);
        this.descontorPorTipoItem.put("Educacao", 2.0);
        this.descontorPorTipoItem.put("Lazer", 1.5);
        
        
    }

    @Override
    public CupomDescontoEntrega calcularDesconto(Pedido pedido) {
        //
        double desconto = 0.0;
        for (Item item : pedido.getItens()){
            for(String tipo : this.descontorPorTipoItem.keySet()){
                if(item.getTipo().equals(tipo)){
                    desconto+=descontorPorTipoItem.get(tipo);
                }
            }
        }
        CupomDescontoEntrega cupom = new CupomDescontoEntrega("DescontoTipoItem", desconto);
        return cupom;
    }

    @Override
    public boolean seAplica(Pedido pedido) {
        for (String tipo : this.descontorPorTipoItem.keySet()){
            for(Item item : pedido.getItens()){
                if(item.getTipo().equals(tipo)){
                    return true;
                }
            }
        }
        return false;
    }

}