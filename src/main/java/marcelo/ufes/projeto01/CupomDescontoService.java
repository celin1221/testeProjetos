package marcelo.ufes.projeto01;

import java.time.LocalDateTime;
import java.util.List;

public class CupomDescontoService {
    private List<CupomDesconto> cuponsDisponiveis;

    public CupomDescontoService() {
        this.cuponsDisponiveis = RepositorioCupomMemoria.criarCupons();
    }
    
    public void addCupom(CupomDesconto cupom){
        cuponsDisponiveis.add(cupom);
    }
    
    public void removeCupom(String codCupom){
        cuponsDisponiveis.removeIf(cupom -> cupom.getCodCupom().equals(codCupom));
    }
    
    public void alterarCupom(String codCupom, double valorDesconto, LocalDateTime dataIni, LocalDateTime dataFim){
        for(CupomDesconto c : cuponsDisponiveis){
            if(c.getCodCupom().equals(codCupom)){
                c.setValorDesconto(valorDesconto);
                c.setDataInicio(dataIni);
                c.setDataFim(dataFim);
            }
        }
    }
    
    public CupomDesconto buscarPorCodigo(String codCupom){
        for (CupomDesconto cupom : cuponsDisponiveis) {
            if (cupom.getCodCupom().equals(codCupom)) {
                return cupom;
            }
        }
        return null;
    }
    
    public CupomDesconto obterCupomValido(String codCupom) {
        CupomDesconto cupom = buscarPorCodigo(codCupom);
        LocalDateTime agora = LocalDateTime.now();

        if (cupom == null) {
            return null;
        }
        
        if (agora.isBefore(cupom.getDataInicio()) || 
            agora.isAfter(cupom.getDataFim())) {
            return null;
        }

        return cupom;
    }
}