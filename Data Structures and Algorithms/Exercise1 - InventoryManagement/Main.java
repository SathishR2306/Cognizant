public class Main {
    public static void main(String[] args) {
        InventoryManager manager = new InventoryManager();

        manager.addProduct(new Product(101, "Laptop", 10, 50000));
        manager.addProduct(new Product(102, "Mouse", 50, 500));
        manager.addProduct(new Product(103, "Keyboard", 30, 1200));
        manager.addProduct(new Product(104, "Monitor", 15, 15000));
        manager.addProduct(new Product(105, "Headphones", 25, 2500));

        System.out.println("Initial Inventory:");
        manager.displayProducts();

        manager.updateProduct(101, 15, 52000);
        manager.updateProduct(103, 40, 1100);

        manager.deleteProduct(102);

        System.out.println("\nAfter Updates and Deletions:");
        manager.displayProducts();
    }
}