package onlineStore;

import java.util.Comparator;

public class BrandComparator implements Comparator<Product> {
    public int compare(Product o1, Product o2) {
        return o1.getBrand().compareTo(o2.getBrand());
    }
}
