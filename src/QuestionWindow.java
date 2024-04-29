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

        setLayout(new FlowLayout());
        add(heading);
        add(qText);

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
        add(options);
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
        if(pressed==nextB){ //next and back buttons log current responses
            try{
            switch (y.getT()){
                case DROP:
                    Menu.currentResp.remove(y.ID);
                    Menu.currentResp.add(y.ID,opt.getSelectedItem());
                    break;
                case CHECK:
                    ArrayList selectedOptions = new ArrayList<String>(1);
                    for (Component component : options.getComponents()) {
                        if (component instanceof JCheckBox & ((JCheckBox) component).isSelected()) {
                            selectedOptions.add(((JCheckBox) component).getText());
                        }
                    }
                    Menu.currentResp.remove(y.ID);
                    Menu.currentResp.add(y.ID,selectedOptions);
                    break;
//                case RADIO:
//                    Menu.currentResp.remove(y.ID);
//                    Menu.currentResp.add(y.ID,);
//                    break;
            }

        }catch(Exception exception){
                JOptionPane.showMessageDialog(null,
                        "please respond to question");
            }
        }
        else if(pressed==prevB){

        }
        else{ //if submit is pressed

        }
    }
}
