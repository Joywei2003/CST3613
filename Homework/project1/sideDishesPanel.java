package project1;

import java.awt.*;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import javax.swing.*;

public class sideDishesPanel extends JPanel
{
    //setting price for each side dish
    private final double salad_cost = 6.50;
    private final double mveg_cost = 9.50;
    private final double potatoes_cost = 5.50;
    private final double rice_cost = 7.75;
    private final double beans_cost = 6.75;
    private final double bread_cost = 4.00;

    double subtotal1 = 0.0;

    //making checkboxes for each side dish
    JCheckBox salad;
    JCheckBox mveg;
    JCheckBox potatoes;
    JCheckBox rice;
    JCheckBox beans;
    JCheckBox bread;

    public sideDishesPanel()
    {
        salad = new JCheckBox("Salad", false);
        mveg = new JCheckBox("Mixed Vegetables", false);
        potatoes = new JCheckBox("Potatoes", false);
        rice = new JCheckBox("Rice",false);
        beans = new JCheckBox("Beans", false);
        bread = new JCheckBox("Bread", false);

        // Create a GridLayout manager.
        setLayout(new GridLayout(6, 1));

        // Create a border.
        setBorder(
                BorderFactory.createTitledBorder("Side Dishes"));

        //adds itemlistener to each check box then adds checkbox to panel
        salad.addItemListener(new  JCheckBoxListener());
        mveg.addItemListener(new  JCheckBoxListener());
        potatoes.addItemListener(new  JCheckBoxListener());
        rice.addItemListener(new  JCheckBoxListener());
        beans.addItemListener(new  JCheckBoxListener());
        bread.addItemListener(new  JCheckBoxListener());

        add(salad);
        add(mveg);
        add(potatoes);
        add(rice);
        add(beans);
        add(bread);
    }

    public class JCheckBoxListener  implements ItemListener
    {
        public void itemStateChanged(ItemEvent check)
        {
            Object source = check.getItem();
            if(source == salad)
            {
                int select = check.getStateChange();
                if(select == ItemEvent.SELECTED)
                    subtotal1 += salad_cost;
                else if(select == ItemEvent.DESELECTED)
                    subtotal1 -= salad_cost;
            }
            else if(source == mveg)
            {
                int select = check.getStateChange();
                if(select == ItemEvent.SELECTED)
                    subtotal1 += mveg_cost;
                else if(select == ItemEvent.DESELECTED)
                    subtotal1 -= mveg_cost;
            }
            else if(source == potatoes)
            {
                int select = check.getStateChange();
                if(select == ItemEvent.SELECTED)
                    subtotal1 += potatoes_cost;
                else if(select == ItemEvent.DESELECTED)
                    subtotal1 -= potatoes_cost;
            }
            else if(source == rice)
            {
                int select = check.getStateChange();
                if(select == ItemEvent.SELECTED)
                    subtotal1 += rice_cost;
                else if(select == ItemEvent.DESELECTED)
                    subtotal1 -= rice_cost;
            }
            else if(source == beans)
            {
                int select = check.getStateChange();
                if(select == ItemEvent.SELECTED)
                    subtotal1 += beans_cost;
                else if(select == ItemEvent.DESELECTED)
                    subtotal1 -= beans_cost;
            }
            else if(source == bread)
            {
                int select = check.getStateChange();
                if(select == ItemEvent.SELECTED)
                    subtotal1 += bread_cost;
                else if(select == ItemEvent.DESELECTED)
                    subtotal1 -= bread_cost;
            }
        }
    }

    public double getSubtotal()
    {
        double subtotal = subtotal1;
        return subtotal;
    }
}