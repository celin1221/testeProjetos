package marcelo.ufes.projeto01;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class CupomDesconto {
    private String codCupom;
    private double valorDesconto;
    private LocalDateTime dataInicio, dataFim;

    public CupomDesconto(String codCupom, double valorDesconto, LocalDateTime dataInicio, LocalDateTime dataFim) {
        //implementar validacoes
        this.codCupom = codCupom;
        this.valorDesconto = valorDesconto;
        this.dataInicio = dataInicio;
        this.dataFim = dataFim;
    }

    public String getCodCupom() {
        return codCupom;
    }

    public double getValorDesconto() {
        return valorDesconto;
    }

    public LocalDateTime getDataInicio() {
        return dataInicio;
    }

    public LocalDateTime getDataFim() {
        return dataFim;
    }

    public void setValorDesconto(double valorDesconto) {
        this.valorDesconto = valorDesconto;
    }

    public void setDataInicio(LocalDateTime dataInicio) {
        this.dataInicio = dataInicio;
    }

    public void setDataFim(LocalDateTime dataFim) {
        this.dataFim = dataFim;
    }

}