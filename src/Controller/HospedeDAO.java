package Controller;

import Connection.ConnectionFactory;
import Models.Hospede;
import java.util.List;
import javax.persistence.EntityManager;

public class HospedeDAO {
    public Hospede save(Hospede hospede){
        EntityManager em =new ConnectionFactory().getConnection();
        try{
            em.getTransaction().begin();
            
            em.persist(hospede); //metodo para salvar
            
            em.getTransaction().commit();
        }catch(Exception e){
            System.err.println(e);
            em.getTransaction().rollback();
        }finally{
            em.close();  
        }
        return hospede;
    }
    
    public Hospede update(Hospede hospede){
        EntityManager em =new ConnectionFactory().getConnection();
        try{
            em.getTransaction().begin();
            
            em.merge(hospede); //metodo para salvar
            
            em.getTransaction().commit();
        }catch(Exception e){
            System.err.println(e);
            em.getTransaction().rollback();
        }finally{
            em.close();  
        }
        return hospede;
    }
    
    public Hospede findById(Integer id){
        EntityManager em = new ConnectionFactory().getConnection();
        Hospede hospede=null;
        
        try{
            hospede=em.find(Hospede.class, id);
        }catch(Exception e){
            System.err.println(e);
        }finally{
            em.close();
        }
        return hospede;
    }
    
    public List<Hospede> findAll(){
        EntityManager em = new ConnectionFactory().getConnection();
        List<Hospede> listaHospedes= null;
        
        try{
            listaHospedes = em.createQuery("from Hospede c").getResultList();
        }catch(Exception e){
            System.err.println(e);
        }finally{
            em.close();
        }
        return listaHospedes;
    }
    
    public Hospede remove(Integer id){
        EntityManager em = new ConnectionFactory().getConnection();
        Hospede hosp = null;
        
        try{
            hosp=em.find(Hospede.class, id);
            em.getTransaction().begin();
            em.remove(hosp);
            em.getTransaction().commit();
        }catch(Exception e){
            System.err.println(e);
            em.getTransaction().rollback();
        }finally{
            em.close();
        }
        return hosp;
        
    }
}
