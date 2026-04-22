package marcelo.ufes.projeto01;

import java.util.ArrayList;
import java.util.List;

public class CalculadoraDeDescontoService {
    private List<IFormaDescontoTaxaEntrega> metodosDeDesconto;
    
    public CalculadoraDeDescontoService(){
        this.metodosDeDesconto = new ArrayList<>();
        metodosDeDesconto.add(new FormaDescontoTaxaPorBairro());
        metodosDeDesconto.add(new FormaDescontoTaxaPorTipoCliente());
        metodosDeDesconto.add(new FormaDescontoTipoItem());
        metodosDeDesconto.add(new FormaDescontoValorPedido(200.0));
    }
    
    public void CalcularDesconto(Pedido pedido){
        for(IFormaDescontoTaxaEntrega formaDesconto : metodosDeDesconto){
           if(formaDesconto.seAplica(pedido)){
                if(pedido.getDescontoConcedido()<= pedido.getTaxaEntrega()){
                    CupomDescontoEntrega auxCupom = formaDesconto.calcularDesconto(pedido);
                    double valorDesconto = auxCupom.getValorDesconto();
                    if(pedido.getDescontoConcedido() + valorDesconto > pedido.getTaxaEntrega()){
                        valorDesconto = pedido.getTaxaEntrega() - pedido.getDescontoConcedido();
                        auxCupom = new CupomDescontoEntrega(formaDesconto.toString() + "PARCIAL", valorDesconto);
                    }
                pedido.adicionarCupom(auxCupom);
                }
            }
        }
    }
    
    public void imprimirCupons(Pedido pedido){
        List<CupomDescontoEntrega> cupons = pedido.getCuponsDescontoEntrega();
        
        if(cupons.isEmpty()){
            System.out.println("VAZIO");
        }
        
        for(CupomDescontoEntrega cupom : cupons){
            System.out.println(cupom.toString());
            
        }
    }

}