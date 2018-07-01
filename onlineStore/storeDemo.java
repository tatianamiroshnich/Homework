package onlineStore;

import java.util.*;

public class storeDemo {
    public static void main(String[] args) {
        //System.out.println(verify("Fox","12345678","12345678"));
        // System.out.println(verify("Bear","1234567","12345678"));

        Product product1 = new Product("L'oreal", "shampoo", 46);
        Product product2 = new Product("MAC", "eyeshadow", 50);
        Product product3 = new Product("Maybelline", "shower gel", 36);
        Product product4 = new Product("Bourjois", "body lotion", 18);
        Product product5 = new Product("Inglot", "lipstick", 27);
        Product product6 = new Product("Body Shop", "hair mask", 15);

        Set<Product> setMakeUp = new HashSet<>();
        setMakeUp.add(product2);
        setMakeUp.add(product5);

        Set<Product> setHair = new HashSet<>();
        setHair.add(product1);
        setHair.add(product6);
        Set<Product> setBody = new HashSet<>();
        setBody.add(product3);
        setBody.add(product4);

        Catalog catalog1 = new Catalog("Makeup", setMakeUp);
        Catalog catalog2 = new Catalog("Hair", setHair);
        Catalog catalog3 = new Catalog("Bath & Body", setBody);
        System.out.println(catalog1 + "\n" + catalog2 + "\n" + catalog3);
        System.out.println();

        print(setMakeUp);
        print(setHair);
        print(setBody);
    }

    public static void print(Set<Product> set) {
        Set<Product> newSetPrice = new TreeSet<>(new PriceComparator());
        newSetPrice.addAll(set);
        System.out.println("Price Sorted" + newSetPrice);

        Set<Product> newSetBrand = new TreeSet<>(new BrandComparator());
        newSetBrand.addAll(set);
        System.out.println("Brand Sorted" + newSetBrand);

        Set<Product> newSetType = new TreeSet<>(new TypeComparator());
        newSetType.addAll(set);
        System.out.println("Type Sorted" + newSetType);
        System.out.println();
    }
}
