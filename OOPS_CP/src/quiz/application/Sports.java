package quiz.application;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Sports extends JFrame implements ActionListener {


    static String[][] questions = new String[10][5];
    static String[][] answers = new String[10][2];
    String useranswers[][] = new String[10][1];
    JLabel qno, question;
    JRadioButton opt1, opt2, opt3, opt4;
    ButtonGroup groupoptions;
    JButton next, submit, lifeline;

    public static int timer = 15;
    public static int ans_given = 0;
    public static int count = 0;
    public static int score = 0;

    String name;

    Sports(String name) {
        this.name = name;
        setBounds(50, 0, 1440, 850);
        getContentPane().setBackground(Color.WHITE);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        setLayout(null);

        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/quiz.jpg"));
        JLabel image = new JLabel(i1);
        image.setBounds(0, 0, 1440, 392);
        add(image);

        qno = new JLabel();
        qno.setBounds(100, 450, 50, 30);
        qno.setFont(new Font("Tahoma", Font.PLAIN, 24));
        add(qno);

        question = new JLabel();
        question.setBounds(150, 450, 900, 30);
        question.setFont(new Font("Tahoma", Font.PLAIN, 24));
        add(question);

        questions[0][0] = "How many squares are there on a standard chessboard?";
        questions[0][1] = "64";
        questions[0][2] = "32";
        questions[0][3] = "60";
        questions[0][4] = "72";

        questions[1][0] = "Which chess piece can only move diagonally?";
        questions[1][1] = "Bishop";
        questions[1][2] = "Rook";
        questions[1][3] = "Knight";
        questions[1][4] = "Pawn";

        questions[2][0] = "How many points does Queen have ? ";
        questions[2][1] = "9";
        questions[2][2] = "5";
        questions[2][3] = "3";
        questions[2][4] = "1";


        questions[3][0] = "What is the most powerful piece in chess in terms of movement on the board?";
        questions[3][1] = "Queen";
        questions[3][2] = "King";
        questions[3][3] = "Rook";
        questions[3][4] = "Knight";

        questions[4][0] = "In chess, what does the term 'castling' refer to?";
        questions[4][1] = "A special king and rook move";
        questions[4][2] = "A pawn promotion";
        questions[4][3] = "A pawn capture";
        questions[4][4] = "A checkmate maneuver";

        questions[5][0] = "Who is considered one of the greatest chess players of all time and held the World Chess Championship title for 20 years?";
        questions[5][1] = "Emanuel Lasker";
        questions[5][2] = "Anatoly Karpov";
        questions[5][3] = "Mikhail Tal";
        questions[5][4] = "Bobby Fischer";

        questions[6][0] = "In chess, what is the term for a situation in which the king is in check and there are no legal moves to escape the check?";
        questions[6][1] = "Checkmate";
        questions[6][2] = "Stalemate";
        questions[6][3] = "Check";
        questions[6][4] = "Endgame";

        questions[7][0] = "How many squares does a knight move in a single turn?";
        questions[7][1] = "L-shape, 2 and then 1";
        questions[7][2] = "Straight, any number of squares";
        questions[7][3] = "Diagonal, any number of squares";
        questions[7][4] = "It cannot move";

        questions[8][0] = "What is the term for a chess game ending in a draw where neither player wins?";
        questions[8][1] = "Draw";
        questions[8][2] = "Tie";
        questions[8][3] = "Resignation";
        questions[8][4] = "Victory";

        questions[9][0] = "Who was the first officially recognized World Chess Champion, holding the title from 1886 to 1894?";
        questions[9][1] = "Wilhelm Steinitz";
        questions[9][2] = "José Capablanca";
        questions[9][3] = "Alexander Alekhine";
        questions[9][4] = "Emanuel Lasker";

        answers[0][1] = "64";
        answers[1][1] = "Bishop";
        answers[2][1] = "9";
        answers[3][1] = "Queen";
        answers[4][1] = "A special king and rook move";
        answers[5][1] = "Bobby Fischer";
        answers[6][1] = "Checkmate";
        answers[7][1] = "L-shape, 2 and then 1";
        answers[8][1] = "Draw";
        answers[9][1] = "Wilhelm Steinitz";


        opt1 = new JRadioButton();
        opt1.setBounds(170, 520, 700, 30);
        opt1.setBackground(Color.WHITE);
        opt1.setFont(new Font("Dialog", Font.PLAIN, 20));
        add(opt1);

        opt2 = new JRadioButton();
        opt2.setBounds(170, 560, 700, 30);
        opt2.setBackground(Color.WHITE);
        opt2.setFont(new Font("Dialog", Font.PLAIN, 20));
        add(opt2);

        opt3 = new JRadioButton();
        opt3.setBounds(170, 600, 700, 30);
        opt3.setBackground(Color.WHITE);
        opt3.setFont(new Font("Dialog", Font.PLAIN, 20));
        add(opt3);

        opt4 = new JRadioButton();
        opt4.setBounds(170, 640, 700, 30);
        opt4.setBackground(Color.WHITE);
        opt4.setFont(new Font("Dialog", Font.PLAIN, 20));
        add(opt4);

        groupoptions = new ButtonGroup();
        groupoptions.add(opt1);
        groupoptions.add(opt2);
        groupoptions.add(opt3);
        groupoptions.add(opt4);

        next = new JButton("Next");
        next.setBounds(1100, 550, 200, 40);
        next.setFont(new Font("Tahoma", Font.PLAIN, 22));
        next.setBackground(new Color(30, 144, 255));
        next.setForeground(Color.WHITE);
        next.addActionListener(this);
        add(next);

        lifeline = new JButton("50-50 Lifeline");
        lifeline.setBounds(1100, 630, 200, 40);
        lifeline.setFont(new Font("Tahoma", Font.PLAIN, 22));
        lifeline.setBackground(new Color(30, 144, 255));
        lifeline.setForeground(Color.WHITE);
        lifeline.addActionListener(this);
        add(lifeline);

        submit = new JButton("Submit");
        submit.setBounds(1100, 710, 200, 40);
        submit.setFont(new Font("Tahoma", Font.PLAIN, 22));
        submit.setBackground(new Color(30, 144, 255));
        submit.setForeground(Color.WHITE);
        submit.addActionListener(this);
        submit.setEnabled(false);
        add(submit);

        start(count);

        setVisible(true);
    }

    public void actionPerformed(ActionEvent ae) {
        if (ae.getSource() == next) {
            repaint();
            opt1.setEnabled(true);
            opt2.setEnabled(true);
            opt3.setEnabled(true);
            opt4.setEnabled(true);

            ans_given = 1;
            if (groupoptions.getSelection() == null) {
                useranswers[count][0] = "";
            } else {
                useranswers[count][0] = groupoptions.getSelection().getActionCommand();
            }

            if (count == 8) {
                next.setEnabled(false);
                submit.setEnabled(true);
            }

            count++;
            start(count);
        } else if (ae.getSource() == lifeline) {
            if (count == 2 || count == 4 || count == 6 || count == 8 || count == 9) {
                opt2.setEnabled(false);
                opt3.setEnabled(false);
            } else {
                opt1.setEnabled(false);
                opt4.setEnabled(false);
            }
            lifeline.setEnabled(false);
        } else if (ae.getSource() == submit) {
            ans_given = 1;
            if (groupoptions.getSelection() == null) {
                useranswers[count][0] = "";
            } else {
                useranswers[count][0] = groupoptions.getSelection().getActionCommand();
            }

            for (int i = 0; i < useranswers.length; i++) {
                if (useranswers[i][0].equals(answers[i][1])) {
                    score += 10;
                }
            }
            setVisible(false);
            new Score(questions,answers,name,score);


        }
    }

    public void paint(Graphics g) {
        super.paint(g);

        String time = "Time left - " + timer + " seconds"; // 15
        g.setColor(Color.RED);
        g.setFont(new Font("Tahoma", Font.BOLD, 25));

        if (timer > 0) {
            g.drawString(time, 1100, 500);
        } else {
            g.drawString("Times up!!", 1100, 500);
        }

        timer--; // 14

        try {
            Thread.sleep(1000);
            repaint();
        } catch (Exception e) {
            e.printStackTrace();
        }

        if (ans_given == 1) {
            ans_given = 0;
            timer = 15;
        } else if (timer < 0) {
            timer = 15;
            opt1.setEnabled(true);
            opt2.setEnabled(true);
            opt3.setEnabled(true);
            opt4.setEnabled(true);

            if (count == 8) {
                next.setEnabled(false);
                submit.setEnabled(true);
            }
            if (count == 9) {
                if (groupoptions.getSelection() == null) {
                    useranswers[count][0] = "";
                } else {
                    useranswers[count][0] = groupoptions.getSelection().getActionCommand();
                }

                score = 0; // Reset the score
                for (int i = 0; i < useranswers.length; i++) {
                    if (useranswers[i][0].equals(answers[i][1])) {
                        score += 10;
                    }
                }
                setVisible(false);
                new Score(name, score);
            } else {
                if (groupoptions.getSelection() == null) {
                    useranswers[count][0] = "";
                } else {
                    useranswers[count][0] = groupoptions.getSelection().getActionCommand();
                }
                count++;
                start(count);
            }
        }

    }

    public void start(int count) {
        qno.setText("" + (count + 1) + ". ");
        question.setText(questions[count][0]);
        opt1.setText(questions[count][1]);
        opt1.setActionCommand(questions[count][1]);

        opt2.setText(questions[count][2]);
        opt2.setActionCommand(questions[count][2]);

        opt3.setText(questions[count][3]);
        opt3.setActionCommand(questions[count][3]);

        opt4.setText(questions[count][4]);
        opt4.setActionCommand(questions[count][4]);

        groupoptions.clearSelection();
    }

    public static void main(String[] args) {
        Sports sports = new Sports("Ayush");
    }
}
