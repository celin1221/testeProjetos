package marcelo.ufes.projeto01;
import java.time.LocalDate;
import java.util.Collection;
import java.util.*;

public class Pedido {
    private double taxaEntrega = 10.0;
    Cliente cliente;
    List<Item> itens;
    List<CupomDescontoEntrega> cuponsDescontoEntrega;
    
    public Pedido(LocalDate data, Cliente cliente){
        this.cliente = cliente;
        this.itens = new ArrayList<>();
        this.cuponsDescontoEntrega = new ArrayList<>();
    }
    
    public void adicionarItem(Item item){
        this.itens.add(item);
    }
    
    public double getValorPedido(){
        if(this.itens.isEmpty()){
            throw new NullPointerException("A lista de pedidos está vazia!");
        }
        
        double valorPedido = 0;
        for(Item item : itens){
            valorPedido+=item.getValorTotal();
        }
        return valorPedido;
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
    
    public void adicionarCupom(CupomDescontoEntrega cupom){
        cuponsDescontoEntrega.add(cupom);
    }
    
    public double getDescontoConcedido(){
        double valorTotalDesconto = 0;
        for(CupomDescontoEntrega cupom : cuponsDescontoEntrega){
            double valorDesconto = cupom.getValorDesconto();
            valorTotalDesconto+=valorDesconto;
        }
        return valorTotalDesconto;
    }
    
    public List<CupomDescontoEntrega> getCuponsDescontoEntrega(){
        return Collections.unmodifiableList(cuponsDescontoEntrega);
    }
    
    @Override
    public String toString(){
        return ("Pedido de " + cliente.getNome() + ".");
    }
    
    
}
