/**
 * Author: Kyle Evangelisto
 *
 * December 26 2019
 *
 * Purpose: Convert Strings entered by the user via GUI is converted
 * to upper or lower case depending on what the user would like.
 *
 * import statements below
 *
 */

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GUI extends JPanel {
    GridBagConstraints layout = new GridBagConstraints(); //creates a new Grid Layout to position buttons and text areas
    private JTextArea input, output; //declerations for new text areas
    private JButton convertUp, convertDown; //declerations for new convert buttons

    /**
     * Constructor:
     *
     * sets new layout, creates window size and color.
     *
     * method calls method is called
     */
    public GUI(){
        setLayout(new GridBagLayout());
        layout.insets = new Insets(10,10,10,10);
        Color color = new Color(13, 168, 239);
        setBackground(color);
        setPreferredSize(new Dimension(800,600));
        methodCalls();
    }

    /**
     * Constrains and adds elements to the frame
     *
     * method calls has the name "method calls" because this method
     * used to be 4 different methods that I combined into one.
     */
    private void methodCalls(){

        input = new JTextArea(5,15);
        input.setText("Enter text here.");
        input.setEnabled(true);
        layout.gridx = -1;
        layout.gridy = 0;
        add(input,layout);
        input.setLineWrap(true);


        output = new JTextArea(5,15);
        output.setEditable(false);
        layout.gridx = 1;
        layout.gridy = 0;
        add(output,layout);
        output.setLineWrap(true);



        convertUp = new JButton("Convert Up");
        convertUp.setEnabled(true);
        convertUp.addActionListener(new convertUpLogic());
        layout.gridx = 3;
        layout.gridy = 0;
        add(convertUp, layout);



        convertDown = new JButton("Convert Down");
        convertDown.setEnabled(true);
        convertDown.addActionListener(new convertDownLogic());
        layout.gridx = 3;
        layout.gridy = -1;
        add(convertDown, layout);

    }

    /**
     *
     * Conversion logic for when the ConverUp button is pressed (simple)
     *
     */
    private class convertUpLogic implements ActionListener{
        public void actionPerformed(ActionEvent actionEvent){
            output.setText(input.getText().toUpperCase());
            System.out.println("Converted to upperCase");
            }
        }
    /**
     *
     * Conversion logic for when the ConvertDown button is pressed (simple)
     *
     */
    private class convertDownLogic implements ActionListener{
        public void actionPerformed(ActionEvent actionEvent){
            output.setText(input.getText().toLowerCase());
            System.out.println("Converted to lowerCase");
        }
    }


}
