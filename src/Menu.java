import javax.swing.*;
import java.awt.*;

public class Menu extends JFrame {
    static QuestionLinkedList survey = new QuestionLinkedList();
    JLabel heading;
    JButton create;
    JButton take;
    JButton results;
    Menu(){
        setSize(600,550);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        heading = new JLabel("Survey Application Menu");
        create = new JButton("create survey");
        take = new JButton("take survey");

        heading.setFont(new Font("Serif", Font.BOLD,30));
        create.setFont(new Font("PLAIN",Font.PLAIN,20));
        take.setFont(new Font("PLAIN",Font.PLAIN,20));

    }
    public static void main(String[] args) {
        QuestionMakerWindow thiswindow = new QuestionMakerWindow(0);
        thiswindow.setVisible(true);
    }

}
