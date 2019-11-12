package guru.springframework.spring5webapp.controllers;

import guru.springframework.spring5webapp.repositories.BookRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.HashMap;
import java.util.Map;

@Controller
public class BookController {


    private BookRepository bookRepository;

    public BookController (BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    @RequestMapping("/books")
    public String getBooks(Model model) {

        Map<String, Object> myMap = new HashMap<>();
        myMap.put("books", bookRepository.findAll());

        model.addAllAttributes(myMap);

        model.addAttribute("myBooks", bookRepository.findAll());
        return "books";
    }


}
