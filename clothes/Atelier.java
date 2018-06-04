package clothes;

public class Atelier {

    public static void wearMan(Clothes[] clothes) {
        System.out.println("Мужская одежда: ");

        for (Clothes cloth : clothes) {
            if (cloth instanceof ManClothes) {
                System.out.println(cloth);
            }
        }
    }

    public static void wearWoman(Clothes[] clothes) {
        System.out.println("Женская одежда: ");
        for (Clothes cloth : clothes) {
            if (cloth instanceof WomanClothes) {
                System.out.println(cloth);
            }
        }
    }
}
