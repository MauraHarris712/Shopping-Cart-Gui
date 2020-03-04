
/**
 * ShoppingCartController.java 1.0 Apr 14, 2019
 *
 * Copyright (c) 2019 Connor K Simpson. All Rights Reserved
 * Elon University, Elon, NC 27244
 */

/**
 * Start each class or interface with summary description line
 *
 * @author Connor Simpson
 * @version 1.0
 *
 */
public class ShoppingCartController {
    private ShoppingCartGui gui;
    private ShoppingCart model;

    public ShoppingCartController() {
        model = new ShoppingCart();
        gui = new ShoppingCartGui();
    }

    public void go() {
        int optionNum = gui.getOption();

        while (optionNum < 6) {
            if (optionNum == 1) {
                String[] products = model.getListArray();
                gui.getDisplay(products);
            } else if (optionNum == 2) {
                String description = gui.getDescription();
                double price = gui.getPrice();
                model.addProduct(description, price);
            } else if (optionNum == 3) {
                model.reverseItems();
            } else if (optionNum == 4) {
                model.emptyCart();
            } else if (optionNum == 5) {
                int itemNum = gui.removeItemNum(model.getListLength());
                model.removeItem(itemNum);
            }
            optionNum = gui.getOption();
        }
    }

}
