package com.detroitlabs.BookTracker.data;

import com.detroitlabs.BookTracker.model.Book;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Component
public class BookRepository {

    private static final List<Book> ALL_BOOKS = Arrays.asList(
            new Book("Harry Potter and the Sorcerers Stone", "By: J.K. Rowling", "Fantasy", 309, "HPSorcerer"),
            new Book("Harry Potter and the Chamber of Secrets", "By: J.K. Rowling", "Fantasy", 341, "HPChamber"),
            new Book("Harry Potter and the Prisoner of Azkaban", "By: J.K. Rowling", "Fantasy", 435, "HPPrisoner"),
            new Book("Harry Potter and the Goblet of Fire", "By: J.K. Rowling", "Fantasy", 734, "HPGoblet"),
            new Book("Harry Potter and the Order of the Phoenix", "By: J.K. Rowling", "Fantasy", 870, "HPOrder"),
            new Book("Harry Potter and the Half-Blood Prince", "By: J.K. Rowling", "Fantasy", 652, "HPHalfBlood"),
            new Book("Harry Potter and the Deathly Hollows", "By: J.K. Rowling", "Fantasy", 759, "HPDeathly"),
            new Book("Harry Potter and the Cursed Child", "By: J.K. Rowling", "Fantasy", 343, "HPCursedChild"),
            new Book("The Ballad of Songbirds and Snakes", "By: Suzanne Collins", "Fantasy", 439, "Songbirds"),
            new Book("An Indigenous Peoples' History of the United States", "By: Roxanne Dunbar-Ortiz", "History", 296, "IPHistory"),
            new Book("The Last House on Needless Street", "By: Catriona Ward", "Horror", 335, "LastHouse"),
            new Book("Heart-Shaped Box", "By: Joe Hill", "Horror", 376, "HeartShaped"),
            new Book("The Coffin Path", "By: Katherine Clements", "Horror", 384, "CoffinPath"),
            new Book("Digging Up Mother", "By: Doug Stanhope", "Comedy", 288, "DiggingMother"));


    public List<Book> getAllBooks() {
        return ALL_BOOKS;
    }

    public String findByTitle(String title) {
        for (Book book : ALL_BOOKS) {
            if (book.getTitle().equals(title)) {
                return book.getTitle();
            }
        }
        return null;
    }

    public List<Book> addByTitle(String title) {
        List<Book> bookGoal = new ArrayList<>();
        for (Book book : ALL_BOOKS) {
            if (book.getTitle().equals(title)) {
                bookGoal.add(book);
            }
        }
        return bookGoal;
    }
}
