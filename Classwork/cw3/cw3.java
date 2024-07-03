package cw3;

/**JVacation_Rental - Feb 14 2024
 Write an application for Lambert’s Vacation Rentals.
 Use separate  ButtonGroups to allow a client to select one of three locations, the number of bedrooms, and whether meals are included in the rental.
 Assume that the locations are parkside for $600 per week, poolside for $750 per week, or lakeside for $825 per week.
 Assume that the rentals have one, two, or three bedrooms and that each bedroom over one adds $75 to the base price.
 Assume that if meals are added, the price is $200 more per rental.
 */
public class cw3 {
    public static void main(String[] args) {
        cw3part1 aFrame = new cw3part1();
        aFrame.setSize(320,200);
        aFrame.setVisible(true);
    }
}