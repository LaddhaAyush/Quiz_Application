package quiz.application;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class DomainSelection extends JFrame implements ActionListener {

    JButton entertainmentButton, educationButton, sportsButton, gkButton;

    DomainSelection(String name) {
        getContentPane().setBackground(Color.WHITE);
        setLayout(null);

        ImageIcon background = new ImageIcon(ClassLoader.getSystemResource("icons/login.jpeg"));
        JLabel backgroundImage = new JLabel(background);
        backgroundImage.setBounds(0, 0, 600, 500);
        add(backgroundImage);

        JLabel heading = new JLabel("Select a Domain");
        heading.setBounds(750, 60, 300, 45);
        heading.setFont(new Font("Viner Hand ITC", Font.BOLD, 30));
        heading.setForeground(new Color(30, 144, 254));
        add(heading);

        entertainmentButton = new JButton("Entertainment");
        entertainmentButton.setBounds(735, 150, 200, 30);
        entertainmentButton.setBackground(new Color(30, 144, 254));
        entertainmentButton.setForeground(Color.WHITE);
        entertainmentButton.addActionListener(this);
        add(entertainmentButton);

        educationButton = new JButton("Education");
        educationButton.setBounds(735, 200, 200, 30);
        educationButton.setBackground(new Color(30, 144, 254));
        educationButton.setForeground(Color.WHITE);
        educationButton.addActionListener(this);
        add(educationButton);

        sportsButton = new JButton("Sports");
        sportsButton.setBounds(735, 250, 200, 30);
        sportsButton.setBackground(new Color(30, 144, 254));
        sportsButton.setForeground(Color.WHITE);
        sportsButton.addActionListener(this);
        add(sportsButton);

        gkButton = new JButton("General Knowledge");
        gkButton.setBounds(735, 300, 200, 30);
        gkButton.setBackground(new Color(30, 144, 254));
        gkButton.setForeground(Color.WHITE);
        gkButton.addActionListener(this);
        add(gkButton);

        setSize(1200, 500);
        setLocation(200, 150);
        setVisible(true);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public void actionPerformed(ActionEvent ae) {
        if (ae.getSource() == entertainmentButton) {
            // Handle the Entertainment domain selection
            setVisible(false);
            // You can navigate to the corresponding quiz page or implement your logic here.
            new Entertainment(getName());

        } else if (ae.getSource() == educationButton) {
            // Handle the Education domain selection
            setVisible(false);
            // You can navigate to the corresponding quiz page or implement your logic here.
            new Education(getName());
        } else if (ae.getSource() == sportsButton) {
            // Handle the Sports domain selection
            setVisible(false);
            // You can navigate to the corresponding quiz page or implement your logic here.
            new Sports(getName());

        } else if (ae.getSource() == gkButton) {
            // Handle the General Knowledge domain selection
            setVisible(false);
            // You can navigate to the corresponding quiz page or implement your logic here.
            new GK(getName());

        }
    }

    public static void main(String[] args) {
        new DomainSelection("Player Name");
    }
}
