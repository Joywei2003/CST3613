package hw2;
/** 1. Paula’s Portraits
 * Create an application for Paula’s Portraits, a photography studio.
 * Paula’s base price is $40 for a photo session with one person.
 * The in-studio fee is $75 for a session with two or more subjects, and $95 for a session with a pet.
 * A $90 fee is added to take photos on location instead of in the studio.
 * The application allows users to compute the price of a photography session.
 * Include a set of mutually exclusive check boxes to select the portrait subject and another set of mutually exclusive check boxes for the session location.
 * Include labels as appropriate to explain the application’s functionality
 */

public class hw2
{
    public static void main(String[] args)
    {
        hw2part1 aFrame = new hw2part1();
        aFrame.setSize(320,200);
        aFrame.setVisible(true);
    }
}