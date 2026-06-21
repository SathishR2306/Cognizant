public class Main {

    public static void main(String[] args) {

        Product[] products = {
                new Product(1, "Keyboard", "Electronics"),
                new Product(2, "Laptop", "Electronics"),
                new Product(3, "Mouse", "Electronics")
        };

        int linear = SearchOperations.linearSearch(products, "Laptop");
        System.out.println("Linear Search Index: " + linear);

        int binary = SearchOperations.binarySearch(products, "Laptop");
        System.out.println("Binary Search Index: " + binary);
    }
}