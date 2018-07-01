package onlineStore;

import java.util.Comparator;

public class TypeComparator implements Comparator<Product> {
    public int compare(Product o1, Product o2) {
        return o1.getType().compareTo(o2.getType());
    }
}
