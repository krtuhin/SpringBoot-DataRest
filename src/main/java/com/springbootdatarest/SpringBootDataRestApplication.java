package com.springbootdatarest;

import com.springbootdatarest.models.Book;
import com.springbootdatarest.repositories.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringBootDataRestApplication implements CommandLineRunner {

    @Autowired
    private BookRepository bookRepository;

    public static void main(String[] args) {
        SpringApplication.run(SpringBootDataRestApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {

        //first book data
        Book book1 = new Book();
        book1.setTitle("This is first book");
        book1.setContent("This is content of first book");

        //2nd book data
        Book book2 = new Book();
        book2.setTitle("This is book 2");
        book2.setContent("Content of book 2");

        //save two object into database
        this.bookRepository.save(book2);
        this.bookRepository.save(book1);
    }
}
