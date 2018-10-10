import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ShoppingCart {

    private List<Product> products;
    private Double price;

    public ShoppingCart() {
        this.products = new ArrayList<>();
    }


    public void addProduct(Product product) {
        this.products.add(product);
    }

    public double totalPrice() {
        double total = 0;
        Integer number = 0;
        /*  Map<String, Integer> count = new HashMap<>();*/
        for (Product product : products) {
            total += product.getPrice();

            if (product.getPrice() == null) {
                product.setPrice(1);
            } else {
                if (product == product) number++;
                if (number % 4 == 0) {
                    total -= product.getPrice();
                }

                return total;
            }
            if (this.products.size() >= 5) {
                total = total * 0.9;
            }
            System.out.println(total);
        }
        return total;
    }

    public void replace(Product product1, Product product2) {
        System.out.println("Product 1 name: " + product1.getName());
        for (Product product : products) {
            if (product1.getName() == product2.getName()) ;
            product1.setName(product2.getName());
        }
        System.out.println("Product 1 name: " + product1.getName());
    }
}
