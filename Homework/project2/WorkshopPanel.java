package project2;

import javax.swing.*;

public class WorkshopPanel extends JPanel
{
    private final double ecommerce_cost = 295.00;
    private final double web_cost = 295.00;
    private final double java_cost = 395.00;
    private final double networking_cost = 395.00;

    private JList workshopList;         // To hold workshop

    private String[] workshopName = {
            "Introduction to E-commerce",
            "The Future of the Web",
            "Advanced Java Programming",
            "Network Security"};
    public WorkshopPanel()
    {
        workshopList = new JList(workshopName);

        // Set the selection mode to multiple  interval selection.
        workshopList.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);

        add(workshopList);
        setBorder(BorderFactory.createTitledBorder("Pre-conference workshops"));
    }
    public double getWCost() {

        double cost = 0.0;

        Object[] selections = workshopList.getSelectedValues();
        if(selections !=null)
        {
            for (int i =0; i < selections.length; i++)
            {
                if (selections[i].equals(workshopName[0]))
                    cost += ecommerce_cost;
                else if (selections[i].equals(workshopName[1]))
                    cost += web_cost;
                else if (selections[i].equals(workshopName[2]))
                    cost += java_cost;
                else if (selections[i].equals(workshopName[3]))
                    cost += networking_cost;
            }
        }
        return cost;
    }
}