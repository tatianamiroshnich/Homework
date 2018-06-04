package clothes;

public class ClothesDemo {
    public static void main(String[] args) {
        Clothes[] clothes = {
                new Pants(Size.XXS, 45, "blue"),
                new Skirt(Size.XS, 15, "red"),
                new Cravat(Size.L, 5, "black"),
                new TShirt(Size.S, 10, "green"),
        };

        Atelier atelier = new Atelier();
        atelier.wearWoman(clothes);
        System.out.println();
        atelier.wearMan(clothes);
    }
}
