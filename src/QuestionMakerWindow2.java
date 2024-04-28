import javax.swing.*;
import java.awt.*;
public class QuestionMakerWindow2 extends QuestionMakerWindow{
    Question ques = QuestionMakerWindow.getQues();
    JLabel qText = new JLabel("Question text:");
    JLabel aText = new JLabel("Options:");
    JTextField enText;
    JPanel forOptions;

QuestionMakerWindow2(){

    setLayout(new FlowLayout());
    add(heading);
    add(qText);
    }

}
