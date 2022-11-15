package com.example.BookMyShow.respository;

import com.example.BookMyShow.model.BookMyShow;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BookMyShowRepository extends JpaRepository<BookMyShow, String> {
}
