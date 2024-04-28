import javax.swing.*;
import java.awt.*;
public class QuestionMakerWindow2 extends JFrame{
    Question ques = QuestionMakerWindow.getQues();
    JLabel qText = new JLabel("Question text:");
    JLabel aText = new JLabel("Options:");
    JTextField enText;
    JPanel forOptions;

QuestionMakerWindow2(){
    setSize(300,300);
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    enText = new JTextField(10);

    setLayout(new BorderLayout());
    add(QuestionMakerWindow.heading, BorderLayout.NORTH);
    add(qText, BorderLayout.CENTER);
    add(enText, BorderLayout.AFTER_LAST_LINE);
    }

}
