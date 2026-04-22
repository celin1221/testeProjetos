package marcelo.ufes.projeto01;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class CupomDescontoService {
    private List<CupomDesconto> cuponsDisponiveis;

    public CupomDescontoService() {
        cuponsDisponiveis = new ArrayList<>();
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
}