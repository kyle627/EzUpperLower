import javax.swing.*;

/**
 *
 *
 * Main method
 *
 */
public class Driver {
    public static void main(String[] args){
        JFrame frame = new JFrame("SpaceSound-X");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        GUI gui = new GUI();
        frame.getContentPane().add(gui);
        frame.pack();
        frame.setVisible(true);
        frame.setResizable(false);
    }
}
