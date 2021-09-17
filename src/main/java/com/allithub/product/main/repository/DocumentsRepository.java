package com.allithub.product.main.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.allithub.product.main.model.Documents;
@Repository
public interface DocumentsRepository extends JpaRepository<Documents, Integer>{

}
