package Models;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "hospedes")
public class Hospede extends Pessoa implements Serializable{
    private String tipoDeDoc;
    private String nrDoc;
    private String nacionalidade;
    private Integer nrHospede;

    public Hospede(){
        
    }

    public Hospede(String nome, String apelido, String telefone, String email, String dataNascimento, String tipoDeDoc, String nrDoc, String nacionalidade,Integer nrHospede) {
        super(nome, apelido, telefone, email, dataNascimento);
        this.tipoDeDoc = tipoDeDoc;
        this.nrDoc = nrDoc;
        this.nacionalidade = nacionalidade;
        this.nrHospede = nrHospede;
    }
    
    

    public String getTipoDeDoc() {
        return tipoDeDoc;
    }

    public void setTipoDeDoc(String tipoDeDoc) {
        this.tipoDeDoc = tipoDeDoc;
    }

    public String getNrDoc() {
        return nrDoc;
    }

    public void setNrDoc(String nrDoc) {
        this.nrDoc = nrDoc;
    }
                                              

    public Integer getNrHospede() {
        return nrHospede;
    }

    public void setNrHospede(Integer nrHospede) {
        this.nrHospede = nrHospede;
    }

    public String getNacionalidade() {
        return nacionalidade;
    }

    public void setNacionalidade(String nacionalidade) {
        this.nacionalidade = nacionalidade;
    }
    
    @Override
    public String toString(){
        return super.toString()+ nrHospede+ tipoDeDoc+nrDoc+nacionalidade;
    }
    
}
