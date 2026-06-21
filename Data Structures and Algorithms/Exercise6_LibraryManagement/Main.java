public class Main {

    public static void main(String[] args) {

        Book[] arr = {
                new Book(101, "C++", "Bjarne"),
                new Book(102, "Java", "James"),
                new Book(103, "Kotlin", "JetBrains"),
                new Book(104, "Python", "Guido"),
                new Book(105, "Rust", "Graydon"),
                new Book(106, "Spring", "Rod")
        };

        String[] queries = {"Python", "Rust", "Go"};

        for (String q : queries) {
            int pos1 = SearchBooks.linearSearch(arr, q);
            int pos2 = SearchBooks.binarySearch(arr, q);
            System.out.println("Search for book title: " + q);
            System.out.println("  Linear Search Index: " + pos1);
            System.out.println("  Binary Search Index: " + pos2);
        }
    }
}