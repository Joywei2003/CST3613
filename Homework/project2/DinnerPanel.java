package project2;

import java.awt.*;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import javax.swing.*;

public class DinnerPanel extends JPanel
{
    //setting price
    private final double dinner_cost = 30.00;
    double subtotal1 = 0.0;

    //making checkboxes
    JCheckBox dinner;


    public DinnerPanel()
    {
        dinner = new JCheckBox("Dinner w/ keynote speech", false);


        // Create a GridLayout manager.
        setLayout(new GridLayout(1, 1));

        // Create a border.
        setBorder(
                BorderFactory.createTitledBorder("Dinner with a keynote speech"));

        //adds itemlistener to each check box then adds checkbox to panel
        dinner.addItemListener(new JCheckBoxListener());
        add(dinner);

    }

    public class JCheckBoxListener  implements ItemListener
    {
        public void itemStateChanged(ItemEvent check)
        {
            Object source = check.getItem();
            if(source == dinner)
            {
                int select = check.getStateChange();
                if(select == ItemEvent.SELECTED)
                    subtotal1 += dinner_cost;
                else if(select == ItemEvent.DESELECTED)
                    subtotal1 -= dinner_cost;
            }
        }
    }

    public double getDCost()
    {
        double subtotal = subtotal1;
        return subtotal;
    }
}