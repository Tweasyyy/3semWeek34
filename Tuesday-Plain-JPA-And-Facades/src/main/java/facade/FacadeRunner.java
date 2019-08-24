package facade;

import entity.Book;
import java.util.List;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class FacadeRunner {
    public static void main(String[] args) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("pu");
        BookFacade facade = BookFacade.getBookFacade(emf);
        Book b4 = facade.addBook("Learn JavaScript");
        facade.addBook("Learn JavaScript V2");
        facade.addBook("Learn JavaScript V3");
        
        List <Book> books = facade.getAllBooks();
        
        for(Book b: books) {
            System.out.println(b.toString());
        }
    }
    
}
