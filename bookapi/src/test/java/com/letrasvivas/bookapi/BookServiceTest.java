package com.letrasvivas.bookapi;

import com.letrasvivas.bookapi.model.Book;
import com.letrasvivas.bookapi.repository.BookRepository;
import com.letrasvivas.bookapi.service.BookService;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

@ExtendWith(MockitoExtension.class)
class BookServiceTest {
    @Mock
    private BookRepository bookRepository;

    @InjectMocks
    private BookService bookService;

    @Test
    void getAllBooks_ShouldReturnAllBooks() {
        // Arrange
        Book book1 = new Book(1L, "Book 1", "Author 1", 2020);
        Book book2 = new Book(2L, "Book 2", "Author 2", 2021);
        when(bookRepository.findAll()).thenReturn(Arrays.asList(book1, book2));

        // Act
        List<Book> books = bookService.getAllBooks();

        // Assert
        assertEquals(2, books.size());
        verify(bookRepository, times(1)).findAll();
    }

    @Test
    void saveBook_ShouldReturnSavedBook() {
        Book newBook = new Book(null, "New Book", "New Author", 2023);
        Book savedBook = new Book(1L, "New Book", "New Author", 2023);

        when(bookRepository.save(newBook)).thenReturn(savedBook);

        Book result = bookService.saveBook(newBook);

        assertEquals(savedBook, result);
        verify(bookRepository, times(1)).save(newBook);
    }

    @Test
    void searchBooksByTitle_ShouldReturnMatchingBooks() {
        String searchTitle = "Book";
        Book book1 = new Book(1L, "Book 1", "Author 1", 2020);

        when(bookRepository.findByTitleContainingIgnoreCase(searchTitle))
                .thenReturn(Arrays.asList(book1));

        List<Book> books = bookService.searchBooksByTitle(searchTitle);

        assertEquals(1, books.size());
        assertEquals("Book 1", books.get(0).getTitle());
    }

    @Test
    void deleteBook_ShouldCallRepositoryDelete() {
        Long bookId = 1L;

        doNothing().when(bookRepository).deleteById(bookId);

        bookService.deleteBook(bookId);

        verify(bookRepository, times(1)).deleteById(bookId);
    }
}