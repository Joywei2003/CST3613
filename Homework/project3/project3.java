package project3;
import javax.swing.JFrame;

public class project3 extends JFrame
{
    /**
     * Declare a subclass of JPanel called MyColorChooser that provides three JSlider objects and three JTextFields objects.
     * Each JSlider represents the values from 0 to 255 for the red, green, and blue parts of a color.
     * Use these values as the arguments to the Color constructor to create a new Color object.
     * Display the current value of each JSlider in the corresponding JTextField.
     * When the user changes the value of the JSlider, the JTextField should be changed accordingly.
     * Use your new GUI component as part of an application that displays the current Color value by drawing a filled rectangle.
     */

    MyColorChooser myColorChooser;
    public project3 ()
    {
        //creates new panels
        myColorChooser = new MyColorChooser();
        add(myColorChooser);
    }
    public static void main(String[] args)
    {
        project3 gui = new project3();
        gui.setTitle("Color Chooser");
        gui.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        gui.setVisible(true);
    }
}