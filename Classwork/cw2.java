/**1.Celsius to Fahrenheit feb 06 2024
 Write GUI application that converts Celsius temperatures to Fahrenheit temperatures.
 The user should be able to enter a Celsius temperature, click a button, and then see the equivalent Fahrenheit temperature.
 Use the following formula to make the conversion:
 F= 9/5 C + 32
 */

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.text.DecimalFormat;
public class cw2 extends JFrame
{
    private JPanel panel;
    private JTextField celsiusInput;
    private JButton calcButton;

    // Constants for the window size
    private final int WINDOW_WIDTH = 360;
    private final int WINDOW_HEIGHT = 130;

    public cw2() {
        // Set the title.
        setTitle("Celsius to Fahrenheit");

        // Specify what happens when the close button is clicked.
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Build the panel that contains the other components.
        buildPanel(); // Method call
        add(panel);

        // Size and display the window.
        setSize(WINDOW_WIDTH, WINDOW_HEIGHT);
        setVisible(true);
    }

    private void buildPanel(){
        // Create a label prompting for the total sales.
        JLabel message1 = new JLabel("Celsius temperature:");

        // Create a text field for total sales.
        celsiusInput = new JTextField(10);

        // Create a button to click.
        calcButton = new JButton("Calculate Fahrenheit");
        calcButton.addActionListener(new cw2.CalcButtonListener());

        panel = new JPanel();
        panel.add(message1);
        panel.add(celsiusInput);
        panel.add(calcButton);

    }
    private class CalcButtonListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            double celsius, fahrenheit;

            // Create a DecimalFormat object to format output.
            DecimalFormat fmt = new DecimalFormat("#,##0.0");

            // Get the Celsius temperature
            celsius = Double.parseDouble(celsiusInput.getText());

            // Calculate the Fahrenheit temperature.
            fahrenheit = (9.0 / 5.0) * celsius + 32;

            // Display the results.
            JOptionPane.showMessageDialog(null, "Fahrenheit: " + fmt.format(fahrenheit) +" degrees");
        }
    }
    public static void main(String[] args)
    {
        new cw2();
    }
}
