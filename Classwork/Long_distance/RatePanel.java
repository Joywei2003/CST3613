package Long_distance;
import java.awt.*;
import javax.swing.*;
import java.text.DecimalFormat;

// Long Distance Calls

public class RatePanel extends JPanel
{
    // Named constants for rates
    private final double DAYTIME_RATE = 0.07;
    private final double EVENING_RATE = 0.12;
    private final double OFF_PEAK_RATE = 0.05;

    private JRadioButton daytime; // Radio button for daytime rate
    private JRadioButton evening; // Radio button for evening rate
    private JRadioButton offPeak; // Radio button for off peak rate
    private ButtonGroup bg;       // Radio button group

    public RatePanel()
    {
        // Create a DecimalFormat object.
        DecimalFormat dollar = new DecimalFormat("#,##0.00");

        // Create the radio buttons.
        daytime = new JRadioButton("Daytime ($" +
                dollar.format(DAYTIME_RATE) + " per minute)");
        evening = new JRadioButton("Evening ($" +
                dollar.format(EVENING_RATE) + " per minute)");
        offPeak = new JRadioButton("Off-Peak ($" +
                dollar.format(OFF_PEAK_RATE) + " per minute)");

        // Group the radio buttons.
        bg = new ButtonGroup();
        bg.add(daytime);
        bg.add(evening);
        bg.add(offPeak);

        // Create a GridLayout manager.
        setLayout(new GridLayout(3, 1));

        // Create a border.
        setBorder(BorderFactory.createTitledBorder("Select a Rate Category"));

        // Add the radio buttons to this panel.
        add(daytime);
        add(evening);
        add(offPeak);
    }

    public double getRate()
    {
        double rate = 0.0;
        if (daytime.isSelected())
            rate = DAYTIME_RATE;
        else if (evening.isSelected())
            rate = EVENING_RATE;
        else if (offPeak.isSelected())
            rate = OFF_PEAK_RATE;

        return rate;
    }
}
