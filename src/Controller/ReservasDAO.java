package Controller;

import Connection.ConnectionFactory;
import Models.Reservas;
import java.util.List;
import javax.persistence.EntityManager;

public class ReservasDAO {
    public Reservas save(Reservas reserva){
        EntityManager em = new ConnectionFactory().getConnection();
        
        try{
            em.getTransaction().begin();
            em.persist(reserva);
            em.getTransaction().commit();
        }catch(Exception e){
            System.err.println(e);
            em.getTransaction().rollback();
        }finally{
            em.close();
        }
        return reserva;
    }
    
    public Reservas update(Reservas reserva){
        EntityManager em = new ConnectionFactory().getConnection();
        
        try{
            em.getTransaction().begin();
            em.merge(reserva);
            em.getTransaction().commit();
        }catch(Exception e){
            System.err.println(e);
            em.getTransaction().rollback();
        }finally{
            em.close();
        }
        return reserva;
    } 
    
    public Reservas findById(Integer id){
        EntityManager em =new ConnectionFactory().getConnection();
        Reservas reserva = null;
        
        try{
            reserva = em.find(Reservas.class, id); //metodo para procurar
        }catch(Exception e){
            System.err.println(e);
        }finally{
            em.close();
        }
        return reserva;
    }
    
    public List<Reservas> findAll(){
        EntityManager em =new ConnectionFactory().getConnection();
        List<Reservas> reserva = null;
        
        try{
            reserva=em.createQuery("from Reservas c").getResultList();
            
        }catch(Exception e){
            System.err.println(e);
        }finally{
            em.close();
        }
        return reserva;
    }
    
    public Reservas remove(Integer id){
        EntityManager em =new ConnectionFactory().getConnection();
        Reservas reserva = null;
        try{
            reserva = em.find(Reservas.class, id);
            em.getTransaction().begin();
            em.remove(reserva);
            em.getTransaction().commit();
            
        }catch(Exception e){
            System.err.println(e);
            em.getTransaction().rollback();
        }finally{
            em.close();
        }
        return reserva;
    }
}
