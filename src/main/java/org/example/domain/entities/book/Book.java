package org.example.domain.entities.book;

public class Book {
    private Integer id;
    private Integer edition;
    private Integer numberOfPages;
    private String name;
    private String authors;
    private String publisher;
    private String isbn;
    private BookStatus status;
    private BookGenre genre;

    public Book() {
        status = BookStatus.AVAILABLE;
    }

    public Book(Integer edition, Integer numberOfPages, String name, String authors, String publisher, String isbn, BookStatus status, BookGenre genre) {
        this(null, edition, numberOfPages, name, authors, publisher, isbn, status, genre);
    }

    public Book(Integer id, Integer edition, Integer numberOfPages, String name, String authors, String publisher, String isbn, BookStatus status, BookGenre genre) {
        this.id = id;
        this.edition = edition;
        this.numberOfPages = numberOfPages;
        this.name = name;
        this.authors = authors;
        this.publisher = publisher;
        this.isbn = isbn;
        this.status = status;
        this.genre = genre;
    }

    @Override
    public String toString() {
        return  "ID: " + id +
                "\n Edição: " + edition +
                "\n Número de Páginas" + numberOfPages +
                "\n Nome: " + name +
                "\n Autores: " + authors +
                "\n Editora" + publisher + 
                "\n Isbn: " + isbn +
                "\n Status: " + status +
                "\n Gênero: " + genre ;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getEdition() {
        return edition;
    }

    public void setEdition(Integer edition) {
        this.edition = edition;
    }

    public Integer getNumberOfPages() {
        return numberOfPages;
    }

    public void setNumberOfPages(Integer numberOfPages) {
        this.numberOfPages = numberOfPages;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAuthors() {
        return authors;
    }

    public void setAuthors(String authors) {
        this.authors = authors;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public BookStatus getStatus() {
        return status;
    }

    public void setStatus(BookStatus status) {
        this.status = status;
    }

    public BookGenre getGenre() {
        return genre;
    }

    public void setGenre(BookGenre genre) {
        this.genre = genre;
    }
}
