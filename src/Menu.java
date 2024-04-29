import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Menu extends JFrame implements ActionListener {
    static QuestionLinkedList survey = new QuestionLinkedList();
    JLabel heading;
    JButton create;
    JButton take;
    JButton results;
    Font PLAINFont = new Font("PLAIN",Font.PLAIN,20);
    Menu(){
        setSize(600,550);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        heading = new JLabel("Survey Application Menu");
        create = new JButton("create survey");
        take = new JButton("take survey");
        results = new JButton("results");

        heading.setFont(new Font("Serif", Font.BOLD,30));
        create.setFont(PLAINFont);
        take.setFont(PLAINFont);
        results.setFont(PLAINFont);

        create.addActionListener(this);
        take.addActionListener(this);
        results.addActionListener(this);

        setLayout(new GridLayout(4,1));
        add(heading);
        add(create);
        add(take);
        add(results);

    }
    public static void main(String[] args) {
        QuestionMakerWindow thiswindow = new QuestionMakerWindow(0);
        thiswindow.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        Object source = e.getSource();
        switch(source){
            case create:
                break;
            case take:
                break;
            case results:
                break;
        }
    }
}
