package services;

import entities.Comp;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import java.util.ArrayList;
import java.util.List;

public class CompServices {
    private EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("JPA_Comp");
    private EntityManager entityManager = entityManagerFactory.createEntityManager();
    private EntityTransaction entityTransaction = entityManager.getTransaction();

    public Comp findById(Integer id){
        return entityManager.find(Comp.class, id);
    }
    public List<Comp> findAll(){
        return entityManager.createQuery("SELECT * FROM comp_spec", Comp.class).getResultList();
    }

    public void update(Comp comp){
        if (findById(comp.getId())!=null){
            entityTransaction.begin();
            entityManager.merge(comp);
            entityTransaction.commit();
        }
    }
    public void create(Comp comp) {
        entityTransaction.begin();
        entityManager.persist(comp);
        entityTransaction.commit();
    }

    public void delete(Integer id) {
        entityTransaction.begin();
        Comp comp = findById(id);
        entityManager.remove(comp);
        entityTransaction.commit();
    }
}
