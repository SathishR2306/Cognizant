public class Main {
    public static void main(String[] args) {
        Product[] arr = {
            new Product(101, "Charger", "Accessories"),
            new Product(102, "Headphones", "Audio"),
            new Product(103, "Keyboard", "Peripherals"),
            new Product(104, "Laptop", "Computers"),
            new Product(105, "Monitor", "Display"),
            new Product(106, "Mouse", "Peripherals"),
            new Product(107, "Tablet", "Mobile"),
            new Product(108, "Webcam", "Video")
        };

        String[] queries = {"Laptop", "Headphones", "Phone"};

        for (String q : queries) {
            int pos1 = SearchOperations.linearSearch(arr, q);
            int pos2 = SearchOperations.binarySearch(arr, q);
            System.out.println("Search for: " + q);
            System.out.println("  Linear Search Index: " + pos1);
            System.out.println("  Binary Search Index: " + pos2);
        }
    }
}