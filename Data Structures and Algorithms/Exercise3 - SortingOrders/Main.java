public class Main {

    public static void main(String[] args) {

        Order[] orders = {
                new Order(1, "Sathish", 5000),
                new Order(2, "Teja", 1000),
                new Order(3, "Vidhya", 8000)
        };

        SortOperations.quickSort(orders, 0, orders.length - 1);

        for (Order o : orders)
            System.out.println(o);
    }
}