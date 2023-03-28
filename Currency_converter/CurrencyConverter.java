package Currency_converter;
import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.DecimalFormat;

public class CurrencyConverter extends JFrame implements ActionListener {

    private JLabel amountLabel, fromLabel, toLabel, resultLabel;
    private JTextField amountTextField, resultTextField;
    private JComboBox<String> fromComboBox, toComboBox;
    private JButton jButton;

    private final String[] CURRENCIES = {"INR", "USD", "EUR", "GBP",  "CAD", "AUD", "JPY", "CHF", "CNY", "HKD", "KRW", "MXN", "NOK", "NZD", "SEK", "SGD", "THB", "TRY", "ZAR"};
    private final double[] EXCHANGE_RATES = {1, 84.24, 89.57, 97.75, 62.45, 56.33, 0.523, 90.53, 13.52, 12.21, 0.07, 5.78, 7.35, 2.44, 8.07, 59.78, 3.09, 19.85, 5.54};

    Border blackLine = BorderFactory.createLineBorder(Color.blue);
    public CurrencyConverter() {

        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(5, 1, 20, 40));
        panel.setBorder(blackLine);
        panel.setBackground(new Color(240, 240, 240));

        amountLabel = new JLabel("Amount:");
        fromLabel = new JLabel("From:");
        toLabel = new JLabel("To:");
        resultLabel = new JLabel("Result:");

        amountTextField = new JTextField();
        resultTextField = new JTextField();
        resultTextField.setEditable(false);

        fromComboBox = new JComboBox<>(CURRENCIES);
        toComboBox = new JComboBox<>(CURRENCIES);

        jButton = new JButton("Convert Currency");
        jButton.addActionListener(this);

        panel.add(amountLabel);
        panel.add(amountTextField);
        panel.add(fromLabel);
        panel.add(fromComboBox);
        panel.add(toLabel);
        panel.add(toComboBox);
        panel.add(resultLabel);
        panel.add(resultTextField);
        add(panel, BorderLayout.CENTER);
        add(jButton, BorderLayout.SOUTH);

    }


    @Override
    public void actionPerformed(ActionEvent e) {

        if (e.getSource() == jButton) {
            try {

                double amount = Double.parseDouble(amountTextField.getText());
                int fromIndex = fromComboBox.getSelectedIndex();
                int toIndex = toComboBox.getSelectedIndex();

                double result = amount * EXCHANGE_RATES[fromIndex] / EXCHANGE_RATES[toIndex];
                DecimalFormat df = new DecimalFormat("#.##");

                resultTextField.setText(df.format(result));
            }
            catch (NumberFormatException ex) {
                JOptionPane.showMessageDialog(this, "Please Enter Valid Amount");
            }
        }
    }
}

