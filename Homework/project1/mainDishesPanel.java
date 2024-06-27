package project1;

import java.awt.*;
import javax.swing.*;
public class mainDishesPanel extends JPanel
{
    //Setting price for each main dish
    private final double beef_cost = 70.00;
    private final double chicken_cost = 60.00;
    private final double salmon_cost = 20.00;
    private final double pasta_cost = 40.00;

    //Making radio buttons for each main dish
    private JRadioButton beef;
    private JRadioButton chicken;
    private JRadioButton salmon;
    private JRadioButton pasta;

    public mainDishesPanel()
    {
        beef = new JRadioButton("Beef Meat Loaf", false);
        chicken = new JRadioButton("BBQ Chicken Pieces ", false);
        salmon = new JRadioButton("Grilled Salmon", false);
        pasta = new JRadioButton("Pasta Prima sVera", false);

        // Create a GridLayout manager.
        setLayout(new GridLayout(4, 1));

        // Create a border.
        setBorder(BorderFactory.createTitledBorder("Main Dishes"));

        //adds each radio button
        add(beef);
        add(chicken);
        add(salmon);
        add(pasta);

        setVisible(true);
    }

    //gets the cost of each main dish
    public double getMCost()
    {
        double mcost = 0.0;

        if (beef.isSelected())
            mcost = beef_cost;
        else if (chicken.isSelected())
            mcost = chicken_cost;
        else if (salmon.isSelected())
            mcost = salmon_cost;
        else if (pasta.isSelected())
            mcost = pasta_cost;
        return mcost;

    }
}