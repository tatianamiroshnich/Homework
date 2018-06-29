package onlineStore;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

import static onlineStore.Authentication.verify;

public class storeDemo {
    public static void main(String[] args) {
        System.out.println(verify("Fox","12345678","12345678"));
        System.out.println(verify("Bear","1234567","12345678"));

        Product product1 = new Product("L'oreal","shampoo",56);

        List<Product> list = new ArrayList<>();
        list.add(product1);

       // print(list,PriceComparator);
    }

    public static void print(List<Product> list, Comparator<Product> comparator) {
        List<Product> newList = new ArrayList<>();
        newList.addAll(list);

        System.out.println(newList);
    }
}
