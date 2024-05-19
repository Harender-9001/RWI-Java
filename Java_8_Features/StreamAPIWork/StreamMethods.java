package Java_8_Features.StreamAPIWork;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

class Sale {
    private final LocalDate date;
    private final String product;
    private final Integer amount;

    // constructors, getters, setters
    public Sale(LocalDate date, String product, Integer amount) {
        this.date = date;
        this.product = product;
        this.amount = amount;
    }

    public LocalDate getDate() {
        return date;
    }

    public String getProduct() {
        return product;
    }
    public Integer getAmount() {
        return amount;
    }

    // equals, hashCode, toString
}

public class StreamMethods {
    public static void main(String[] args) {

        List<Sale> sales = List.of(
                new Sale(LocalDate.of(2024, 3, 2), "Laptop", 100),
                new Sale(LocalDate.of(2024, 3, 4), "Desktop", 190),
                new Sale(LocalDate.of(2024, 5, 6), "EarPhone", 150),
                new Sale(LocalDate.of(2024, 6, 2), "Laptop", 50),
                new Sale(LocalDate.of(2024, 3, 10), "Desktop", 170),
                new Sale(LocalDate.of(2024, 4, 13), "Watch", 210),
                new Sale(LocalDate.of(2024, 3, 7), "Laptop", 140),
                new Sale(LocalDate.of(2024, 3, 5), "Watch", 125)
        ); // this is the list of all the sales


        // to calculates the sum of amount in March
        int amountSoldInMarch = sales.stream()
                .filter(e -> e.getDate().getMonth() == Month.MARCH)  // Filter sales for March
                .mapToInt(Sale::getAmount)  // Extract amount from the filtered sales
                .sum();  // Sum the extracted amount
        System.out.println("Amount sold in March: " + amountSoldInMarch);

        // to find product name sold in March
        List<String> stringStream = sales.stream()
                .filter(sale -> sale.getDate().getMonth() == Month.MARCH)  // Filter sales for March
                .map(Sale::getProduct).toList();  // Extract products from the filtered sales
        System.out.println("Products sold in March: " + stringStream);

        // to calculates average of amount of Desktop sold
        double amountOfDesktopSold = sales.stream()
                .filter(sale -> sale.getProduct().startsWith("Desktop"))  // Filter sales for Desktop
                .mapToDouble(Sale::getAmount)  // Extract amount from the filtered sales
                .average().getAsDouble();  // Average of extracted amount
        System.out.println("Amount sold of Desktop: " + amountOfDesktopSold);
    }
}

