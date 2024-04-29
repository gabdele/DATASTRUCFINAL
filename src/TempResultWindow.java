import javax.swing.*;
import java.awt.*;

public class TempResultWindow extends JFrame {
    JLabel heading;
    JLabel Qtitle;
    TempResultWindow(QuestionNode Q){
        setSize(400,400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Question a=Q.getQuestion();
        heading = new JLabel("Question "+a.ID);
        heading.setFont(new Font("Serif", Font.BOLD,30));
        Qtitle = new JLabel(a.getQuestionText());


        setLayout(new GridLayout(4,1));
    }
}
