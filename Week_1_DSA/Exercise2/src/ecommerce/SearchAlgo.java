package ecommerce;

import java.util.Arrays;
import java.util.Comparator;

public class SearchAlgo {
    
   
    public static Product linearSearch(Product[] products, String targetName) {
        for (Product product : products) {
            if (product.getName().equalsIgnoreCase(targetName)) {
                return product;
            }
        }
        return null;
    }

    public static Product binarySearch(Product[] products, String targetName) {
        Arrays.sort(products, Comparator.comparing(Product::getName));
        
        int low = 0;
        int high = products.length - 1;

        while (low <= high) {
            int m = low + (high - low) / 2;
            int cmp = products[m].getName().compareToIgnoreCase(targetName);

            if (cmp == 0) {
                return products[m];
            } else if (cmp < 0) {
                low = m + 1;
            } else {
                high = m - 1;
            }
        }
        return null;
    }
}
