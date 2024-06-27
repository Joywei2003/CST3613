package project1;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.text.DecimalFormat;

public class greetingsPanel extends JFrame{

    //adds the panels created
    private mainDishesPanel dishesPanel;
    private sideDishesPanel sidesPanel;
    private DessertsPanel dessertPanel;
    private JPanel buttonPanel;         // A panel for the buttons
    private JButton calcButton;         // Calculates everything
    private JButton exitButton;         // Exits the application

    public greetingsPanel ()
    {
        //sets the title of the window
        super("Order Calculator");

        // Specify what happens when the close button is clicked.
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JLabel greeting = new JLabel();

        //creates new panels
        dishesPanel = new mainDishesPanel();
        sidesPanel = new sideDishesPanel();
        dessertPanel = new DessertsPanel();

        // Build the panel that contains the buttons.
        buildButtonPanel();

        //adds the panels and label to the frame
        add(greeting = new JLabel("Welcome to Sunrise Specialty Catering"), BorderLayout.CENTER);
        greeting.setForeground(Color.black);
        add(dishesPanel, BorderLayout.WEST);
        dishesPanel.setBackground(Color.decode("#c3d7e3"));
        add(sidesPanel, BorderLayout.CENTER);
        sidesPanel.setBackground(Color.decode("#c3d7e3"));
        add(dessertPanel, BorderLayout.EAST);
        dessertPanel.setBackground(Color.decode("#c3d7e3"));
        add(buttonPanel, BorderLayout.SOUTH);
        //buttonPanel.setBackground(Color.decode();

        pack();
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
            double mcost, sdcost, dcost;
            double subtotalCharges, tax, tTotal;

            // Create a DecimalFormat object to format output.
            DecimalFormat dollar = new DecimalFormat();

            // Get the applicable rate.
            mcost = dishesPanel.getMCost();
            sdcost = sidesPanel.getSubtotal();
            dcost = dessertPanel.getDCost();

            subtotalCharges = mcost + sdcost + dcost;
            tax = subtotalCharges * 0.06;
            tTotal = tax + subtotalCharges;

            String print = "Subtotal: $" + dollar.format(subtotalCharges)+ "\nTax: $" + dollar.format(tax)+ "\nTotal: $" + dollar.format(tTotal);

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