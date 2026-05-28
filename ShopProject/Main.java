package ShopProject;

public class Main {

    public static void main(String[] args) {

        Shop shop = new Shop();

        shop.add(new Product(1, "Phone", 300000));
        shop.add(new Product(2, "Laptop", 500000));
        shop.add(new Product(3, "Mouse", 10000));

        System.out.println("Все товары:");
        shop.showAll();

        System.out.println("\nУдаление ID 2:");
        shop.removeById(2);
        shop.showAll();

        System.out.println("\nИзменение цены:");
        shop.updatePriceById(1, 350000);
        shop.showAll();

        System.out.println("\nКоличество товаров:");
        System.out.println(shop.countProducts());

        System.out.println("\nОчистка магазина:");
        shop.clear();
        shop.showAll();

        System.out.println("Количество после очистки:");
        System.out.println(shop.countProducts());
    }
}
