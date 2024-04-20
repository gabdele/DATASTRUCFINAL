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
                String[] oList = new String[y.qOptions.size()];
                for (int i = 0; i<y.qOptions.size(); i++){
                    oList[i]=y.qOptions.get(i);
                }
                JComboBox options = new JComboBox(oList);
                break;
            case CHECK:
                for (int i = 0; i<y.qOptions.size(); i++){
                    y.qOptions.get(i);
                    //do this next
                }
                break;
            case RADIO:

                break;
        }
    }
}
