package project3;
import javax.swing.*;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import java.awt.*;

public class MyColorChooser extends JPanel {
    JPanel colorPanel;
    JPanel sliderPanel;
    JPanel valuePanel;

    JSlider redSlider;
    JSlider greenSlider;
    JSlider blueSlider;

    JTextField redValue;
    JTextField greenValue;
    JTextField blueValue;

    JLabel red;
    JLabel green;
    JLabel blue;

    public MyColorChooser() {
        colorPanel = new JPanel();
        sliderPanel = new JPanel();
        valuePanel = new JPanel();

        red = new JLabel("Red: ");
        green = new JLabel("Green: ");
        blue = new JLabel("Blue: ");

        redSlider = new JSlider(0, 255, 0);
        redSlider.setPaintTicks(true);
        greenSlider = new JSlider(0, 255, 0);
        greenSlider.setPaintTicks(true);
        blueSlider = new JSlider(0, 255, 0);
        blueSlider.setPaintTicks(true);

        redValue = new JTextField("0", 10);
        redValue.setEditable(false);
        greenValue = new JTextField("0", 10);
        greenValue.setEditable(false);
        blueValue = new JTextField("0", 10);
        blueValue.setEditable(false);

        redSlider.addChangeListener(new SliderListener());
        greenSlider.addChangeListener(new SliderListener());
        blueSlider.addChangeListener(new SliderListener());

        setLayout(new GridLayout(4,3));
        add(colorPanel);
        add(sliderPanel);
        add(valuePanel);

        add(red);
        add(green);
        add(blue);

        add(redSlider);
        add(greenSlider);
        add(blueSlider);

        add(redValue);
        add(greenValue);
        add(blueValue);
    }

    private class SliderListener implements ChangeListener {
        public void stateChanged(ChangeEvent e)
        {
            int red,green,blue;

            red =  redSlider.getValue();
            green = greenSlider.getValue();
            blue =  blueSlider.getValue();

            redValue.setText(Integer.toString(red));
            greenValue.setText(Integer.toString(green));
            blueValue.setText(Integer.toString(blue));

            Color change = new Color(red,green,blue);
            colorPanel.setBackground(change);
        }
    }
}

