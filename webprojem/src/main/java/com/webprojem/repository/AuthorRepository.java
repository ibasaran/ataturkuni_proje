package com.webprojem.repository;

import org.springframework.data.repository.CrudRepository;

import com.webprojem.domain.Author;

public interface AuthorRepository extends CrudRepository<Author, Long>{

}
