import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class QuestionMakerWindow extends JFrame implements ActionListener { //should be going recursively, with ID increasing somehow
    static Question ques;
    static JLabel heading;
    JLabel whatKind;
    JComboBox thisKind;
    JLabel howMany;
    JTextField thismany;
    JButton next;
    int ID = 0;
    String[] listOfTypes = {"Dropdown","Radio Buttons","Checkboxes"};
    public static Question getQues(){
        return ques;
    }

    QuestionMakerWindow(int id){
        setSize(400,300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.ID= id+1;
        heading = new JLabel(" Question "+ID);
        whatKind = new JLabel(" What kind of options should be given?");
        thisKind = new JComboBox(listOfTypes);
        howMany = new JLabel("how many options?");
        thismany = new JTextField(3);
        next = new JButton("next");
        next.addActionListener(this);

        heading.setFont(new Font("PLAIN", Font.BOLD,30));
        whatKind.setFont(new Font("PLAIN",Font.PLAIN,20));
        howMany.setFont(new Font("PLAIN",Font.PLAIN,20));

        setLayout(new FlowLayout());
        add(heading);
        add(whatKind);
        add(thisKind);
        add(howMany);
        add(thismany);
        add(next);
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        try{
            ques = new Question(ID,Integer.parseInt(thismany.getText()));
            switch(thisKind.getSelectedIndex()){
                case 0:
                    ques.setT(Question.optType.DROP);
                    break;
                case 1:
                    ques.setT(Question.optType.RADIO);
                    break;
                case 2:
                    ques.setT(Question.optType.CHECK);
                    break;
            }
            QuestionMakerWindow2 qmw = new QuestionMakerWindow2();
            qmw.setVisible(true);
            dispose();
        }catch(Exception exception){
            JOptionPane.showMessageDialog(null,
                "please enter a number");
        }

    }
}
