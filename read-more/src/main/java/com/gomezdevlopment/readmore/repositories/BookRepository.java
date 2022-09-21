package com.gomezdevlopment.readmore.repositories;

import com.gomezdevlopment.readmore.models.Book;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface BookRepository extends JpaRepository<Book, Long> {
    void deleteBookById(Long id);

    @Query(value = "Select * FROM Book WHERE userID = :userId", nativeQuery = true)
    List<Book> getUserBooks(@Param("userId") String userId);
}
