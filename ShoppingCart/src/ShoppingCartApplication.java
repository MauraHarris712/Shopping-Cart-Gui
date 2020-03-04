/**
 * ShoppingCartApplication.java 1.0 Apr 14, 2019
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
public class ShoppingCartApplication {

    /**
     * @param args
     */
    public static void main(String[] args) {
        ShoppingCartController controller = new ShoppingCartController();
        controller.go();
        System.exit(0);

    }

}
