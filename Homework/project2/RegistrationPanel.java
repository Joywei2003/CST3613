package project2;
import java.awt.*;
import javax.swing.*;
public class RegistrationPanel extends JPanel
{
    //Setting price for registration type
    private final double general_cost = 895.00;
    private final double student_cost = 495.00;

    //Making radio buttons for registration type

    private JRadioButton general;
    private JRadioButton student;

    public RegistrationPanel()
    {
        general = new JRadioButton("General Registration", false);
        student = new JRadioButton("Student Registration", false);

        // Create a GridLayout manager.
        setLayout(new GridLayout(2, 1));

        // Create a border.
        setBorder(BorderFactory.createTitledBorder("Registration Type"));

        //adds each radio button
        add(general);
        add(student);

        setVisible(true);
    }

    //gets the cost of each main dish
    public double getRCost()
    {
        double mcost = 0.0;

        if (general.isSelected())
            mcost = general_cost;
        else if (student.isSelected())
            mcost = student_cost;
        return mcost;

    }
}