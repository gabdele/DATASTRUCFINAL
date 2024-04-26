import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class QuestionWindow extends JFrame implements ActionListener {
    JLabel heading;
    JLabel qText;
    JButton nextB;
    JButton prevB;
    ButtonGroup group;
    JPanel options = new JPanel();

    QuestionWindow(QuestionNode x){
        setSize(600,600);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Question y = x.getQuestion();
        heading = new JLabel("Question"+y.ID);
        heading.setFont(new Font("Serif", Font.BOLD,20));
        qText = new JLabel(y.getQuestionText());
        nextB = new JButton("next");
        prevB = new JButton("back");

        nextB.addActionListener(this);
        prevB.addActionListener(this);

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
                for (int i = 0; i<y.qOptions.size(); i++){
                    final JRadioButton btn = new JRadioButton(y.qOptions.get(i));
                    group.add(btn);
                    options.add(btn);
                }
                break;
        }
    }

    @Override
    public void actionPerformed(ActionEvent e) {

    }
}
