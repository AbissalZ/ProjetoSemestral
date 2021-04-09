package Controller;

import Connection.ConnectionFactory;
import Models.Quarto;
import java.util.List;
import javax.persistence.EntityManager;

public class QuartoDAO {
    public Quarto save(Quarto quarto){
        EntityManager em = new ConnectionFactory().getConnection();
        try{
            em.getTransaction().begin();
            em.persist(quarto); 
            em.getTransaction().commit();
        }catch(Exception e){
            System.err.println(e);
            em.getTransaction().rollback();
        }finally{
            em.close();
        }
        return quarto;
    }
    public Quarto update(Quarto quarto){
        EntityManager em = new ConnectionFactory().getConnection();
        try{
            em.getTransaction().begin();
            em.merge(quarto);
            em.getTransaction().commit();
        }catch(Exception e){
            System.err.println(e);
            em.getTransaction().rollback();
        }finally{
            em.close();
        }
        return quarto;
    }
    public Quarto findById(Integer id){
        EntityManager em =new ConnectionFactory().getConnection();
        Quarto quarto = null;
        
        try{
            quarto = em.find(Quarto.class, id); //metodo para procurar
        }catch(Exception e){
            System.err.println(e);
        }finally{
            em.close();
        }
        return quarto;
    }
    
    public List<Quarto> findAll(){
        EntityManager em =new ConnectionFactory().getConnection();
        List<Quarto> quarto = null;
        
        try{
            quarto=em.createQuery("from Quarto c").getResultList();
            
        }catch(Exception e){
            System.err.println(e);
        }finally{
            em.close();
        }
        return quarto;
    }
    
    public Quarto remove(Integer id){
        EntityManager em =new ConnectionFactory().getConnection();
        Quarto quarto = null;
        try{
            quarto = em.find(Quarto.class, id);
            em.getTransaction().begin();
            em.remove(quarto);
            em.getTransaction().commit();
            
        }catch(Exception e){
            System.err.println(e);
            em.getTransaction().rollback();
        }finally{
            em.close();
        }
        return quarto;
    }
}
