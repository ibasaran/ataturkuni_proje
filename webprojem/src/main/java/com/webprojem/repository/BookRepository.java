package com.webprojem.repository;

import org.springframework.data.repository.CrudRepository;

import com.webprojem.domain.Book;

public interface BookRepository extends CrudRepository<Book, Long>{

}
