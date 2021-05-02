package com.davis.book;

import org.springframework.data.jpa.repository.JpaRepository;

import com.davis.models.Book;

public interface BookRepository extends JpaRepository<Book, Integer>{

}
