package hw2;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class hw2part1 extends JFrame {
    FlowLayout flow = new FlowLayout();
    final int onePerson = 40, twoOrMore = 75, withPet = 95;
    final int inStudio = 0, onLocation = 90;
    int total = 0;

    ButtonGroup subjectsGrp = new ButtonGroup();
        JCheckBox oneBox = new JCheckBox("One person", false);
        JCheckBox twoBox = new JCheckBox("Two or more people", false);
        JCheckBox petBox = new JCheckBox("With pet", false);

    ButtonGroup locationGrp = new ButtonGroup();
        JCheckBox studioBox = new JCheckBox("In studio", false);
        JCheckBox locationBox = new JCheckBox("On location", false);

    JTextField totalPrice = new JTextField(10);
    String output;

    public hw2part1() {
        super("Paula’s Portraits, photography studio.");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(flow);
        subjectsGrp.add(oneBox);
        oneBox.addItemListener(new JCheckBoxListener());
        subjectsGrp.add(twoBox);
        twoBox.addItemListener(new JCheckBoxListener());
        subjectsGrp.add(petBox);
        petBox.addItemListener(new JCheckBoxListener());

        locationGrp.add(studioBox);
        studioBox.addItemListener(new JCheckBoxListener());
        locationGrp.add(locationBox);
        locationBox.addItemListener(new JCheckBoxListener());

        add(oneBox);
        add(twoBox);
        add(petBox);
        add(studioBox);
        add(locationBox);
        add(totalPrice);
        totalPrice.setText("0");
    }

    public class JCheckBoxListener implements ItemListener
    {
        public void itemStateChanged(ItemEvent check)
        {
            Object source = check.getItem();
            if (source == oneBox)
            {
                int select = check.getStateChange();
                if (select == ItemEvent.SELECTED)
                {
                    total += onePerson;
                }
                else if (select == ItemEvent.DESELECTED)
                {
                    total -= onePerson;
                }
                output = " " + total;
                totalPrice.setText(output);
            }
            if (source == twoBox)
            {
                int select = check.getStateChange();
                if (select == ItemEvent.SELECTED)
                {
                    total += twoOrMore;
                }
                else if (select == ItemEvent.DESELECTED)
                {
                    total -= twoOrMore;
                }
                output = " " + total;
                totalPrice.setText(output);
            }
            if (source == petBox)
            {
                int select = check.getStateChange();
                if (select == ItemEvent.SELECTED)
                {
                    total += withPet;
                }
                else if (select == ItemEvent.DESELECTED)
                {
                    total -= withPet;
                }
                output = " " + total;
                totalPrice.setText(output);
            }
            if (source == studioBox)
            {
                int select = check.getStateChange();
                if (select == ItemEvent.SELECTED)
                {
                    total += inStudio;
                }
                else if (select == ItemEvent.DESELECTED)
                {
                    total -= inStudio;
                }
                output = " " + total;
                totalPrice.setText(output);
            }
            if (source == locationBox)
            {
                int select = check.getStateChange();
                if (select == ItemEvent.SELECTED)
                {
                    total += onLocation;
                }
                else if (select == ItemEvent.DESELECTED)
                {
                    total -= onLocation;
                }
                output = " " + total;
                totalPrice.setText(output);
            }
        }
    }
}