package Controller;

import Connection.ConnectionFactory;
import Models.Hospedagem;
import Models.Hospede;
import Models.Quarto;
import Models.Reservas;
import Models.Usuario;

public class Teste {
    
    
    
    public static void main(String [] args){
        Hospede hp = new Hospede();
        
        hp.setIdPessoa(1);
        hp.setNome("Abissal");
        
        new HospedeDAO().update(hp);
        
        
    }
    
    
}
