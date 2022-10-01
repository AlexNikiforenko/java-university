package p02;
//2.3

public class Book {
    String genre, name, author;
    int year;

    public String toString() {
        return "Book's name: " + name + '\n'
                + "Book's author: " + author + '\n'
                + "Book's genre: " + genre + '\n'
                + "Book's year: " + year;
    }

    public static void main(String[] args) {
        Book book = new Book();
        book.name = "The Master and Margarita";
        book.author = "Mikhail Bulgakov";
        book.genre = "Fantasy";
        book.year = 1967;

        System.out.println(book);
    }
}
