import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class Menu extends JFrame implements ActionListener {
    static QuestionLinkedList survey = new QuestionLinkedList();
    JLabel heading;
    JButton create;
    JButton take;
    JButton results;
    static ArrayList currentResp;
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
        Menu theMenu = new Menu();
        theMenu.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        Object source = e.getSource();
        if (source == create){
            if (survey.head ==null){
            QuestionMakerWindow thisWindow = new QuestionMakerWindow(0);
            thisWindow.setVisible(true);
            dispose();}else{
                JOptionPane.showMessageDialog(null,
                        "survey already created");
            }
        } else if (source == take){
            if (survey.head != null){
                survey.head.display();
            }else{
                JOptionPane.showMessageDialog(null,
                        "survey has not been created");
            }

        }else {//if source is result
            if (survey.head != null){
                TempResultWindow TRW = new TempResultWindow(survey.head);
                TRW.setVisible(true);
            }else{
                JOptionPane.showMessageDialog(null,
                        "survey has not been created");
            }
        }
    }
}
//public static void IterateThroughQWindows(){
//    survey.head.display();
//}