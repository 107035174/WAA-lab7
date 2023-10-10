package lab7.lab7.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import lab7.lab7.model.Book;

@Repository
public interface BookRepository extends JpaRepository<Book, Long> {

}
