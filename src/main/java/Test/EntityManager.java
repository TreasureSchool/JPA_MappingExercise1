package Test;

import Entity.Book;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/*
 * @author Joachim
 */
public class EntityManager {
    Book bookboy = new Book();
    bookboy.setTitle("bookboy");
    EntityManagerFactory emf;
    emf = Persistence.createEntityManagerFactory("pu-x");
    
}
