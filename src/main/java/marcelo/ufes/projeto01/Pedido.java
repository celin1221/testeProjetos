package marcelo.ufes.projeto01;
import java.time.LocalDate;
import java.util.Collection;
import java.util.*;

public class Pedido {
    private double taxaEntrega = 10.0;
    private Cliente cliente;
    private List<Item> itens;
    private CupomDesconto cupomDescontoAtivo;
    private double porcentagemDesconto;
    
    
    public Pedido(LocalDate data, Cliente cliente){
        this.cliente = cliente;
        this.itens = new ArrayList<>();
        this.cupomDescontoAtivo = null;
        
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
    
    public double calcularValorFinal() {
        if (porcentagemDesconto > 0) {
            return getValorPedido() * (1 - porcentagemDesconto / 100);
        }
        return getValorPedido();
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
        
    }
    
    public double getDescontoConcedido(){
        return 0;
    }

    public CupomDesconto getCupomDescontoAtivo() {
        return cupomDescontoAtivo;
    }

    public double getPorcentagemDesconto() {
        return porcentagemDesconto;
    }

    public void setCupomDescontoAtivo(CupomDesconto cupomDescontoAtivo) {
        this.cupomDescontoAtivo = cupomDescontoAtivo;
    }

    public void setPorcentagemDesconto(double porcentagemDesconto) {
        this.porcentagemDesconto = porcentagemDesconto;
    }
    
    
    @Override
    public String toString(){
        return ("Pedido de " + cliente.getNome() + ".");
    }
    
    
}
