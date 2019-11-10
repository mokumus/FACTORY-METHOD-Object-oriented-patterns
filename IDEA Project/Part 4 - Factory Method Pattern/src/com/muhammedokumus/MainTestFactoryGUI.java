package com.muhammedokumus;

import javax.swing.*;
import java.awt.event.*;
import static com.muhammedokumus.PlaneFactory.*;


/**
 * Provides a GUI for testing the plane factory
 */
class MainTestFactoryGUI extends JFrame implements ActionListener {
    private JRadioButton rb1, rb2, rb3;
    private JButton buildButton;

    private MainTestFactoryGUI() {
        rb1 = new JRadioButton("TPX100");
        rb1.setBounds(10, 10, 75, 30);
        rb2 = new JRadioButton("TPX200");
        rb2.setBounds(85, 10, 75, 30);
        rb3 = new JRadioButton("TPX300");
        rb3.setBounds(2*85 - 10, 10, 75, 30);

        ButtonGroup bg = new ButtonGroup();

        bg.add(rb1);
        bg.add(rb2);
        bg.add(rb3);

        buildButton = new JButton("Build");
        buildButton.setBounds(85, 50, 75, 30);
        buildButton.addActionListener(this);

        add(rb1);
        add(rb2);
        add(rb3);
        add(buildButton);

        setSize(3*85, 125);
        setLayout(null);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        if (rb1.isSelected() && buildButton.getModel().isArmed()) {
            Plane tpx100 = buildTPX100();
            planeRecipient(tpx100);
        }
        if (rb2.isSelected() && buildButton.getModel().isArmed()) {
            Plane tpx200 = buildTPX200();
            planeRecipient(tpx200);
        }
        if (rb3.isSelected() && buildButton.getModel().isArmed()) {
            Plane tpx300 = buildTPX300();
            planeRecipient(tpx300);
        }
    }


    private void planeRecipient(Plane p){
        JOptionPane.showMessageDialog(this, p.toString(),
                "Suit Receipt",
                JOptionPane.INFORMATION_MESSAGE);
    }

    public static void main(String[] args) {
        new MainTestFactoryGUI();
    }
}