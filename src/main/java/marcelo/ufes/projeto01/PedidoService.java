package marcelo.ufes.projeto01;

public class PedidoService {
    private CupomDescontoService cupomService;

    public PedidoService(CupomDescontoService cupomService) {
        this.cupomService = cupomService;
    }
    
    public String aplicarCupom(Pedido pedido, String codCupom){
        CupomDesconto cupom = cupomService.obterCupomValido(codCupom);
        if(cupom == null){
            return "Cupom invalido";
        }
        
        if (pedido.getCupomDescontoAtivo() != null) {
            if (cupom.getValorDesconto() <= pedido.getPorcentagemDesconto()) {
                return "Cupom não possui desconto maior que o já aplicado";
            }
        }
        
        pedido.setCupomDescontoAtivo(cupom);
        pedido.setPorcentagemDesconto(cupom.getValorDesconto());

        return "Cupom aplicado com sucesso";
    }
}
