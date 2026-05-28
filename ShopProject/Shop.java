package ShopProject;

public class Shop {


    private Product[] products = new Product[100];
    private int size = 0;

    public void add(Product product) {
        products[size] = product;
        size++;
    }

    public Product findById(int id) {

        for (int i = 0; i < size; i++) {

            if (products[i].getId() == id) {
                return products[i];
            }
        }

        return null;
    }

    public boolean removeById(int id) {

        for (int i = 0; i < size; i++) {

            if (products[i].getId() == id) {

                for (int j = i; j < size - 1; j++) {
                    products[j] = products[j + 1];
                }

                products[size - 1] = null;
                size--;

                return true;
            }
        }

        return false;
    }

    public boolean updatePriceById(int id, int newPrice) {

        Product p = findById(id);

        if (p == null) {
            return false;
        }

        p.setPrice(newPrice);

        return true;
    }

    public int countProducts() {
        return size;
    }

    public void clear() {

        for (int i = 0; i < size; i++) {
            products[i] = null;
        }

        size = 0;
    }

    public void showAll() {

        for (int i = 0; i < size; i++) {
            System.out.println(products[i]);
        }
    }
}
