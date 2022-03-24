package com.detroitlabs.BookTracker.controller;

import com.detroitlabs.BookTracker.data.BookRepository;
import com.detroitlabs.BookTracker.data.ImageRepository;
import com.detroitlabs.BookTracker.model.Book;
import com.detroitlabs.BookTracker.model.Image;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import java.time.Duration;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.List;

@Controller
public class BookController {
    @Autowired
    BookRepository bookRepository = new BookRepository();
    @Autowired
    ImageRepository imageRepository = new ImageRepository();

    @RequestMapping("/")
    public String listBooks(ModelMap modelmap) {
        List<Book> bookList = bookRepository.getAllBooks();
        modelmap.put("bookList", bookList);
        LocalDateTime now = LocalDateTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("EEEE, MMMM, dd, yyyy");
        String dateTimeString = formatter.format(now);
        modelmap.put("date", dateTimeString);
        List<Image> imageList = imageRepository.getAllImages();
        modelmap.put("imageList", imageList);
        LocalDateTime eoy= LocalDateTime.of( 2022, 12, 31, 23,59);
        String eoyString =formatter.format(eoy);
        Duration timeLeft = Duration.between(now, eoy);
        Long timeLeftString = timeLeft.toDays();
        modelmap.put("eoy", timeLeftString);
        return "home";

    }
}
