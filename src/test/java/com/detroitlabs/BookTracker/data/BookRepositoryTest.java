package com.detroitlabs.BookTracker.data;

import com.detroitlabs.BookTracker.model.Book;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class BookRepositoryTest {


    @Test
    void shouldReturnBookTitle() {
        //Arrange
        BookRepository testTitle = new BookRepository();

        //Act
        String result = testTitle.findByTitle("The Coffin Path");

        //Assert
        assertEquals(result, "The Coffin Path");
    }
}