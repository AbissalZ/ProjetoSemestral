package Controller;

import Connection.ConnectionFactory;
import Models.Hospedagem;
import java.util.List;
import javax.persistence.EntityManager;

public class HospedagemDAO {
    public Hospedagem save(Hospedagem hospedagem){
        EntityManager em = new ConnectionFactory().getConnection();
        try{
        em.getTransaction().begin();
        em.persist(hospedagem);
        em.getTransaction().commit();
        }catch(Exception e){
            System.err.println(e);
            em.getTransaction().rollback();
        }finally{
            em.close();
        }
        return hospedagem;
    }
    public Hospedagem findById(Integer id){
        EntityManager em = new ConnectionFactory().getConnection();
        Hospedagem hospedagem=null;
        try{
            hospedagem=em.find(Hospedagem.class, id);
        }catch(Exception e){
            System.err.println(e);
        }finally{
            em.close();
        }
        return hospedagem;
    }
    
     public List<Hospedagem> findAll(){
        EntityManager em = new ConnectionFactory().getConnection();
        List<Hospedagem> listaHospedagens= null;
        
        try{
            listaHospedagens = em.createQuery("from Hospedagem c").getResultList();
        }catch(Exception e){
            System.err.println(e);
        }finally{
            em.close();
        }
        return listaHospedagens;
    }
    
    public Hospedagem remove(Integer id){
        EntityManager em = new ConnectionFactory().getConnection();
        Hospedagem hosp = null;
        
        try{
            hosp=em.find(Hospedagem.class, id);
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
