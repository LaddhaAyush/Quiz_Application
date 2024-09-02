package quiz.application;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

import static quiz.application.Sports.answers;
import static quiz.application.Sports.questions;
public class Score extends JFrame  {

    Score(String name, int score) {
        setBounds(400, 150, 750, 550);
        getContentPane().setBackground(Color.WHITE);
        setLayout(null);

        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/score.png"));
        Image i2 = i1.getImage().getScaledInstance(300, 250, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(0, 200, 300, 250);
        add(image);

        JLabel heading = new JLabel("Thankyou " + name + " for playing Simple Minds");
        heading.setBounds(45, 30, 700, 30);
        heading.setFont(new Font("Tahoma", Font.PLAIN, 26));
        add(heading);

        JLabel lblscore = new JLabel("Your score is " + score);
        lblscore.setBounds(350, 200, 300, 30);
        lblscore.setFont(new Font("Tahoma", Font.PLAIN, 26));
        add(lblscore);

        JButton submit = new JButton("Play Again");
        submit.setBounds(380, 270, 120, 30);
        submit.setBackground(new Color(30, 144, 255));
        submit.setForeground(Color.WHITE);

        add(submit);

        JButton viewanswers = new JButton("View Answers");
        viewanswers.setBounds(380, 320, 120, 30);
        viewanswers.setBackground(new Color(30, 144, 255));
        viewanswers.setForeground(Color.WHITE);

        add(viewanswers);
        setVisible(true);
        submit.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                setVisible(false);
                new Login();

            }
        });
        viewanswers.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new QuizResultFrame(Sports.questions, Sports.answers).setVisible(true);
                setVisible(false);
            }
        });

        viewanswers.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new QuizResultFrame(questions, answers).setVisible(true);
                setVisible(false);
            }
        });
    }
    public Score(String[][] questions, String[][] answers, String name, int score) {
        // Initialize the class with questions, answers, name, and score.
        // You can add your initialization code here.
        String showquestions[][] = questions;
        String showanswers[][] = answers;

        setBounds(400, 150, 750, 550);
        getContentPane().setBackground(Color.WHITE);
        setLayout(null);

        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/score.png"));
        Image i2 = i1.getImage().getScaledInstance(300, 250, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(0, 200, 300, 250);
        add(image);

        JLabel heading = new JLabel("Thankyou " + name + " for playing Simple Minds");
        heading.setBounds(45, 30, 700, 30);
        heading.setFont(new Font("Tahoma", Font.PLAIN, 26));
        add(heading);

        JLabel lblscore = new JLabel("Your score is " + score);
        lblscore.setBounds(350, 200, 300, 30);
        lblscore.setFont(new Font("Tahoma", Font.PLAIN, 26));
        add(lblscore);

        JButton submit = new JButton("Play Again");
        submit.setBounds(380, 270, 120, 30);
        submit.setBackground(new Color(30, 144, 255));
        submit.setForeground(Color.WHITE);

        add(submit);

        JButton viewanswers = new JButton("View Answers");
        viewanswers.setBounds(380, 320, 120, 30);
        viewanswers.setBackground(new Color(30, 144, 255));
        viewanswers.setForeground(Color.WHITE);

        add(viewanswers);

        setVisible(true);
        submit.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                setVisible(false);
                new Login();

            }
        });




        viewanswers.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new QuizResultFrame(questions, answers).setVisible(true);
                setVisible(false);
            }
        });

        viewanswers.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new QuizResultFrame(questions, answers).setVisible(true);
                setVisible(false);
            }
        });

    }
    public static void main(String[] args) {
        new Score("User", 0);
    }
}
