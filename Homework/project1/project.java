package project1;
import javax.swing.*;
/** Sunrise Specialty Catering - Due 03.14.2024
 Sunrise Specialty Catering House has a food and deserts delivery service for the businesses in the neighborhood.
 (Here is a complete price list:
        Main Dishes: Beef_Meat_Loaf  $70.00, BBQ_Chicken_Pieces $60.00 , Grilled_Salmon $20.00 , Pasta_Prima_Vera $40.00 .
        Side Dishes : Salad $6.50 , Mixed vegetables $9.50, Potatoes $5.50, Rice_Dishes $ 7.75, Beans $ 6.75, Bread $4.00
        Desserts : No_Dessert $ 0.0, Chocolate cake $2.25, Apple pie $ 1.50, Butterscotch pudding $2.50.
 The owner needs an “order calculator “application that the staff can use to calculate the price of an order as it is called in.
 The application should display the subtotal, the amount of a 6 percent sales tax, and the total of the order.
 The user selects the type of Main dishes, Side dishes, and desserts, and then clicks the Calculate button.
 A dialog box appears displaying the subtotal, amount of sales tax, and total.
 The user can exit the application by clicking the Exit button.
 The layout can be achieved using a BorderLayout manager with the window’s content pane.

 To construct this window create the following specialized panel classes that are extended from JPanel :
 •	GreetingsPanel. This panel contains the label that appears in the window’s north region.
 •	MainDishesPanel. This panel contains the radio buttons for the types of main dishes.
 •	SideDishesPanel. This panel contains the check boxes for the types of side dishes.
 •	DessertsPanel. The panel contains the radio buttons for the desserts selections.
 After theses classes have been created, you can create objects from them and add the objects to the correct regions of the window’s content pane.
 Use at least two different colors in your application.
 */
public class project extends JFrame
{
        public static void main(String[] args)
        {
        greetingsPanel ld = new greetingsPanel();
        }
}