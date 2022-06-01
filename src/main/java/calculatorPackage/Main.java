package calculatorPackage;

import javax.swing.SwingUtilities;

/**
 * The Main class that contains public static void main(String[] args)
 *
 * @author Jugveer Sandher
 */
public class Main {

    /**
     * The main method that creates a Calculator object and runs the logic
     */
    public static void main(String[] args) {
            SwingUtilities.invokeLater(Main::createAndShowGUI);
    }

    /**
     * Checks if the number is an Integer
     * @param number
     * @return
     */
    private static boolean isInt(String number) {
        try {
            Integer.parseInt(number);
        } catch (Exception ex) {
            return false;
        }
        return true;
    }

    /**
     * Initializes the GUI
     */
    private static void createAndShowGUI()
    {
        final CalculatorFrame frame;

        frame = new CalculatorFrame();
        frame.init();
    }
}