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

QuestionMakerWindow2(){
    setSize(300,300);
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    enText = new JTextField(20);
    JPanel theCenter = new JPanel();

    //makes a # of boxes relative to entered # of questions
    forOptions = new JPanel(new GridLayout(ques.respCounter.length, 1));
    for(int i= 0; i< ques.respCounter.length; i++){
        forOptions.add(new JTextField(10));
    }
    next = new JButton("Add new question");
    done = new JButton("Done");
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
    add(theCenter,BorderLayout.CENTER);
    add(forButtons,BorderLayout.SOUTH);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        Object source = e.getSource();
        if(source==next){

        }
    }
}
