import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class QuestionMakerWindow extends JFrame implements ActionListener { //should be going recursively, with ID increasing somehow
    JLabel heading;
    JLabel whatKind;
    JComboBox thisKind;
    JLabel howMany;
    JTextField thismany;
    JButton next;
    int ID = 0;
    String[] listOfTypes = {"Dropdown","Checkbox","Radio Buttons"};

    QuestionMakerWindow(){
        setSize(400,300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ID++;
        heading = new JLabel(" Question "+ID);
        whatKind = new JLabel(" What kind of options should be given?");
        thisKind = new JComboBox(listOfTypes);
        howMany = new JLabel("how many options?");
        thismany = new JTextField(3);
        next = new JButton("next");
        next.addActionListener(this);

        heading.setFont(new Font("PLAIN", Font.BOLD,30));
        whatKind.setFont(new Font("PLAIN",Font.PLAIN,20));

        setLayout(new GridLayout(3,1));
        add(heading);
        add(whatKind);
        add(thisKind);
        add(howMany);
        add(thismany);


    }
    @Override
    public void actionPerformed(ActionEvent e) {

    }
}
