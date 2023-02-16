package com.example.bookservice.controller;

import com.example.bookservice.model.Book;
import com.example.bookservice.service.BookService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping("/books")
@RequiredArgsConstructor
public class BookCtrl {
    private final BookService bookService;

    @GetMapping("/{bookId}")
    public Mono<Book> getBookInfo(@PathVariable("bookId") Long id) {
        return bookService.findBookById(id);
    }

    @GetMapping
    public Flux<Book> getBooksInfo() {
        return bookService.findAllBooks();
    }
}
