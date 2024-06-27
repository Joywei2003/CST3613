package project2;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.text.DecimalFormat;

public class mainPanel extends JFrame{

    //adds the panels created
    private RegistrationPanel registrationPanel;
    private DinnerPanel dinnerPanel;
    private WorkshopPanel workshopPanel;
    private JPanel buttonPanel;         // A panel for the buttons
    private JButton calcButton;         // Calculates everything
    private JButton exitButton;         // Exits the application

    public mainPanel ()
    {
        //sets the title of the window
        super("Registration Calculator");

        // Specify what happens when the close button is clicked.
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JLabel greeting = new JLabel();

        //creates new panels
        registrationPanel = new RegistrationPanel();
        dinnerPanel = new DinnerPanel();
        workshopPanel = new WorkshopPanel();

        // Build the panel that contains the buttons.
        buildButtonPanel();

        //adds the panels and label to the frame
        add(greeting = new JLabel("Conference Registration System"), BorderLayout.CENTER);
        greeting.setForeground(Color.black);
        add(registrationPanel, BorderLayout.NORTH);
        add(dinnerPanel, BorderLayout.WEST);
        dinnerPanel.setBackground(Color.decode("#c3d7e3"));
        add(workshopPanel, BorderLayout.EAST);
        workshopPanel.setBackground(Color.decode("#c3d7e3"));
        add(buttonPanel, BorderLayout.SOUTH);

        pack();
        setSize(400,250);
        setVisible(true);
    }

    private void buildButtonPanel()
    {
        // Create a button to calculate the charges.
        calcButton = new JButton("Calculate");
        calcButton.addActionListener(new CalcButtonListener());

        // Create a button to exit the application.
        exitButton = new JButton("Exit");
        exitButton.addActionListener(new ExitButtonListener());

        // Put the buttons in their own panel.
        buttonPanel = new JPanel();
        buttonPanel.add(calcButton);
        calcButton.setForeground(Color.decode("#29368c"));
        buttonPanel.add(exitButton);
        exitButton.setForeground(Color.decode("#29368c"));
    }

    private class CalcButtonListener implements ActionListener
    {
        public void actionPerformed(ActionEvent e)
        {
            double rcost, dcost, wcost;
            double tTotal;

            // Create a DecimalFormat object to format output.
            DecimalFormat dollar = new DecimalFormat();

            // Get the applicable rate.
            rcost = registrationPanel.getRCost();
            dcost = dinnerPanel.getDCost();
            wcost = workshopPanel.getWCost();

            tTotal = rcost + dcost + wcost;

            String print = "Total: $" + dollar.format(tTotal);

            JOptionPane.showMessageDialog(null, print);
        }
    }

    private class ExitButtonListener implements ActionListener
    {
        public void actionPerformed(ActionEvent e)
        {
            System.exit(0);
        }
    } // End of inner class
}