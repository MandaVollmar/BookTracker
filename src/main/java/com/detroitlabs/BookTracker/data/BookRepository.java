package com.detroitlabs.BookTracker.data;

import com.detroitlabs.BookTracker.model.Book;
import org.springframework.stereotype.Component;

import java.util.Arrays;
import java.util.List;

@Component
public class BookRepository {
    private static final List<Book> ALL_BOOKS = Arrays.asList(
            new Book("Harry Potter and the Sorcerers Stone", "J.K. Rowling", "Fantasy", 309, 1),
            new Book("Harry Potter and the Chamber of Secrets", "J.K. Rowling", "Fantasy", 341, 2),
            new Book("Harry Potter and the Prisoner of Azkaban", "J.K. Rowling", "Fantasy", 435, 3),
            new Book("Harry Potter and the Goblet of Fire", "J.K. Rowling", "Fantasy", 734, 4),
            new Book("Harry Potter and the Order of the Phoenix", "J.K. Rowling", "Fantasy", 870, 5),
            new Book("Harry Potter and the Half-Blood Prince", "J.K. Rowling", "Fantasy", 652, 6),
            new Book("Harry Potter and the Deathly Hollows", "J.K. Rowling", "Fantasy", 759, 7),
            new Book("Harry Potter and the Cursed Child", "J.K. Rowling", "Fantasy", 343, 8),
            new Book("The Ballad of Songbirds and Snakes", "Suzanne Collins", "Fantasy", 439, 9),
            new Book("An Indigenous Peoples' History of the United States", "Roxanne Dunbar-Ortiz", "History", 296, 10),
            new Book("The Last House on Needless Street", "Catriona Ward", "Horror", 335, 11),
            new Book("Heart-Shaped Box", "Joe Hill", "Horror", 376, 12),
            new Book("The Coffin Path", "Katherine Clements", "Horror", 384, 13),
            new Book("Digging Up Mother", "Doug Stanhope", "Comedy", 288, 14));


    public List<Book> getAllBooks() {
            return ALL_BOOKS;
        }

    public Book findByTitle(String title) {
        for (Book book : ALL_BOOKS) {
            if (book.getTitle().equals(title)) {
                return book;
            }
        }
        return null;
    }
}
