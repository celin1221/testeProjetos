package marcelo.ufes.projeto01;
public class FormaDescontoTaxaPorBairro implements IFormaDescontoTaxaEntrega{

    private String bairroCliente;
    
    @Override
    public CupomDescontoEntrega calcularDesconto(Pedido pedido) {
        double desconto = 0;
        if(bairroCliente.equals("Centro")){
            desconto = 2.0;
        }
        else if(bairroCliente.equals("Bela Vista")){
            desconto = 3.0;
        }
        else if (bairroCliente.equals("Cidade Maravilhosa")) {
            desconto = 1.5;
        }
        
        return new CupomDescontoEntrega("DescontoTaxaPorBairro", desconto);
    }

    @Override
    public boolean seAplica(Pedido pedido) {
        this.bairroCliente = pedido.getCliente().getBairro();
        if(bairroCliente.equals("Centro") || bairroCliente.equals("Bela Vista") || bairroCliente.equals("Cidade Maravilhosa")){
            return true;
        }
        return false;
    }

}