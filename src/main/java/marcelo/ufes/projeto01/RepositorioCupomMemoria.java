package marcelo.ufes.projeto01;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class RepositorioCupomMemoria {
    public static List<CupomDesconto> criarCupons(){
        List<CupomDesconto> lista = new ArrayList<>();
        lista.add(new CupomDesconto("DESC10",10,LocalDateTime.of(2026, 4, 25, 0, 0),LocalDateTime.of(2026, 4, 27, 23, 59)));

        lista.add(new CupomDesconto("DESC20",20,LocalDateTime.of(2026, 5, 1, 0, 0),LocalDateTime.of(2026, 5, 5, 23, 59)));

        lista.add(new CupomDesconto("DESC30",30,LocalDateTime.of(2026, 4, 23, 0, 0),LocalDateTime.of(2026, 4, 24, 23, 59)));

        lista.add(new CupomDesconto("DIAPAI12",12,LocalDateTime.of(2026, 5, 9, 0, 0),LocalDateTime.of(2026, 5, 10, 23, 59)));
        
        lista.add(new CupomDesconto("DIAMAE12",12,LocalDateTime.of(2026, 5, 10, 0, 0),LocalDateTime.of(2026, 5, 12, 23, 59)));

        lista.add(new CupomDesconto("NATAL10",10,LocalDateTime.of(2026, 4, 20, 0, 0),LocalDateTime.of(2026, 4, 26, 23, 59)));

        lista.add(new CupomDesconto("FESTA15",15,LocalDateTime.of(2026, 4, 30, 18, 0),LocalDateTime.of(2026, 5, 1, 6, 0)));

        lista.add(new CupomDesconto("BLACK50",50,LocalDateTime.of(2026, 4, 28, 0, 0),LocalDateTime.of(2026, 4, 28, 23, 59)));
        
        return lista;
    }
}