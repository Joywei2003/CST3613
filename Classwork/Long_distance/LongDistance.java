package Long_distance;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.text.DecimalFormat;

// Long Distance Calls

public class LongDistance extends JFrame
{
    private RatePanel ratePanel;        // A panel for rates
    private MinutesPanel minutesPanel;  // A panel for minutes
    private JPanel buttonPanel;         // A panel for the buttons
    private JButton calcButton;         // Calculates everything
    private JButton exitButton;         // Exits the application

    public LongDistance()
    {
        // Display a title.
        super("Long Distance Charges");

        // Specify what happens when the close button is clicked.
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Create a RatePanel object.
        ratePanel = new RatePanel();

        // Create a MinutesPanel object.
        minutesPanel = new MinutesPanel();

        // Build the panel that contains the buttons.
        buildButtonPanel();

        // Add the panels to the content pane.
        add(ratePanel, BorderLayout.NORTH);
        add(minutesPanel, BorderLayout.CENTER);
        add(buttonPanel, BorderLayout.SOUTH);

        // Pack and display the window.
        pack();
        setVisible(true);
    }


    private void buildButtonPanel()
    {
        // Create a button to calculate the charges.
        calcButton = new JButton("Calculate Charges");

        // Add an action listener to the button.
        calcButton.addActionListener(new CalcButtonListener());

        // Create a button to exit the application.
        exitButton = new JButton("Exit");

        // Add an action listener to the button.
        exitButton.addActionListener(new ExitButtonListener());

        // Put the buttons in their own panel.
        buttonPanel = new JPanel();
        buttonPanel.add(calcButton);
        buttonPanel.add(exitButton);
    }



    private class CalcButtonListener implements ActionListener
    {

        public void actionPerformed(ActionEvent e)
        {
            double rate;         // Applicable rate
            double totalCharges; // Total charges

            // Create a DecimalFormat object to format output.
            DecimalFormat dollar = new DecimalFormat("#,##0.00");

            // Get the applicable rate.
            rate = ratePanel.getRate();

            // Get the total charges
            totalCharges = minutesPanel.getCharges(rate);

            // Display the message.
            JOptionPane.showMessageDialog(null, "Total Charges: $" +
                    dollar.format(totalCharges));
        }
    } // End of inner class

    private class ExitButtonListener implements ActionListener
    {

        public void actionPerformed(ActionEvent e)
        {
            System.exit(0);
        }
    } // End of inner class

}