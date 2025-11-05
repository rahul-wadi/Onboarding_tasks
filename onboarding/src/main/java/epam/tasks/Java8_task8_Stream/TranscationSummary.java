package epam.tasks.Java8_task8_Stream;

import java.util.*;
import java.util.stream.Collectors;

public class TranscationSummary {

	public static void main(String[] args) {
        List<Transaction> transactions = Arrays.asList(
            new Transaction(100.0, "USD", "COMPLETED"),
            new Transaction(200.0, "USD", "PENDING"),
            new Transaction(150.0, "EUR", "COMPLETED"),
            new Transaction(50.0, "USD", "COMPLETED"),
            new Transaction(75.0, "EUR", "FAILED")
        );

        Map<String, Double> totalByCurrency = transactions.stream()
            .filter(t -> "COMPLETED".equalsIgnoreCase(t.getStatus())) 
            .collect(Collectors.groupingBy(                         
                Transaction::getCurrency,
                Collectors.summingDouble(Transaction::getAmount)    
            ));
        
        totalByCurrency.forEach((currency, total) ->
            System.out.println(currency + " => " + total));
    }
}
