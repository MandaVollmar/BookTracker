package com.detroitlabs.BookTracker.controller;

import com.detroitlabs.BookTracker.data.BookRepository;
import com.detroitlabs.BookTracker.data.ImageRepository;
import com.detroitlabs.BookTracker.model.Book;
import com.detroitlabs.BookTracker.model.Image;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
public class BookController {
    @Autowired
    BookRepository bookRepository = new BookRepository();
    @Autowired
    ImageRepository imageRepository = new ImageRepository();

    @RequestMapping("/")
    public String listBooks(String title, ModelMap modelmap){
        List<Book> bookList = bookRepository.getAllBooks();
        modelmap.put("bookList", bookList);
        return "home";
    }

}
