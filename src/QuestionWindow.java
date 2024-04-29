import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
public class QuestionWindow extends JFrame implements ActionListener {
    Question y;
    JLabel heading;
    JLabel qText;
    JButton nextB;
    JButton prevB;
    JButton submitB;
    ButtonGroup group;
    JPanel options = new JPanel();
    JComboBox opt;

    QuestionWindow(QuestionNode x){
        setSize(600,600);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        y = x.getQuestion();
        heading = new JLabel("Question"+y.ID);
        heading.setFont(new Font("Serif", Font.BOLD,20));
        qText = new JLabel(y.getQuestionText());
        nextB = new JButton("next");
        prevB = new JButton("back");
        submitB = new JButton("submit");

        nextB.addActionListener(this);
        prevB.addActionListener(this);

        //y.qOptions
        switch (y.getT()){
            case DROP:
                String[] oList = new String[y.qOptions.size()];
                for (int i = 0; i<y.qOptions.size(); i++){
                    oList[i]=y.qOptions.get(i);
                }
                opt = new JComboBox(oList);
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
            default:
                System.out.println("an error has occurred");
                break;
        }
        //only have back button if there is a prev, only next if there is a next
        if(x!= QuestionLinkedList.head){
            add(prevB);
        }
        if(x!=QuestionLinkedList.tail){
            add(nextB);
        }else{
            add(submitB);
        }
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        JButton pressed = (JButton) e.getSource();
        if(pressed==nextB){
            switch (y.getT()){
                case DROP:
                    Menu.currentResp.add(y.ID,opt.getSelectedItem());
                    break;
                case CHECK:
                    Menu.currentResp.add(y.ID,)
                    break;
                case RADIO:

                    break;

        }
        else if(pressed==prevB){

        }
        else{ //if submit is pressed

        }
    }
}
