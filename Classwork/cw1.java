/**1.Miles-per-Gallon Calculator Feb 03 2024
 Write a GUI application that calculates a car’s gas mileage.
 The application should let the user enter the number of gallons of gas the car holds, and the number of miles it can be driven on a full tank.
 When a Calculate MPG button is clicked, the application should display the number of miles that the car may be driven per gallon of gas.
 Use the formula to calculate miles per gallon:  MPG = miles / gallons
 */

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.text.DecimalFormat;

public class cw1 extends JFrame
{
    // Components
    private JPanel panel;
    private JTextField gallonsInput;
    private JTextField milesInput;
    private JButton calcButton;

    // Constants for the window size
    private final int WINDOW_WIDTH = 360;
    private final int WINDOW_HEIGHT = 130;

    public cw1()
    {
        //title.
        setTitle("Miles Per Gallon Calculator");

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
        JLabel message1 = new JLabel("Total number of gallons:");
        JLabel message2 = new JLabel("Number of miles driven:");

        // Create text fields for the gallons and miles.
        gallonsInput = new JTextField(10);
        milesInput = new JTextField(10);

        // Create a button to click.
        calcButton = new JButton("Calculate MPG");
        calcButton.addActionListener(new cw1.CalcButtonListener());

        // Create a panel.
        panel = new JPanel();
        panel.add(message1);
        panel.add(gallonsInput);
        panel.add(message2);
        panel.add(milesInput);
        panel.add(calcButton);
    }

    //CalcButtonListener is an action listener class for the calcButton component.
    private class CalcButtonListener implements ActionListener
    {
        //actionPerformed method
        public void actionPerformed(ActionEvent e)
        {
            double gallons, miles, mpg;

            // Create a DecimalFormat object to format output.
            DecimalFormat fmt = new DecimalFormat("#,##0.0");

            // Get the values
            gallons = Double.parseDouble(gallonsInput.getText());
            miles = Double.parseDouble(milesInput.getText());

            mpg = miles / gallons;
            JOptionPane.showMessageDialog(null, "You got " + fmt.format(mpg) + " miles per gallon.");
        }
    }

    //The main method creates an instance of the MPGCalculator class, causing it to display its window.
    public static void main(String[] args)
    {
        new cw1();
    }

}