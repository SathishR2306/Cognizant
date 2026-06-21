public class Main {

    public static void main(String[] args) {

        Book[] books = {
                new Book(1, "Java", "James"),
                new Book(2, "Python", "Guido"),
                new Book(3, "Spring", "Rod")
        };

        System.out.println(
                SearchBooks.linearSearch(books, "Python"));
    }
}