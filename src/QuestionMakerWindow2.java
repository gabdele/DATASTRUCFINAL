import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class QuestionMakerWindow2 extends JFrame implements ActionListener {
    Question ques = QuestionMakerWindow.getQues();
    JLabel qText = new JLabel("Question text:");
    JLabel aText = new JLabel("Options:");
    JTextField enText;
    JPanel forOptions;
    JPanel theCenter;
    JPanel forButtons;
    JButton next;
    JButton done;

    QuestionMakerWindow2() {
        if (ques.optNum<7){
            setSize(300, 300);
        } else{
            setSize(300,600); //grow to fit more questions
        }
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        enText = new JTextField(20);
        JPanel theCenter = new JPanel();

        //makes a # of boxes relative to entered # of questions
        forOptions = new JPanel(new GridLayout(ques.respCounter.length, 1));
        for (int i = 0; i < ques.respCounter.length; i++) {
            forOptions.add(new JTextField(10));
        }
        next = new JButton("Add new question");
        done = new JButton("Done");
        forButtons = new JPanel(new GridLayout(1,2));
        next.addActionListener(this);
        done.addActionListener(this);
        forButtons.add(done);
        forButtons.add(next);

        setLayout(new BorderLayout());
        add(QuestionMakerWindow.heading, BorderLayout.NORTH);
        theCenter.add(qText);
        theCenter.add(enText);
        theCenter.add(aText);
        theCenter.add(forOptions);
        add(theCenter, BorderLayout.CENTER);
        add(forButtons, BorderLayout.SOUTH);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        Object source = e.getSource();
        ques.setQuestionText(enText.getText());
        //iterates over options entries
        for (Component component : forOptions.getComponents()) {
            if (component instanceof JTextField) {
                ques.addOption(((JTextField) component).getText()); //add each entry to the qOptions part of question
            }
        }
        Menu.survey.insertNode(ques); //add this completed question to the linkedlist
        if (source == next) {
            QuestionMakerWindow QMW = new QuestionMakerWindow(ques.ID);
            QMW.setVisible(true);
            dispose();
        }
        else{ //if the user hits "done" send back to menu
            Menu menu = new Menu();
            menu.setVisible(true);
            dispose();
        }
    }
}
