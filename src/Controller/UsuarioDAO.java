package Controller;

import Connection.ConnectionFactory;
import Models.Hospede;

import Models.Usuario;
import java.util.List;
import javax.persistence.EntityManager;

public class UsuarioDAO {
    public Usuario save(Usuario usuario){
        EntityManager em =new ConnectionFactory().getConnection();
        try{
            em.getTransaction().begin();
            
            em.persist(usuario); //metodo para salvar
            
            em.getTransaction().commit();
        }catch(Exception e){
            System.err.println(e);
            em.getTransaction().rollback();
        }finally{
            em.close();  
        }
        return usuario;
    }
    
     public Usuario update(Usuario usuario){
        EntityManager em =new ConnectionFactory().getConnection();
        try{
            em.getTransaction().begin();
            
            em.merge(usuario); //metodo para salvar
            
            em.getTransaction().commit();
        }catch(Exception e){
            System.err.println(e);
            em.getTransaction().rollback();
        }finally{
            em.close();  
        }
        return usuario;
    }
    
    public Usuario findById(Integer id){
        EntityManager em = new ConnectionFactory().getConnection();
        Usuario usuario=null;
        
        try{
            usuario=em.find(Usuario.class, id);
        }catch(Exception e){
            System.err.println(e);
        }finally{
            em.close();
        }
        return usuario;
    }
    
    public List<Usuario> findAll(){
        EntityManager em = new ConnectionFactory().getConnection();
        List<Usuario> listaUsuarios= null;
        
        try{
            listaUsuarios = em.createQuery("from Usuario c").getResultList();
        }catch(Exception e){
            System.err.println(e);
        }finally{
            em.close();
        }
        return listaUsuarios;
    }
    
    public Usuario remove(Integer id){
        EntityManager em = new ConnectionFactory().getConnection();
        Usuario user = null;
        
        try{
            user=em.find(Usuario.class, id);
            em.getTransaction().begin();
            em.remove(user);
            em.getTransaction().commit();
        }catch(Exception e){
            System.err.println(e);
            em.getTransaction().rollback();
        }finally{
            em.close();
        }
        return user;
        
    }
}
