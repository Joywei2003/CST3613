package TaxCal;

import java.awt.*;
import javax.swing.event.*;
import javax.swing.*;
import java.text.DecimalFormat;

public class TaxCalc extends JFrame {

    private final int MIN_TAX = 0;   // Minimum tax rate
    private final int MAX_TAX = 10;  // Maximum tax rate
    private final int INIT_TAX = 0;  // Initial tax rate

    private JTextField purchase;  // Amount of purchase
    private JTextField tax;       // Sales tax (read-only text field)

    private JSlider slider;       // To adjust sales tax rate
    private JPanel dataPanel;     // Panel to hold label & text field
    private JPanel sliderPanel;   // Panel to hold slider
    private JPanel taxPanel;      // Panel to display the sales tax

    /**
     * Constructor
     */

    public TaxCalc() {

        // Display a title.
        super("Tax Calculator");

        // Specify what happens when the close button is clicked.
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Build the data panel.
        buildDataPanel();

        // Build the slider panel.
        buildSliderPanel();

        // Build the tax panel.
        buildTaxPanel();

        // Add the panels to the content pane.
        add(dataPanel, BorderLayout.NORTH);
        add(sliderPanel, BorderLayout.CENTER);
        add(taxPanel, BorderLayout.SOUTH);

        // Pack and display the window.
        pack();
        setVisible(true);
    }

    /**
     * buildDataPanel method
     */

    private void buildDataPanel(){

        // Create a label prompting the user to enter the
        // amount of the purchase.
        JLabel msg = new JLabel("Enter the amount of the purchase:");

        // Create a text field for the input.
        purchase = new JTextField(10);

        // Put the components in a panel.
        dataPanel = new JPanel();
        dataPanel.add(msg);
        dataPanel.add(purchase);
    }

    /**
     * buildSliderPanel method
     */

    private void buildSliderPanel() {

        // Create a label for identification purposes.
        JLabel sliderMsg = new JLabel("Sales Tax Slider:");

        // Create the slider.
        slider = new JSlider(JSlider.HORIZONTAL, MIN_TAX,
                MAX_TAX, INIT_TAX);
        slider.setMajorTickSpacing(1);
        slider.setPaintTicks(true);
        slider.setPaintLabels(true);

        // Add an event listener to the slider.
        slider.addChangeListener(new SliderListener());

        // Put the label and slider in a panel.
        sliderPanel = new JPanel();
        sliderPanel.add(sliderMsg);
        sliderPanel.add(slider);
    }

    /**
     * buildTaxPanel method
     */

    private void buildTaxPanel(){

        // Create a label identifying the sales tax.
        JLabel taxMsg = new JLabel("Sales Tax:");

        // Create a read-only text field for tax.
        tax = new JTextField(10);
        tax.setEditable(false);
        tax.setText("0.00");

        // Put the label and text field in a panel.
        taxPanel = new JPanel();
        taxPanel.add(taxMsg);
        taxPanel.add(tax);
    }

    /**
     * SliderListener is an event listener class for the slider.
     */

    private class SliderListener implements ChangeListener {

        /**
         * stateChanged method
         */

        public void stateChanged(ChangeEvent e){

            double taxRate;         // Tax rate
            double salesTax;        // Amount of tax

            // Create a DecimalFormat object to format output.
            DecimalFormat dollar = new DecimalFormat("#,##0.00");

            // Get the value
            if (purchase.getText().length() == 0)
                JOptionPane.showMessageDialog(null, "Enter the purchase amount.");
            else {

                // Get the tax rate.
                taxRate = slider.getValue() / 100.0;

                // Calculate the sales tax
                salesTax = Double.parseDouble(purchase.getText()) * taxRate;

                // Display the message.
                tax.setText(dollar.format(salesTax));
            }
        }
    } // End of inner class
}
