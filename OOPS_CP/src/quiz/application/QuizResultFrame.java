package quiz.application;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
//import java.awt.event.ActionEvent;
//import java.awt.event.ActionListener;
public class QuizResultFrame extends JFrame {
    private JTextArea resultTextArea;

    public QuizResultFrame(String[][] questions, String[][] answers) {
        setTitle("Answers");
        setSize(800, 600);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        getContentPane().setBackground(Color.WHITE);
        getContentPane().setForeground(Color.RED);

        resultTextArea = new JTextArea();
        resultTextArea.setEditable(false);
        resultTextArea.setFont(new Font("Thoma", Font.PLAIN, 17));

        // Create a scroll pane with a mint blue background
        JScrollPane scrollPane = new JScrollPane(resultTextArea);
        scrollPane.getViewport().setBackground(new Color(173, 216, 230)); // Mint Blue
        add(scrollPane);

        displayResults(questions, answers);

        // Create a panel for the "Play Again" button
        JPanel buttonPanel = new JPanel();
        JButton playAgainButton = new JButton("Play Again!!!");
        playAgainButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Navigate back to the home page
                setVisible(false);
                new DomainSelection("Player Name");
            }
        });
        buttonPanel.add(playAgainButton);

        // Add the button panel to the SOUTH region of the frame
        add(buttonPanel, BorderLayout.SOUTH);
    }

    public void displayResults(String[][] questions, String[][] answers) {
        StringBuilder resultText = new StringBuilder("Answers:\n\n");
        for (int i = 0; i < questions.length; i++) {
            resultText.append("Question ").append(i + 1).append(": ").append(questions[i][0]).append("\n");
            resultText.append("Answer: ").append(answers[i][1]).append("\n\n");
        }
        resultTextArea.setText(resultText.toString());
    }
}

