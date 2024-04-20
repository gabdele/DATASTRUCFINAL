import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

public class QuestionWindow extends JFrame {
    JLabel heading;
    JLabel qText;
    JButton nextB;
    JButton prevB;

    QuestionWindow(QuestionNode x){
        Question y = x.getQuestion();
        heading = new JLabel("Question"+y.ID);
        heading.setFont(new Font("Serif", Font.BOLD,20));
        qText = new JLabel(y.getQuestionText());
        //y.qOptions
        switch (y.t){
            case DROP:
                for (int i = 0; i<y.qOptions.size(); i++){
                    y.qOptions.get(i);
                }
                break;
            case CHECK:

                break;
            case RADIO:

                break;
        }
    }
}
