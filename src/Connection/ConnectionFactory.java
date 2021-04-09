package Connection;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class ConnectionFactory {
    private static EntityManagerFactory entMF = Persistence.createEntityManagerFactory("meuPU");
    
    public EntityManager getConnection(){
        return entMF.createEntityManager();
    }
}
