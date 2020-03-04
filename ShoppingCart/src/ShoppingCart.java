
/**
 * ShoppingCart.java 1.0 Apr 14, 2019
 *
 * Copyright (c) 2019 Connor K Simpson. All Rights Reserved
 * Elon University, Elon, NC 27244
 */

import java.util.Collections;
import java.util.LinkedList;
import java.util.ListIterator;


/**
 * Start each class or interface with summary description line
 *
 * @author Connor Simpson
 * @version 1.0
 *
 */
public class ShoppingCart {
    private LinkedList<String> products = new LinkedList<String>();

    public void addProduct(String description, double price) {
        products.add("name=" + description + ", price=" + price);
    }

    public void emptyCart() {
        products.clear();
    }

    public String[] getListArray() {
        String[] productArray = new String[products.size() + 1];
        int i = 1;
        if (products.size() == 0) {
            productArray[0] = "No products in shopping cart";
        } else {
            productArray[0] = "Shopping cart has " + products.size() + " products";
        }

        for (String product : products) {
            productArray[i] = i + ". Apple Product [" + product + "]";
            i++;
        }
        return productArray;
    }

    public int getListLength() {
        return products.size();
    }

    public void removeItem(int itemNumber) {
        ListIterator<String> iterator = products.listIterator();
        int i = 0;
        for (i = 0; i < itemNumber; i++) {
            iterator.next();
        }
        iterator.remove();
    }

    public void reverseItems() {
        Collections.reverse(products);
    }

}
