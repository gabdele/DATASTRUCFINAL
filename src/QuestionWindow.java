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
        JPanel options = new JPanel();
        //y.qOptions
        switch (y.t){
            case DROP:
                String[] oList = new String[y.qOptions.size()];
                for (int i = 0; i<y.qOptions.size(); i++){
                    oList[i]=y.qOptions.get(i);
                }
                JComboBox opt = new JComboBox(oList);
                options.add(opt);
                break;
            case CHECK:
                for (int i = 0; i<y.qOptions.size(); i++){
                    options.add(new JCheckBox(y.qOptions.get(i)));
                }
                break;
            case RADIO:
                ButtonGroup group = new ButtonGroup();
                for (int i = 0; i<y.qOptions.size(); i++){
                    group.add(new JRadioButton(y.qOptions.get(i)));

                }
                break;
        }
    }
}
