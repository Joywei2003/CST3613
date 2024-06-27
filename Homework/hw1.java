/**1. Monthly Sales Tax
 A retail company must file a monthly sales tax report listing the total sales for the month, and the amount of state and country sales tax collected.
 The state sales tax rate is 4% and the country sales tax rate is 2%.
 Create a GUI application that allows the user to enter the total sales for the month into a text field.
 From this figure, the application should calculate and display the following:
  • The amount of country sales tax
  •	The amount of state sales tax
  •	The total sales tax (country plus state)
 In the application’s code, represent the country tax rate (0.02) and the state tax rate (0.04) as named constants.
*/

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.text.DecimalFormat;

public class hw1 extends JFrame
{
    // Components
    private JPanel panel;
    private JTextField totalSalesInput;
    private JButton calcButton;

    // Constants for the window size
    private final int WINDOW_WIDTH = 360;
    private final int WINDOW_HEIGHT = 130;

    public hw1()
    {
        //title.
        setTitle("Monthly Sales Tax Calculator");

        // Specify what happens when the close button is clicked.
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Build the panel that contains the other components.
        buildPanel();
        add(panel);

        // Size and display the window.
        setSize(WINDOW_WIDTH, WINDOW_HEIGHT);
        setVisible(true);
    }

    //The buildPanel method creates a panel containing other components.
    private void buildPanel()
    {
        // Create labels to display instructions.
        JLabel message1 = new JLabel("TotalSales:");

        // Create text fields
        totalSalesInput = new JTextField(10);

        // Create a button to click.
        calcButton = new JButton("Calculate tax");
        calcButton.addActionListener(new hw1.CalcButtonListener());

        // Create a panel.
        panel = new JPanel();
        panel.add(message1);
        panel.add(totalSalesInput);
        panel.add(calcButton);
    }

    //CalcButtonListener is an action listener class for the calcButton component.
    private class CalcButtonListener implements ActionListener
    {
        //actionPerformed method
        public void actionPerformed(ActionEvent e)
        {
            double sales, countrySalesTax, stateSalesTax, totalSalesTax, totalPlusTax;
            double countryTaxRate = 0.02, stateTaxRate = 0.04;

            // Create a DecimalFormat object to format output.
            DecimalFormat fmt = new DecimalFormat("#,##0.0");

            // Get the values
            sales = Double.parseDouble(totalSalesInput.getText());

            countrySalesTax = sales * countryTaxRate;
            stateSalesTax = sales * stateTaxRate;
            totalSalesTax = countrySalesTax + stateSalesTax;
            totalPlusTax = sales + totalSalesTax;

            JOptionPane.showMessageDialog(null, "<html>The country sales tax is " + fmt.format(countrySalesTax)
                                                                        +" <br>The state sales tax is " + fmt.format(stateSalesTax)
                                                                        +" <br>The total sales tax is " + fmt.format(totalSalesTax)
                                                                        +" <br><br>The total, sales + tax is </html>" + fmt.format(totalPlusTax));

        }
    }

    public static void main(String[] args)
    {
        new hw1();
    }

}