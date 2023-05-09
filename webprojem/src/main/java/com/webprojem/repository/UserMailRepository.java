package com.webprojem.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.webprojem.domain.UserMail;

@Repository
public interface UserMailRepository extends JpaRepository<UserMail, Long>{

}
