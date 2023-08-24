package com.springbootdatarest.repositories;

import com.springbootdatarest.models.Book;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

//RepositoryRestResource - user to change url and collection name
@RepositoryRestResource(path = "tk", collectionResourceRel = "MyBooks")
public interface BookRepository extends JpaRepository<Book, Integer> {
}
