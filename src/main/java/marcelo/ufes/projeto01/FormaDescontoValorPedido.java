package marcelo.ufes.projeto01;
public class FormaDescontoValorPedido implements IFormaDescontoTaxaEntrega {
    
    private double limiteValorPedido;
    private double VALOR_DESCONTO = 5.0;

    public FormaDescontoValorPedido(double limiteValorPedido) {
        this.limiteValorPedido = limiteValorPedido;
    }

    @Override
    public CupomDescontoEntrega calcularDesconto(Pedido pedido) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public boolean seAplica(Pedido pedido) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

}