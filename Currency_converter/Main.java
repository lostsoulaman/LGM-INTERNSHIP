package Currency_converter;

import javax.swing.*;


public class Main {
    public static void main(String[] args) {

        try {

            CurrencyConverter currencyConverter = new CurrencyConverter();

            currencyConverter.setTitle("Currency_Converter_By_Sengra");
            currencyConverter.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            currencyConverter.setSize(600, 400);
            currencyConverter.setLocationRelativeTo(null);
            currencyConverter.setVisible(true);
        }
        catch(Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }

    }
}




