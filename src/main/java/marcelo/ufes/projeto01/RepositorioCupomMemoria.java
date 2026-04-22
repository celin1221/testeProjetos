package marcelo.ufes.projeto01;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Month;
import java.util.ArrayList;
import java.util.List;

public class RepositorioCupomMemoria {
    public static List<CupomDesconto> criarCupons(){
        List<CupomDesconto> lista = new ArrayList<>();
        lista.add(new CupomDesconto("DESC10", 10.0, LocalDateTime.of(2026, 4, 25,0,0), LocalDateTime.of(2026, 4, 27,23,59)));
        lista.add(new CupomDesconto("DESC20", 20.0, LocalDateTime.of(2026, 4, 25,0,0), LocalDateTime.of(2026, 4, 27,23,59)));
        return lista;
    }

}