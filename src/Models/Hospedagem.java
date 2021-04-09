package Models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Hospedagem {
    @Id
    @GeneratedValue()
    private int nrDeHospedagem;
    private String dataEntrada;
    private String dataSaida;
    private int nrDeHospedes;
    
    @OneToOne
    private Hospede hospede;
    
    @OneToOne
    private Reservas reserva;
    
    @OneToOne
    private Quarto quarto;

    public int getNrDeHospedagem() {
        return nrDeHospedagem;
    }

    public void setNrDeHospedagem(int nrDeHospedagem) {
        this.nrDeHospedagem = nrDeHospedagem;
    }

    public String getDataEntrada() {
        return dataEntrada;
    }

    public void setDataEntrada(String dataEntrada) {
        this.dataEntrada = dataEntrada;
    }

    public String getDataSaida() {
        return dataSaida;
    }

    public void setDataSaida(String dataSaida) {
        this.dataSaida = dataSaida;
    }

    public int getNrDeHospedes() {
        return nrDeHospedes;
    }

    public void setNrDeHospedes(int nrDeHospedes) {
        this.nrDeHospedes = nrDeHospedes;
    }

    public Hospede getHospede() {
        return hospede;
    }

    public void setHospede(Hospede hospede) {
        this.hospede = hospede;
    }

    public Reservas getReserva() {
        return reserva;
    }

    public void setReserva(Reservas reserva) {
        this.reserva = reserva;
    }

    public Quarto getQuarto() {
        return quarto;
    }

    public void setQuarto(Quarto quarto) {
        this.quarto = quarto;
    }
    
    
    
    
}
