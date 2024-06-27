package project1;
import java.awt.*;
import javax.swing.*;

public class DessertsPanel extends JPanel
{
    //setting price for each dessert
    private final double no_dessert = 0.00;
    private final double choccake_cost = 2.25;
    private final double applepie_cost = 1.50;
    private final double pudding_cost = 2.50;

    //making radio buttons for each dessert
    JRadioButton none;
    JRadioButton choccake;
    JRadioButton applepie;
    JRadioButton pudding;

    public DessertsPanel ()
    {
        none = new JRadioButton("No Dessert", false);
        choccake = new JRadioButton("Chocolate Cake", false);
        applepie = new JRadioButton("Apple Pie", false);
        pudding = new JRadioButton("ButterScotch Pudding", false);

        // Create a GridLayout manager.
        setLayout(new GridLayout(4, 1));

        // Create a border.
        setBorder(BorderFactory.createTitledBorder("Desserts"));

        add(none);
        add(choccake);
        add(applepie);
        add(pudding);
    }

    //gets the cost of each dessert
    public double getDCost()
    {
        double dcost = 0.0;
        if (none.isSelected())
            dcost = no_dessert;
        else if (choccake.isSelected())
            dcost = choccake_cost;
        else if (applepie.isSelected())
            dcost = applepie_cost;
        else if (pudding.isSelected())
            dcost = pudding_cost;
        return dcost;
    }
}