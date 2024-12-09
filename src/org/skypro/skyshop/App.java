package org.skypro.skyshop;

import org.skypro.skyshop.basket.Basket;
import org.skypro.skyshop.product.DiscountedProduct;
import org.skypro.skyshop.product.FixPriceProduct;
import org.skypro.skyshop.product.Product;
import org.skypro.skyshop.product.SimpleProduct;

public class App {
    public static void main(String[] args) {

        Product apple = new SimpleProduct("Яблоко", 10);
        Product pear = new SimpleProduct("Груша", 100);
        Product banana = new DiscountedProduct("Банан", 30, 10);
        Product plum = new FixPriceProduct("Слива");

        Basket basket = new Basket();

        basket.addProduct(apple);
        basket.addProduct(pear);
        basket.addProduct(banana);
        basket.addProduct(plum);

        basket.printBasket();

    }
}