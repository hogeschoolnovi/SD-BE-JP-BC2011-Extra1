package nl.novi.uitleg;

import java.util.ArrayList;
import java.util.List;

public class Shop {

    private String name;

    // 1 op meer relatie
    // Een winkel kan meerdere objecten hebben
    private List<Product> products = new ArrayList<>();

    public Shop(String name) {
        this.name = name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public void addProduct(Product product) {
        products.add(product);
    }

    public int giveAmountOfProducts() {
        int amountOfProducts = 0;
        amountOfProducts = products.size();
        return amountOfProducts;
    }

    @Override
    public String toString() {

        StringBuilder stringBuilder = new StringBuilder("Winkel: ");

        stringBuilder.append(this.name).append("\r\n");
        for (Product product : products) {
            stringBuilder.append(product.getName()).append("\r\n");
        }

        return stringBuilder.toString();
    }


}
