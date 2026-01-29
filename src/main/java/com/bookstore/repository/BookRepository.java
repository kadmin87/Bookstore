package com.bookstore.repository;

import java.util.List;
import java.util.Optional;

/**
 * Book Repository Interface
 * Defines the standard operations to be performed on Book models
 * Such as adding, updating, deleting, and fetching books.
 */
public interface BookRepository {
    List<Book> findAll();
    // Optional can be used to handle null values more gracefully
    Optional<Book> findById(int id);
    Book save(Book book);
    void deleteById(int id);
}
