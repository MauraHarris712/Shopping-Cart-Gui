
/**
 * ShoppingCartGui.java 1.0 Apr 14, 2019
 *
 * Copyright (c) 2019 Connor K Simpson. All Rights Reserved
 * Elon University, Elon, NC 27244
 */

import javax.swing.JOptionPane;


/**
 * Start each class or interface with summary description line
 *
 * @author Connor Simpson
 * @version 1.0
 *
 */
public class ShoppingCartGui {
    public String getDescription() {
        String title = "Enter Apple Product";
        String prompt = "Enter product description";
        String input = JOptionPane.showInputDialog(null, prompt, title,
                JOptionPane.QUESTION_MESSAGE);
        return input;
    }

    public void getDisplay(String[] display) {
        String title = "Shopping Cart Contents";
        JOptionPane.showMessageDialog(null, display, title, JOptionPane.INFORMATION_MESSAGE);
    }

    public int getOption() {
        String title = "Enter option";
        String prompt = "Please select an option" + "\n" + "1. Display products in shopping cart"
                + "\n" + "2. Add product with price to shopping cart" + "\n"
                + "3. Reverse products in shopping cart" + "\n" + "4. Empty shopping cart" + "\n"
                + "5. Remove item number from cart" + "\n" + "6. Quit shopping" + "\n";
        String input = JOptionPane.showInputDialog(null, prompt, title,
                JOptionPane.QUESTION_MESSAGE);
        int optionNum = Integer.parseInt(input);
        return optionNum;
    }

    public double getPrice() {
        String title = "Enter Price";
        String prompt = "Enter product price greater than 0";
        String input = JOptionPane.showInputDialog(null, prompt, title,
                JOptionPane.QUESTION_MESSAGE);
        double price = Double.parseDouble(input);
        return price;
    }

    public int removeItemNum(int itemAmount) {
        String title = "Remove Product";
        String prompt = "Enter product number to remove (1 - " + itemAmount + ")";
        String input = JOptionPane.showInputDialog(null, prompt, title,
                JOptionPane.QUESTION_MESSAGE);
        int itemNum = Integer.parseInt(input);
        return itemNum;
    }

}
