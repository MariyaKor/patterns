package org.example.builder;

import lombok.Data;
import lombok.ToString;

@ToString
@Data
public class Book {
    private String title;
    private String author;
    private String edition;
    private int volume;
    private String year;
    private String isbn;
    private String color;

    public Book() {
    }

    public static final class BookBuilder {
        private String title;
        private String author;
        private String edition;
        private int volume;
        private String year;
        private String isbn;
        private String color;

        public static BookBuilder builder() {
            return new BookBuilder();
        }

        public BookBuilder withTitle(String title) {
            this.title = title;
            return this;
        }
        public BookBuilder withAuthor(String author) {
            this.author = author;
            return this;
        }
        public BookBuilder withEdition(String edition) {
            this.edition = edition;
            return this;
        }
        public BookBuilder withVolume(int volume) {
            this.volume = volume;
            return this;
        }
        public BookBuilder withYear(String year) {
            this.year = year;
            return this;
        }
        public BookBuilder withIsbn(String isbn) {
            this.isbn = isbn;
            return this;
        }
        public BookBuilder withColor(String color) {
            this.color = color;
            return this;
        }

        public Book build(){
            Book book = new Book();
            book.setTitle(title);
            book.setAuthor(author);
            book.setEdition(edition);
            book.setVolume(volume);
            book.setYear(year);
            book.setIsbn(isbn);
            book.setColor(color);
            return book;
        }

    }

}


