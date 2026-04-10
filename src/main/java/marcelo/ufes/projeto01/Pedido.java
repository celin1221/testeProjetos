package marcelo.ufes.projeto01;
import java.time.LocalDate;
import java.util.List;

public class Pedido {
    private double taxaEntrega = 10.0;
    Cliente cliente;
    List<Item> itens;
    List<CupomDescontoEntrega> cuponsDescontoEntrega;
    
    public Pedido(LocalDate data, Cliente cliente){
        this.cliente = cliente;
    }
    
    public void adicionarItem(Item item){
        
    }
    
    public double getValorPedido(){
        //implementar
        return 0;
    }
    
    public Cliente getCliente(){
        return this.cliente;
    }
    
    public List<Item> getItens(){
        return this.itens;
    }
    
    public double getTaxaEntrega(){
        return this.taxaEntrega;
    }
    
    public void aplicarDesconto(IFormaDescontoTaxaEntrega desconto){
        
    }
    
    public double getDescontoConcedido(){
        //implementar
        return 0;
    }
    
    public List<CupomDescontoEntrega> getCuponsDescontoEntrega(){
        //implementar
        return null;
    }
    
    @Override
    public String toString(){
        return ("Pedido de " + cliente.getNome() + ".");
    }
    
    
}
