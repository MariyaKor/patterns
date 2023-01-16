package org.example.builder;

public class BuilderTest {
    public static void main(String[] args) {
        Book book = Book.BookBuilder.builder()
                .withTitle("Passenger")
                .withAuthor("Jean-Christophe Grangé")
                .withEdition("Edition")
                .withVolume(706)
                .withColor("blue")
                .withYear("2021")
                .withIsbn("938-5-389-8765")
                .build();
        System.out.println("book" + book);
    }
}