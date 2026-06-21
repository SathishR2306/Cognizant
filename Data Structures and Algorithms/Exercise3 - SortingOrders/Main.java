public class Main {

    public static void main(String[] args) {

        Order[] arr1 = {
                new Order(1, "Sathish", 5000),
                new Order(2, "Teja", 1000),
                new Order(3, "Darshan", 8000),
                new Order(4, "MANI", 3000),
                new Order(5, "Mithran", 2500),
                new Order(6, "Aadhi", 9500)
        };

        Order[] arr2 = {
                new Order(1, "Sathish", 5000),
                new Order(2, "Teja", 1000),
                new Order(3, "Darshan", 8000),
                new Order(4, "MANI", 3000),
                new Order(5, "Mithran", 2500),
                new Order(6, "Aadhi", 9500)
        };

        System.out.println("Bubble Sort Results:");
        SortOperations.bubbleSort(arr1);
        for (Order o : arr1)
            System.out.println(o);

        System.out.println("\nQuick Sort Results:");
        SortOperations.quickSort(arr2, 0, arr2.length - 1);
        for (Order o : arr2)
            System.out.println(o);
    }
}