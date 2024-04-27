import javax.swing.*;

public class QuestionMakerWindow extends JFrame { //should be going recursively, with ID increasing somehow
    JLabel heading;
    JLabel whatKind;
    JComboBox thisKind;
    JLabel howMany;
    JButton next;
    int ID = 0;
    String[] listOfTypes = {"Dropdown","Checkbox","Radio Buttons"};

    QuestionMakerWindow(){
        setSize(600,600);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ID++;
        heading = new JLabel("Question "+ID);
        whatKind = new JLabel("what kind of options should be given?");
        thisKind = new JComboBox(listOfTypes);
        add(heading);
        add(whatKind);
        add(thisKind);

    }
}
