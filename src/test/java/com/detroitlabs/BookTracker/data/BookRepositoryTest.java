package com.detroitlabs.BookTracker.data;

import com.detroitlabs.BookTracker.model.Book;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class BookRepositoryTest {


    @Test
    void shouldReturnBookList() {
        //Arrange
        BookRepository testBL = new BookRepository();

        //Act
        List<Book> result = testBL.getAllBooks();

        //Assert
        assertEquals(result, "The Coffin Path");
    }
}