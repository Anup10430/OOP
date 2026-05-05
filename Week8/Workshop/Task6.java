package Workshop;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;  
import java.util.Map;

public class Task6 {
    public static void main(String[] args) {
        Map<String, List<Double>> productPrices = new HashMap<>();

        try {
            BufferedReader br = new BufferedReader(new FileReader("two.txt"));
            String line;

            br.readLine(); 

            while ((line = br.readLine()) != null) {
                String[] parts = line.split(";");

                if (parts.length == 2) {
                    String product = parts[0].trim();
                    double price = Double.parseDouble(parts[1].trim().replace(",", ""));

                    productPrices.putIfAbsent(product, new ArrayList<>());
                    productPrices.get(product).add(price);
                }
            }
            br.close();

            BufferedWriter bw = new BufferedWriter(new FileWriter("output.csv"));     

            for (String product : productPrices.keySet()) {
                List<Double> prices = productPrices.get(product);

                double sum = 0;
                for (double p : prices) {
                    sum += p;
                }

                double avg = sum / prices.size();

                bw.write(product + ": " + avg + "\n");
            }

            bw.close();
            System.out.println("CSV file created successfully!");

        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}