import javax.swing.*;
import java.awt.*;
public class QuestionMakerWindow2 extends JFrame{
    Question ques = QuestionMakerWindow.getQues();
    JLabel qText = new JLabel("Question text:");
    JLabel aText = new JLabel("Options:");
    JTextField enText;
    JPanel forOptions;
    JPanel theCenter;

QuestionMakerWindow2(){
    setSize(300,300);
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    enText = new JTextField(10);
    JPanel theCenter = new JPanel();
    forOptions = new JPanel(new GridLayout(ques.respCounter.length, 1));
    for(int i= 0; i< ques.respCounter.length; i++){

    }


    setLayout(new BorderLayout());
    add(QuestionMakerWindow.heading, BorderLayout.NORTH);
    theCenter.add(qText);
    theCenter.add(enText);
    theCenter.add(forOptions);
    add(theCenter,BorderLayout.CENTER);
    }

}
