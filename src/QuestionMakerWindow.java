import javax.swing.*;

public class QuestionMakerWindow extends JFrame { //should be going recursively, with ID increasing somehow
    JLabel heading;
    JLabel whatKind;
    JComboBox thisKind;
    JLabel howMany;
    JButton next;
    int ID;

    QuestionMakerWindow(){
        heading = new JLabel("Question");
    }
}
