package services;

import entities.ComputerRoom;
import jakarta.persistence.*;

import java.util.List;

public class CompRoomServices {
    private EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("JPA_Comp");
    private EntityManager entityManager = entityManagerFactory.createEntityManager();
    private EntityTransaction entityTransaction = entityManager.getTransaction();

    public ComputerRoom findById(Integer id){
        return entityManager.find(ComputerRoom.class, id);
    }

    public List<ComputerRoom> findAll(){
        Query query= entityManager.createQuery("SELECT a FROM Comproom a", ComputerRoom.class);
        return query.getResultList();
    }

    public void update(ComputerRoom computerRoom){
        if (findById(computerRoom.getRoomId())!=null){
            entityTransaction.begin();
            entityManager.merge(computerRoom);
            entityTransaction.commit();
        }
    }
    public void create(ComputerRoom computerRoom) {
        entityTransaction.begin();
        entityManager.persist(computerRoom);
        entityTransaction.commit();
    }

    public void delete(Integer id) {
        entityTransaction.begin();
        ComputerRoom computerRoom = findById(id);
        entityManager.remove(computerRoom);
        entityTransaction.commit();
    }
}
