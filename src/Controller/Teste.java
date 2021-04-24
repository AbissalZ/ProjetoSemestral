package Controller;

import Connection.ConnectionFactory;
import Models.Hospedagem;
import Models.Hospede;
import Models.Quarto;
import Models.Reservas;
import Models.Usuario;

public class Teste {
    
    
    
    public static void main(String [] args){
        
        int aleatorio=(int)(1000+Math.random()* (10000-1000+1));
        
        Quarto quarto = new Quarto();
        
        quarto.setIdQuarto(1);
        quarto.setDisp("Disponivel");
        quarto.setNumeroQuarto(aleatorio);
        quarto.setPreco(2500);
        quarto.setStatus("1 Estrelas");
        quarto.setTipo("Single");
        new QuartoDAO().update(quarto);
        
        
        
        
    }
    
    
}
