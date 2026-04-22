package marcelo.ufes.projeto01;
public class FormaDescontoValorPedido implements IFormaDescontoTaxaEntrega {
    
    private double limiteValorPedido;
    private double VALOR_DESCONTO = 5.0;

    public FormaDescontoValorPedido(double limiteValorPedido) {
        this.limiteValorPedido = limiteValorPedido;
    }

    @Override
    public CupomDescontoEntrega calcularDesconto(Pedido pedido) {
        return new CupomDescontoEntrega("DescontoValorPedido", VALOR_DESCONTO);
    }

    @Override
    public boolean seAplica(Pedido pedido) {
        if(pedido.getDescontoConcedido() > 10.0){
            return false;
        }
        
        return true;
    }

}